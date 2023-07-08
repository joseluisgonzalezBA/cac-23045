<%-- 
    Document   : header
    Created on : 07/07/2023, 15:55:22
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CaC - Homebanking</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="/clase_38/css/estilos.css"/>
    </head>
<body class="vh-100">
    <header class="h-15 d-flex flex-row align-items-center bg-success">
        
        <a href="./" class="w-25 h-100 text-center py-2">
            <img class="rounded h-100" src="/clase_38/img/cac_logo.png" alt="cac_logo"/>
        </a>
        <h1 class="w-50 my-0 text-light text-center">Codo a Codo - Homebanking</h1>
        <div class="w-25 btn-group btn-group-sm px-3">
            <a href="/clase_38/views/login.jsp"><button class="btn btn-secondary me-1">Ingresar</button></a>
            <button class="btn btn-secondary me-1">Registrar</button>
            <button class="btn btn-secondary me-1">Mi cuenta</button>
            <button class="btn btn-secondary me-1">Salir</button>
        </div>
    </header>
