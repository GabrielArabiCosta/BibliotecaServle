<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gabri
  Date: 03/08/2022
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Lista de Livros</title>
</head>
<body>
<h1>Lista de Livros cadastrados</h1>
<h3>Livro de nome: ${nomeLivroSalvo} , cadastrado com sucesso!</h3>

<table border="solid">
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>CPF</th>
        <th>Email</th>
        <th>Idade</th>
        <th>Maior de idade</th>
    </tr>

</table>
<a href="cadastro-cliente.jsp">Cadastre um novo Cliente</a>
</body>
</html>
