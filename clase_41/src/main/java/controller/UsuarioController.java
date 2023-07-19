/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import database.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author jose
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/usuario/*"})
public class UsuarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String action = request.getPathInfo();
            HttpSession session = request.getSession();
            
            UsuarioDAO udao = new UsuarioDAO();
            Usuario actualUser;
            String username;
            String password;
            String name;
            String last_name;
            String email;
            int regs_afectados;
            String proyecto = "homebanking";
            
            switch (action) {
                case "/loginUser":
                    username = request.getParameter("username");
                    password = request.getParameter("password");
                    
                    // verificar si existe el usuario y si coincide la clave
                    boolean existeUsuario = udao.login(username, password);
                    session.setAttribute("login", existeUsuario);
                    
                    if (existeUsuario){
                        session.setAttribute("username", username);
                        actualUser = udao.getUserByUsername(username);
                        session.setAttribute("actualUser", actualUser);
                    }
                    else {
                        session.setAttribute("username", "-");
                    }
                                        
                    response.sendRedirect("/"+proyecto+"/views/user.jsp");
                    break;
                    
                case "/logoutUser":
                    session.setAttribute("login", false);
                    session.setAttribute("username", "-");
                    session.setAttribute("actualUser", null);
                    response.sendRedirect("/"+proyecto);
                    break;
                    
                case "/createUser":
                    regs_afectados = 2; // Inicializo como si el usuario YA EXISTE
                    username = request.getParameter("username");
                    
                    // Si no existe el username en la BBDD, crea un nuevo registro
                    if(udao.getUserByUsername(username) == null){
                        password = request.getParameter("password");
                        name = request.getParameter("name");
                        last_name = request.getParameter("last_name");
                        email = request.getParameter("email");
                        
                        actualUser = new Usuario(username, password, name, last_name, email);
                        regs_afectados = udao.createUser(actualUser);
                    }
                    
                    session.setAttribute("estadoRegistro", regs_afectados);
                    response.sendRedirect("/"+proyecto+"/views/userCreado.jsp");
                    break;
                    
                case "/viewUser":
                    response.sendRedirect("/"+proyecto+"/views/edicion.jsp");
                    break;
                    
                case "/updateUser":
                    username = (String)session.getAttribute("username");
                    password = request.getParameter("password");
                    name = request.getParameter("name");
                    last_name = request.getParameter("last_name");
                    email = request.getParameter("email");
                    
                    actualUser = new Usuario(username, password, name, last_name, email);
                    regs_afectados = udao.updateUser(actualUser);
                    session.setAttribute("actualUser", actualUser);
                    
                    response.sendRedirect("/"+proyecto+"/views/edicion.jsp");
                    break;
                    
                case "/deleteUser":
                    username = (String) session.getAttribute("username");
                    
                    regs_afectados = udao.deleteUser(username);
                    session.setAttribute("login", false);
                    session.setAttribute("username", "-");
                    session.setAttribute("actualUser", null);
                    response.sendRedirect("/"+proyecto);
                    break;
            }
 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
