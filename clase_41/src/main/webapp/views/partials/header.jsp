<%-- 
    Document   : header
    Created on : 07/07/2023, 15:55:22
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String proyecto = "homebanking";
    boolean login;
    String username;
    
    if (session.isNew()){
        session.setAttribute("login", false);
        session.setAttribute("username", "-");
    }
    
    login = (boolean)session.getAttribute("login");
    username = (String)session.getAttribute("username");
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CaC - Homebanking</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="/<%=proyecto%>/css/estilos.css"/>
    </head>
    
<body class="vh-100">
    <header class="h-15 d-flex flex-row align-items-center bg-success">
        
        <a href="/<%=proyecto%>" class="w-25 h-100 text-center py-2">
            <img class="rounded h-100" src="/<%=proyecto%>/img/cac_logo.png" alt="cac_logo"/>
        </a>
        <h1 class="w-50 my-0 text-light text-center">Codo a Codo - Homebanking</h1>
        <div class="w-25 btn-group btn-group-sm px-3">
            <button class="btn btn-warning me-1"><%=username%></button>
            <a class="btn btn-secondary me-1 <%=login?"d-none":"d-initial"%>" href="/<%=proyecto%>/views/login.jsp">Ingresar</a>
            <a class="btn btn-secondary me-1 <%=login?"d-none":"d-initial"%>" href="/<%=proyecto%>/views/registro.jsp">Registrar</a>
            <a class="btn btn-secondary me-1 <%=!login?"d-none":"d-initial"%>" href="/<%=proyecto%>/usuario/viewUser">Mi cuenta</a>
            <a class="btn btn-secondary me-1 <%=!login?"d-none":"d-initial"%>" href="/<%=proyecto%>/usuario/logoutUser">Salir</a>
        </div>
    </header>

<!--
Operador ternario tiene 3 partes:
1) condicion
2) valor para la condicion verdadera
3) valor para la condicion falsa

variable = condicion ? valor_verdadero : valor_falso

-->