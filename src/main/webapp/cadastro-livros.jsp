<%--
  Created by IntelliJ IDEA.
  User: gabri
  Date: 30/07/2022
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Livro</title>
</head>
<body>


    <h1>Cadastro de Livro</h1>

        <form action="livro-servlet">
            <div>
                <label for="idAutor"> Autor:</label>
                <input type="text" id="idAutor" name="autor"></input>
            </div>
            <div>
                <label for="idNome"> Nome:</label>
                <input type="text" id="idNome" name="nome"></input>
            </div>
            <input type="submit" value="Enviar">
        </form>

</body>
</html>
