<%-- 
    Document   : PainelUsuario
    Created on : 13/04/2017, 10:52:41
    Author     : sala304b
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Painel Usuário</h1>
        <hr>
       
        <h3>Bem Vindo humano!</h3>
        
        
        <a href="CadastroFilmes.jsp">Cadastro Filmes</a><br>
        <a href="CadastroGeneros.jsp">Cadastro Generos</a><br>
        <c:if test="${usuarioAutenticado.perfil == 'ADM'}">
        <a href="CadastroUsuario.jsp">Cadastro Usuarios</a><br><br>
        </c:if>
        <a href="javascript:history.back()">Voltar</a><br>
        <a href="Logout">Logout</a><br>
        
        
    </body>
</html>
