<%-- 
    Document   : userCreado
    Created on : 16/12/2022, 15:59:47
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="/views/partials/header.jsp" %>

        <main class="h-75 d-flex justify-content-center align-items-center bg-info-subtle">
            
            <div class="h-50 w-50 d-flex flex-column justify-content-between align-items-center py-4 px-4 rounded bg-acero">
            
                <h2 class="mb-3">Informacion de registro:</h2>

                <%
                int estadoRegistro = (int) session.getAttribute("estadoRegistro");
                switch (estadoRegistro) {
                    case 1:
                        out.print("<h3 class='text-success'>¡Registro exitoso!</h3>");
                        break;

                    case 2:
                        out.print("<h3 class='text-danger'>¡El usuario ya existe!</h3>");
                        break;

                    default:
                        out.print("<h3 class='text-danger'>¡Registro fallido!</h3>");
                        break;
                }
                %>

                <a href="/<%=proyecto%>" class="btn btn-secondary">Inicio</a>
                
            </div>
            
        </main>


<%@include file="/views/partials/footer.jsp" %>