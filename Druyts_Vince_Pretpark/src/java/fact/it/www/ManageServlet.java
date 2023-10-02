/* Dit is een onderdeel van het project voor Applicatieontwikkeling in Java
 * Druyts Vince
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www;

import fact.it.www.beans.Attractie;
import fact.it.www.beans.Bezoeker;
import fact.it.www.beans.Personeelslid;
import fact.it.www.beans.Persoon;
import fact.it.www.beans.Pretpark;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vince_Druyts
 */
@WebServlet(name = "ManageServlet", urlPatterns = {"/ManageServlet"})
public class ManageServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Personeelslid personeelslid1 = new Personeelslid("Vince", "Druyts");
            Personeelslid personeelslid2 = new Personeelslid("Jef", "Kabas");
            Bezoeker bezoeker1 = new Bezoeker("Vince", "Kabas");
            Bezoeker bezoeker2 = new Bezoeker("Niels", "Druyts");
            Persoon persoon1 = new Persoon("Niels", "Kabas");
            Pretpark pretpark1 = new Pretpark("Walibi");
            Attractie attractie1 = new Attractie("Millineum");
            Attractie attractie2 = new Attractie("Speedy Bob");
            Attractie attractie3 = new Attractie("Vliegende Hollander");
            pretpark1.voegAttractieToe(attractie1);
            pretpark1.voegAttractieToe(attractie2);
            pretpark1.voegAttractieToe(attractie3);
            bezoeker1.voegToeAanWishlist("Typhoon");
            bezoeker1.voegToeAanWishlist("Python");
            bezoeker2.voegToeAanWishlist("Joris en de draak");
            bezoeker2.voegToeAanWishlist("Revolution");
            bezoeker2.voegToeAanWishlist("Dream Catcher");
            bezoeker2.setPretparkcode(1);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Pretpark </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Personeel </h1>");
            out.println("<p>" + personeelslid1.toString() + "</p>");
            out.println("<p>" + personeelslid2.toString() + "</p>");
            out.println("<h1> Bezoekers </h1>");
            out.println("<p>" + bezoeker1.toString() + " met bijhorende wishlist: " + bezoeker1.getWishlist() + "</p>");
            out.println("<p>" + bezoeker2.toString() + " met bijhorende wishlist: " + bezoeker2.getWishlist() + "</p>");
            out.println("<h1> Personen </h1>");
            out.println("<p>" + persoon1.toString() + "</p>");
            out.println("<h1> Pretparken </h1>");
            out.println("<p>" + pretpark1.getNaam() + " heeft " + pretpark1.getAantalAttracties() + " attracties." + "</p>");
            out.println("<p> Met de volgende attracties: " + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
