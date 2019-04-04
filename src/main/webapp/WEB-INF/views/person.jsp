<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 02/04/2019
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:url var="save" value="/person/save" />
<form method="post" action="${save}">
<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>Prénom</th>
            <th>Nom</th>
            <th>Email</th>
            <th>Date de naissance</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>*</td>
            <td><input name="firstName" /></td>
            <td><input name="lastName" /></td>
            <td><input name="email" /></td>
            <td><input name="birthDate" /></td>
            <td><input type="submit" /></td>
        </tr>
    <c:forEach var="person" items="${persons}" >
        <tr>
            <td>${person.id}</td>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.email}</td>
            <td>${person.birthDate}</td>
            <td>Modifier</td>
            <td>Supprimer</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</form>
<a href="http://localhost:8080/Gradle___a3devjavaee___a3devjavaee_1_0_SNAPSHOT_war__exploded_/bankaccount"> <input type="button" value="Comptes Bancaires"></a>
<a href="http://localhost:8080/Gradle___a3devjavaee___a3devjavaee_1_0_SNAPSHOT_war__exploded_/"> <input type="button" value="Accueil"></a>
</body>
</html>
