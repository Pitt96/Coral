package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .navbar-main .active,.nav>a:hover{\n");
      out.write("            text-decoration: underline wavy #632ce7;\n");
      out.write("            text-underline-offset:9px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body class=\"bg-light\">\n");
      out.write("        <!--Nav Bar-->\n");
      out.write("        <nav class=\"navbar  navbar-expand-md navbar-light fixed-top bg-light navbar-main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                 <!--Logo-->\n");
      out.write("                <a href=\"#\" class=\"navbar-brand d-flex justify-content-center align-items-center\">\n");
      out.write("                    <img  src=\"https://drive.google.com/uc?export=download&id=1iUow5ZygEqHMITfist1OW1-29wdKQGkA\" alt=\"\" width=\"100px\" height=\"50px\">\n");
      out.write("                    <p class=\"m-0 fw-bold\">Panel de administracion</p>   \n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#mainNav\" aria-controls=\"mainNav\" aria-expanded=\"false\" aria-label=\"Barra de navegacion\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span> \n");
      out.write("                </button>\n");
      out.write("                <!--Items-->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"mainNav\">\n");
      out.write("                    <div class=\"nav ms-auto text-dark flex-column flex-md-row\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link text-dark active\">Inicio</a>\n");
      out.write("                        <a href=\"Controlador?accion=listarUsuario\" class=\"nav-link text-dark\">Usuarios</a>\n");
      out.write("                        <a href=\"Controlador?accion=listarProductos\" class=\"nav-link text-dark\">Productos</a>\n");
      out.write("                        <a href=\"Controlador?accion=listarCategoriaProduct\" class=\"nav-link text-dark\">Categoria Productos</a>\n");
      out.write("                        <a href=\"#\" class=\"nav-link text-dark\">Ventas</a>\n");
      out.write("                        <a href=\"#\" class=\"nav-link text-dark\">Clientes</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                    <img class=\"rounded-circle me-2 ms-2\" src=\"https://drive.google.com/uc?export=download&id=1CILbuaRbzsrGzxGkxA1lRdmGBU55cueU\" width=\"80px\" height=\"80px\">\n");
      out.write("                    <div class=\"d-flex flex-column justify-content-center \">\n");
      out.write("                        <p class=\"m-0 fw-bold fs-6\">Hola, Daniel Laruzo</p>\n");
      out.write("                        <div class=\"dropdown-center\">\n");
      out.write("                            <button class=\"btn btn-secondary btn-sm dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                              Administrador\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                              <li><a class=\"dropdown-item\" href=\"#\">Cerrar Sesión</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\n");
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
