<%@page pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Transfer</title>
</head>
<body>
<form method="post" action="${save}">
    <table>
        <thead>
        <tr>
            <th>Compte émetteur</th>
            <th>Compte bénéficiare</th>
            <th>Montant</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><select name="debitAccount">
                <option></option>
                <c:forEach var="account" items="${accounts}">
                    <option value="${account.id}">${account.owner.firstName} ${account.owner.lastName} - ${account.balance}€</option>
                </c:forEach>
            </select></td>
            <td><select name="creditAccount">
                <option></option>
                <c:forEach var="account" items="${accounts}">
                    <option value="${account.id}">${account.owner.firstName} ${account.owner.lastName} - ${account.balance}€</option>
                </c:forEach>
            </select></td>
            <td><input name="ammount" /></td>
            <td><input type="submit" /></td>
        </tr>
        </tbody>
    </table>
</form>
<a href="http://localhost:8080/Gradle___a3devjavaee___a3devjavaee_1_0_SNAPSHOT_war__exploded_/"> <input type="button" value="Accueil"></a>
<a href="http://localhost:8080/Gradle___a3devjavaee___a3devjavaee_1_0_SNAPSHOT_war__exploded_/person"> <input type="button" value="Personnes"></a>
<a href="http://localhost:8080/Gradle___a3devjavaee___a3devjavaee_1_0_SNAPSHOT_war__exploded_/bankaccount"> <input type="button" value="Comptes Bancaires"></a>
</body>
</body>
</html>
