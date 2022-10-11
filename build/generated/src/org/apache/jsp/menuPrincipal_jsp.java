package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import Modelo.Producto;
import java.util.List;
import ModeloDAO.ProductoDAO;

public final class menuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .navegacion{\n");
      out.write("            background: #838383;\n");
      out.write("        }\n");
      out.write("        .navbar-main .active,.nav>a:hover{\n");
      out.write("            text-decoration: underline wavy #ADD64F;\n");
      out.write("            text-underline-offset:9px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .tamaño_titulo_table{\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("        .tamaño{\n");
      out.write("            font-size: 13px;\n");
      out.write("            margin-left: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: 'Roboto', sans-serif;\n");
      out.write("            background: #eee;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        main{\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cards{\n");
      out.write("\n");
      out.write("            display:flex ;\n");
      out.write("            justify-content: space-center;\n");
      out.write("\n");
      out.write("            align-items: center;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            padding: 1em;\n");
      out.write("            max-width: 1100px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            min-height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cards * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card{\n");
      out.write("\n");
      out.write("            width: 17em;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: rgba(100,100,111,0.2);\n");
      out.write("            position: relative;\n");
      out.write("\n");
      out.write("            margin: 2em;\n");
      out.write("        }\n");
      out.write("        .card img{\n");
      out.write("            width: 16em;\n");
      out.write("            position: absolute;\n");
      out.write("            top:6em;\n");
      out.write("            right: -4em;\n");
      out.write("            filter: drop-shadow(0px 10px 25px rgba(0,0,0,0.5));\n");
      out.write("        }\n");
      out.write("        .content{\n");
      out.write("            padding: 1em;\n");
      out.write("        }\n");
      out.write("        .card h2{\n");
      out.write("            color: #fff;\n");
      out.write("            margin: 0 0 0 0.8em;\n");
      out.write("        }\n");
      out.write("        .banner{\n");
      out.write("            height: 15em;\n");
      out.write("            background: linear-gradient(90deg, #8ab92c 30%, #b7df5a 100%);\n");
      out.write("            padding-top: 3em;\n");
      out.write("            border-radius: 10px 10px 50% 50%;\n");
      out.write("        }\n");
      out.write("        .sizes ul{\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("        .sizes .size{\n");
      out.write("            display: inline-block;\n");
      out.write("            margin: 0 0.5em;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: 700;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .size:hover{\n");
      out.write("            color: #ccc;\n");
      out.write("        }\n");
      out.write("        .active{\n");
      out.write("            color: #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .details small{\n");
      out.write("            display: block;\n");
      out.write("            line-height: 24px;\n");
      out.write("            letter-spacing: 1px;\n");
      out.write("            font-size: 0.8em;\n");
      out.write("        }\n");
      out.write("        .cart{\n");
      out.write("            background: linear-gradient(to bottom, rgba(255,255,255,0.15) 0%, rgba(0,0,0,0.15) 100%), radial-gradient(at top center, rgba(255,255,255,0.40) 0%, rgba(0,0,0,0.40) 120%) #989898;\n");
      out.write("            background-blend-mode: multiply,multiply;\n");
      out.write("            padding: 1em 1.1em;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            width: 100%;\n");
      out.write("            border-radius: 2em;\n");
      out.write("            color: #fff;\n");
      out.write("            border:none;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            font-weight: 700;\n");
      out.write("            box-shadow: 0px 5px 15px rgba(0,0,0,0.7);\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cart:hover{\n");
      out.write("            background: linear-gradient(90deg, #333 0%, #111 100%);\n");
      out.write("        }\n");
      out.write("        h5{\n");
      out.write("            font-size: 13px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <!--Nav Bar-->\n");
      out.write("        <nav class=\"navegacion navbar  navbar-expand-lg navbar-light fixed-top bg-dark navbar-main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!--Logo-->\n");
      out.write("                <a href=\"#\" class=\"navbar-brand d-flex justify-content-center  align-items-center\">\n");
      out.write("                    <p class=\"m-0 fw-bold text-light fs-1\">Optica Coral</p>   \n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#mainNav\" aria-controls=\"mainNav\" aria-expanded=\"false\" aria-label=\"Barra de navegacion\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span> \n");
      out.write("                </button>\n");
      out.write("                <!--Items-->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"mainNav\">\n");
      out.write("                    <div class=\"nav ms-auto text-dark flex-column flex-lg-row\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link text-light \">Inicio</a>\n");
      out.write("                        <a href=\"#\" class=\"nav-link text-light \">Nosotros</a>\n");
      out.write("                        <a href=\"#\" class=\"nav-link text-light active\">Productos</a>\n");
      out.write("                        <a href=\"#\" class=\"nav-link text-light\">Contacto</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex align-items-center\">\n");
      out.write("                    <img class=\"rounded-circle me-2 ms-2\" src=\"https://drive.google.com/uc?export=download&id=1CILbuaRbzsrGzxGkxA1lRdmGBU55cueU\" width=\"80px\" height=\"80px\">\n");
      out.write("                    <div class=\"d-flex flex-column justify-content-center \">\n");
      out.write("                        <p class=\"m-0 fw-bold fs-6 text-light\">Hola, </p>\n");
      out.write("                        <div class=\"dropdown-center\">\n");
      out.write("                            <button class=\"btn btn-secondary btn-sm dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                Invitado\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Iniciar Sesion</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ms-3\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"50\" height=\"50\" fill=\"white\" class=\"bi bi-cart4\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path d=\"M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z\"/>\n");
      out.write("                        </svg>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            <section class=\"cards\">\n");
      out.write("                ");

                    ProductoDAO dao = new ProductoDAO();
                    List<Producto> list = dao.listar();
                    Iterator<Producto> iter = list.iterator();
                    Producto pro = null;
                    while (iter.hasNext()) {
                        pro = iter.next();
                
      out.write("\n");
      out.write("                <div class=\"card js-tilt\" data-tilt>\n");
      out.write("                    <div class=\"banner\">\n");
      out.write("                        <h2>");
      out.print( pro.getNombre());
      out.write("</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"https://drive.google.com/uc?export=download&id=");
      out.print( pro.getRuta());
      out.write("\" alt=\"\" class=\"pop\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"details\">\n");
      out.write("                            <h5>Detalles del Producto</h5>\n");
      out.write("                            <small>Color: Cherry Red</small>\n");
      out.write("                            <small>Material: Fibra de carbono</small>\n");
      out.write("                            <small>Product Code: ");
      out.print( pro.getCodigo());
      out.write(" </small>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sizes\">\n");
      out.write("                            <h5>Select Your size</h5>\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"size\">9</li>\n");
      out.write("                                <li class=\"size\">9.5</li>\n");
      out.write("                                <li class=\"size\">10</li>\n");
      out.write("                                <li class=\"size\">11</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"cart pop\">\n");
      out.write("                            <span>Agregar al Carrito</span>\n");
      out.write("                            <span>$");
      out.print( pro.getPrecio());
      out.write("</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
