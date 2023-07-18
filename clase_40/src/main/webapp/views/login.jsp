<%-- 
    Document   : login
    Created on : 07/07/2023, 16:25:19
    Author     : jose
--%>

<%@include file="/views/partials/header.jsp" %>

    <main class="h-75 d-flex justify-content-center align-items-center bg-info-subtle">
        <form method="POST" action="/<%=proyecto%>/usuario/loginUser" class="h-50 w-25 d-flex flex-column py-4 px-4 rounded bg-acero" >

            <h2 class="text-center my-0 h-25">Login</h2>

            <div class="d-flex flex-row justify-content-between align-items-center h-25">
                <label for="username" class="formlabel">Usuario:</label>
                <input type="text" id="username" name="username" class="formcontrol w-75 rounded">
            </div>

            <div class="d-flex flex-row justify-content-between align-items-center h-25">
                <label for="password" class="formlabel">Clave:</label>
                <input type="password" id="password" name="password" class="formcontrol w-75 rounded">
            </div>

            <div class="d-flex flex-row justify-content-between align-items-center h-25">
                <button class="btn btn-success" type="submit">Ingresar</button>
                <a href="#" class="btn btn-secondary">Registrarme</a>
            </div>
        </form>
    </main>

<%@include file="/views/partials/footer.jsp" %>
