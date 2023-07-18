<%-- 
    Document   : usuario
    Created on : 04/07/2022, 01:59:17
    Author     : jose
--%>

<%@include file="/views/partials/header.jsp" %>

        <main class="h-75 d-flex justify-content-center align-items-center bg-info-subtle">
            
            <div class="h-50 w-50 d-flex flex-column justify-content-between align-items-center py-4 px-4 rounded bg-acero">
                
                <h2 class="text-center my-0">Informacion de ingreso:</h2>

                <%
                login = (boolean) session.getAttribute("login");
                if (login) {
                %>
                    <h3 class="text-success my-0">Acceso permitido</h3>
                <%
                }
                else {
                %>
                    <h3 class="text-danger my-0">Acceso denegado</h3>
                <%
                } 
                %>
                <a href="/<%=proyecto%>" class="btn btn-secondary">Volver al INICIO</a>
            </div>
        </main>

 <%@include file="/views/partials/footer.jsp" %>
