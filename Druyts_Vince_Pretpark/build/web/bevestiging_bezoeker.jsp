<%-- 
    Document   : bevestiging_bezoeker
    Created on : 26-mrt-2019, 10:39:27
    Author     : Vince
--%>

<%@page import="fact.it.www.beans.Bezoeker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Bevestiging registratie bezoeker </title>
    </head>
    <body>
        <h1> Welkom! </h1>
        <% Bezoeker bezoeker = (Bezoeker) request.getAttribute("bezoeker"); %>
        <p>
            <%if(bezoeker.getPretparkcode() == 1000) {%>
                Welkom <%=bezoeker.toString() %>! Je werd succesvol toegevoegd.
            <% }else {%>
                Welkom <%=bezoeker.toString() %>! Welkom op je eerste keer in het pretpark!
            <% }%>
        </p>
        <p>
            Je hebt op de vorige pagina gekozen voor de attractie <%=bezoeker.getWishlist()%>
        </p>
        <a href="nieuwe_bezoeker.jsp"> Meerdere bezoekers toevoegen </a>
    </body>
</html>
