package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nieuwe_005fbezoeker_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Nieuwe bezoeker </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Nieuwe bezoeker toevoegen </h1>\n");
      out.write("        <form action=\"MaakServlet\">\n");
      out.write("            <p>\n");
      out.write("                <label for=\"voornaam\"> Voornaam </label>\n");
      out.write("                <input type=\"text\" name=\"voornaam\" id=\"voornaam\">\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label for=\"familienaam\"> Familienaam </label>\n");
      out.write("                <input type=\"text\" name=\"familienaam\" id=\"familienaam\">\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label for=\"keer\"> Eerste keer hier? </label> \n");
      out.write("                <input type=\"checkbox\" name=\"eersteKeer\" value=\"eersteKeer\" id=\"eersteKeer\">\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label for=\"attractie\"> Voeg een attractie toe aan je wishlist! </label>\n");
      out.write("                <select name=\"attractie\">\n");
      out.write("                    ");
String[] attracties = {"-------------------", "Python", "Revolution", "Dream catcher"};
                    for (int j = 0; j < attracties.length; j++) { 
      out.write("\n");
      out.write("                    <option value= \"");
      out.print(attracties[j]);
      out.write('"');
      out.write('>');
      out.print(attracties[j]);
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </p>\n");
      out.write("            <p> <input type=\"submit\" value=\"Registreer nieuwe bezoeker\" name=\"bezoeker\"> </p>\n");
      out.write("        </form>\n");
      out.write("        <a href=\"index.jsp\"> Terug naar startpagina </a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
