
<html>
<head>
    <title>Voeg Toe</title>
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
 <form method="POST" action="overzicht" novalidate>

    <p class="class-for-submit"><label for="naam">Naam:</label>
        <input type="text" id="naam" name="naam" >
    </p>
    <p class="class-for-submit"><label for="developers">Developers:</label>
        <input type="text" id="developers" name="developer">
    </p>


    <p class="class-for-submit"><label for="IGN rating">IGN rating:</label>
        <select id="IGN rating" name="IGN">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
        </select>
    </p>

    <p class="class-for-submit"><label for="pegi">PEGI:</label>
        <select id="pegi" name="PEGI">
            <option value="3">3</option>
            <option value="7">7</option>
            <option value="12">12</option>
            <option value="16">16</option>
            <option value="18orOlder">&geq;18</option>
        </select>
    </p>


    <p class="add"><input type="submit" value="Voeg Toe"></p>

 </form>

</main>

    <footer>Aaron Abbey | Webontwikkeling 2 - 2021-2022</footer>


</body>
</html>
