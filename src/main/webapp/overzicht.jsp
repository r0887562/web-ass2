
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="domain.model.Game" %>
<%@ page import="domain.db.gameDB" %>

<% gameDB games = (gameDB) request.getAttribute("overzicht");%>

<!DOCTYPE html>
<html lang="nl">


<head>
    <meta charset="UTF-8">
    <title>Overzicht</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="CSS.css" >

</head>
<body>


<header>

<nav class="navbar">
    <ul>
        <li> <a href="index.jsp">Home</a></li>
        <li><a href="voeg toe.jsp">Voeg toe </a></li>
        <li><a href="overzicht">Overzicht</a></li>
    </ul>
</nav>


</header>

<main>
<p>
    Hier is een overzicht van games die aangeraden zijn om te spelen.

</p>

    <table>
        <tr>
            <th>Naam</th>
            <th>Developer</th>
            <th>IGN rating</th>
            <th>PEGI</th>
            <th>Pas aan</th>
            <th>Verwijder</th>
        </tr>
        <%for(Game g: games.getAlleGames()) {%>
        <tr>
            <td><%=g.getNaam()%></td>
            <td><%=g.getDevelopers()%></td>
            <td><%=g.getIGN()%></td>
            <td><%=g.getPegi()%></td>
            <td class="pas-aan">Pas aan</td>
            <td class="verwijder">X</td>
        </tr>
        <%}%>
    </table>
<p>De game met Hoogste IGN is <%= games.HoogsteIGN()%></p>
    <p>De game met de Laagste IGN is <%=games.LaagsteIGN()%></p>
</main>

<footer>Aaron Abbey | Webontwikkeling 2 - 2021-2022</footer>

</body>
</html>
