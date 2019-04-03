<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 02/04/2019
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Solde</th>
        <th>Propriétaire</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="bankaccount" items="${bankaccount}" >
        <tr>
            <td>${bankaccount.balance}</td>
            <td>${bankaccount.owner.firstName}</td>
            <td>${bankaccount.owner.lastName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
