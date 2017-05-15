<%-- 
    Document   : CadastroFilmes
    Created on : 15/05/2017, 08:09:49
    Author     : sala308b
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="persistencia.GeneroDAO" id="dao"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Filmes</title>
    </head>
    <body>
        <h1>Cadastrar Filme</h1>
        <hr>
        <a href="javascript:history.back()">Voltar</a><br><br>
        
        <form action="ProdutoIncluir">
            
            <label>Título:</label><br>
            <input type="text" minlength="3" name="txtTitulo"><br><br>
            
            <select name="Genero">
            <option value="Select">Selecione um Genero</option>
            <c:forEach items="${dao.listar()}" var="genero">            
                <option value="${genero.codigo}">${genero.nome}</option>           
            </c:forEach>
            </select><br><br>
            
            <label>Sinopse:</label><br>
            <input type="text" name="txtSinopse"><br>
            
            <label>Diretor:</label><br>
            <input type="text" minlength="5" name="txtDiretor"><br>
            
            <label>Ano de Lançamento:</label><br>
            <input type="number" min="1895" max="2500" name="txtAnoLancamento"><br>
            
            <label>Status:</label><br>
            <input type="radio" name="Status" value="Ativo" checked="checked" />Ativo
            <input type="radio" name="Status" value="Inativo" />Inativo<br><br>
            <input type="submit" value="Cadastrar"><br>
        </form>
    </body>
</html>

