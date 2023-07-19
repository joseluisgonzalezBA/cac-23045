<%-- 
    Document   : edicion
    Created on : 16/12/2022, 16:37:02
    Author     : jose
--%>

<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="/views/partials/header.jsp" %>

<%
    if (!(boolean)session.getAttribute("login")){
        response.sendRedirect("/"+proyecto);
    }

    Usuario actualUser = (Usuario) session.getAttribute("actualUser");
    username = actualUser.getUsername();
    String password = actualUser.getPassword();
    String name = actualUser.getName();
    String last_name = actualUser.getLast_name();
    String email = actualUser.getEmail();
    
%>


<main class="h-75 d-flex justify-content-center align-items-center bg-info-subtle">

    <form method="POST" action="/<%=proyecto%>/usuario/updateUser" class="h-75 w-50 p-4 d-flex flex-column justify-content-between rounded bg-acero" >
        
        <h2 class="text-center my-0">Mi cuenta</h2>
        
        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="username" class="formlabel">Usuario:</label>
            <input type="text" id="username" name="username" class="w-75 formcontrol rounded" value="<%= username%>" disabled>
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="password" class="formlabel">Clave:</label>
            <input type="password" id="password" name="password" class="w-75 formcontrol rounded" value="<%= password%>" >
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="name" class="formlabel">Nombre:</label>
            <input type="text" id="name" name="name" class="w-75 formcontrol rounded" value="<%= name%>" >
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="last_name" class="formlabel">Apellido:</label>
            <input type="text" id="last_name" name="last_name" class="w-75 formcontrol rounded" value="<%= last_name%>" >
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="email" class="formlabel">Email:</label>
            <input type="email" id="email" name="email" class="w-75 formcontrol rounded" value="<%= email%>" >
        </div>
        
        <div class="d-flex flex-row justify-content-between align-items-center">
            <button class="btn btn-success" type="submit">Modificar</button>
            <a href="/<%=proyecto%>/usuario/deleteUser" class="btn btn-danger">Eliminar</a>
            <a href="/<%=proyecto%>" class="btn btn-secondary">Inicio</a>
        </div>
            
    </form>
</main>


<%@include file="/views/partials/footer.jsp" %>
