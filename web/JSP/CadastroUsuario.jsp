<%-- 
    Document   : CadastroUsuario
    Created on : 15/05/2017, 08:10:35
    Author     : sala308b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Usuários</title>
    </head>
    <body>
        <h1>Cadastrar Usuario</h1>
        <hr>
        <a href="javascript:history.back()">Voltar</a><br><br>
        <form action="CadastroUsuario">
            <label>Nome:</label>
            <input type="text" name="txtNome"><br><br>
            
            <label>Login:</label>
            <input type="text" minlength="5" name="txtLogin"><br><br>
            
            <label>Senha:</label>
            <input type="password" minlength="6" maxlength="6" name="txtSenha"><br><br>
            
            <label>Perfil:</label><br>
            <select name="Perfil">
                <option value="Select">Selecione um perfil</option>>
                <option value="ADM">Administrador</option>
                <option value="FUNC">Funcionário</option>
            </select><br><br>
            
            <label>Status:</label><br>
            <input type="radio" name="Status" value="Ativo" checked="checked" />Ativo
            
            <input type="radio" name="Status" value="Inativo" />Inativo<br><br>
            
            <input type="submit" value="Cadastrar"><br>
        </form>
    </body>
</html>
