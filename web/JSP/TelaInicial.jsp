<%-- 
    Document   : TelaInicial
    Created on : 16/05/2017, 09:25:02
    Author     : sala308b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Locadora</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
       
        
        <h2>Locadora MALUCA</h2> 
        <hr><br>
        
        <form action="../Autenticar" method="post">
        
        <label>Login:</label>
            <input type="text" name="txtLogin"><br><br>
            
            <label>Senha:</label>
            <input type="password" name="txtSenha"><br><br>
            
            <input type="submit" value="Confirmar" name="btConfirmar">
            <input type="reset" value="Limpar" name="btLimpar">
            
        </form>    
            <hr>
            
    </body>
</html>
