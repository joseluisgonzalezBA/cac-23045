<%-- 
    Document   : index
    Created on : 13/07/2022, 12:21:57
    Author     : jose
--%>


<%@include file="/views/partials/header.jsp" %>

<%
  if ((boolean)session.getAttribute("login")){
    response.sendRedirect("/"+proyecto);
  }  
%>

<main class="h-75 d-flex justify-content-center align-items-center bg-info-subtle">

    <form method="POST" action="/<%=proyecto%>/usuario/createUser" class="h-75 w-50 d-flex flex-column justify-content-between p-4 rounded bg-acero" >
        
        <h2 class="text-center my-0">Registro</h2>
        
        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="username" class="formlabel">Usuario:</label>
            <input type="text" id="username" name="username" class="w-75 formcontrol rounded">
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="password" class="formlabel">Clave:</label>
            <input type="password" id="password" name="password" class="w-75 formcontrol rounded">
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="name" class="formlabel">Nombre:</label>
            <input type="text" id="name" name="name" class="w-75 formcontrol rounded">
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="last_name" class="formlabel">Apellido:</label>
            <input type="text" id="last_name" name="last_name" class="w-75 formcontrol rounded">
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center h-10">
            <label for="email" class="formlabel">Email:</label>
            <input type="email" id="email" name="email" class="w-75 formcontrol rounded">
        </div>

        <div class="d-flex flex-row justify-content-between align-items-center">
            <button class="btn btn-success" type="submit">Registrar</button>
            <a href="/<%=proyecto%>" class="btn btn-secondary">Inicio</a>
        </div>
    </form>
</main>

<%@include file="/views/partials/footer.jsp" %>
