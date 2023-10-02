<%-- 
    Document   : nieuwe_bezoeker
    Created on : 26-mrt-2019, 10:14:39
    Author     : Vince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Nieuwe bezoeker </title>
    </head>
    <body>
        <h1> Nieuwe bezoeker toevoegen </h1>
        <form action="MaakServlet">
            <p>
                <label for="voornaam"> Voornaam </label>
                <input type="text" name="voornaam" id="voornaam">
            </p>
            <p>
                <label for="familienaam"> Familienaam </label>
                <input type="text" name="familienaam" id="familienaam">
            </p>
            <p>
                <label for="keer"> Eerste keer hier? </label> 
                <input type="checkbox" name="eersteKeer" value="eersteKeer" id="eersteKeer">
            </p>
            <p>
                <label for="attractie"> Voeg een attractie toe aan je wishlist! </label>
                <select name="attractie">
                    <%String[] attracties = {"geen", "Python", "Revolution", "Dream catcher"};
                    for (int j = 0; j < attracties.length; j++) { %>
                    <option value= "<%=attracties[j]%>"><%=attracties[j]%></option>
                    <%}%>
                </select>
            </p>
            <p> <input type="submit" value="Registreer nieuwe bezoeker" name="bezoeker"> </p>
        </form>
        <a href="index.jsp"> Terug naar startpagina </a>
    </body>
</html>
