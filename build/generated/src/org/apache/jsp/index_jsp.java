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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .navbar-main .active,.nav>a:hover{\n");
      out.write("            text-decoration: underline wavy #632ce7;\n");
      out.write("            text-underline-offset:9px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            \n");
      out.write("            margin-top: 180px;\n");
      out.write("            background-color: white !important;\n");
      out.write("        }\n");
      out.write("        .cajitas{\n");
      out.write("            width: 350px;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            background-color: black;\n");
      out.write("        }\n");
      out.write("        .cajitas .titulo{\n");
      out.write("            color: white;\n");
      out.write("            font-size: 17px;\n");
      out.write("        }\n");
      out.write("        .cajitas .info{\n");
      out.write("            color: white;\n");
      out.write("            font-size: 45px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <!--Nav Bar-->\n");
      out.write("        <nav class=\"navbar  navbar-expand-lg navbar-light fixed-top bg-light navbar-main\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!--Logo-->\n");
      out.write("                <a href=\"#\" class=\"navbar-brand d-flex justify-content-center align-items-center\">\n");
      out.write("                    <img  src=\"https://drive.google.com/uc?export=download&id=1iUow5ZygEqHMITfist1OW1-29wdKQGkA\" alt=\"\" width=\"100px\" height=\"50px\">\n");
      out.write("                    <p class=\"m-0 fw-bold\">Panel de administracion</p>   \n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#mainNav\" aria-controls=\"mainNav\" aria-expanded=\"false\" aria-label=\"Barra de navegacion\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span> \n");
      out.write("                </button>\n");
      out.write("                <!--Items-->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"mainNav\">\n");
      out.write("                    <div class=\"nav ms-auto text-dark flex-column flex-lg-row\">\n");
      out.write("                        <a href=\"ControladorDirecciones?accion=dashboard\" class=\"nav-link text-dark active\">Inicio</a>\n");
      out.write("                        <a href=\"Controlador?accion=listarUsuario\" class=\"nav-link text-dark \">Usuarios</a>\n");
      out.write("                        <a href=\"ControladorDirecciones?accion=listarProductos\" class=\"nav-link text-dark\">Productos</a>\n");
      out.write("                        <a href=\"ControladorDirecciones?accion=listarCategoriaProduct\" class=\"nav-link text-dark\">Categoria Productos</a>\n");
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
      out.write("                                Administrador\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Cerrar Sesión</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main class=\"main\">\n");
      out.write("            <div class=\"container mt-5 d-flex justify-content-center gap-5 flex-wrap\">\n");
      out.write("                <div class=\"cajitas d-flex gap-3 align-items-center\">\n");
      out.write("                    <div>\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"80\" height=\"80\" fill=\"white\" class=\"bi bi-people-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path d=\"M7 14s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1H7zm4-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z\"/>\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M5.216 14A2.238 2.238 0 0 1 5 13c0-1.355.68-2.75 1.936-3.72A6.325 6.325 0 0 0 5 9c-4 0-5 3-5 4s1 1 1 1h4.216z\"/>\n");
      out.write("                        <path d=\"M4.5 8a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5z\"/>\n");
      out.write("                        </svg>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex flex-column \">\n");
      out.write("                        <span class=\"titulo\">CLIENTES</span>\n");
      out.write("                        <span class=\"info\">16</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cajitas d-flex gap-3 align-items-center\">\n");
      out.write("                    <div>\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"80\" height=\"80\" fill=\"white\" class=\"bi bi-sunglasses\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path d=\"M3 5a2 2 0 0 0-2 2v.5H.5a.5.5 0 0 0 0 1H1V9a2 2 0 0 0 2 2h1a3 3 0 0 0 3-3 1 1 0 1 1 2 0 3 3 0 0 0 3 3h1a2 2 0 0 0 2-2v-.5h.5a.5.5 0 0 0 0-1H15V7a2 2 0 0 0-2-2h-2a2 2 0 0 0-1.888 1.338A1.99 1.99 0 0 0 8 6a1.99 1.99 0 0 0-1.112.338A2 2 0 0 0 5 5H3zm0 1h.941c.264 0 .348.356.112.474l-.457.228a2 2 0 0 0-.894.894l-.228.457C2.356 8.289 2 8.205 2 7.94V7a1 1 0 0 1 1-1z\"/>\n");
      out.write("                        </svg>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex flex-column \">\n");
      out.write("                        <span class=\"titulo\">PRODUCTOS</span>\n");
      out.write("                        <span class=\"info\">16</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cajitas d-flex gap-3 align-items-center\">\n");
      out.write("                    <div>\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"80\" height=\"80\" fill=\"white\" class=\"bi bi-currency-dollar\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path d=\"M4 10.781c.148 1.667 1.513 2.85 3.591 3.003V15h1.043v-1.216c2.27-.179 3.678-1.438 3.678-3.3 0-1.59-.947-2.51-2.956-3.028l-.722-.187V3.467c1.122.11 1.879.714 2.07 1.616h1.47c-.166-1.6-1.54-2.748-3.54-2.875V1H7.591v1.233c-1.939.23-3.27 1.472-3.27 3.156 0 1.454.966 2.483 2.661 2.917l.61.162v4.031c-1.149-.17-1.94-.8-2.131-1.718H4zm3.391-3.836c-1.043-.263-1.6-.825-1.6-1.616 0-.944.704-1.641 1.8-1.828v3.495l-.2-.05zm1.591 1.872c1.287.323 1.852.859 1.852 1.769 0 1.097-.826 1.828-2.2 1.939V8.73l.348.086z\"/>\n");
      out.write("                        </svg>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex flex-column \">\n");
      out.write("                        <span class=\"titulo\">TOTAL VENTAS</span>\n");
      out.write("                        <span class=\"info\">$18620</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
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
