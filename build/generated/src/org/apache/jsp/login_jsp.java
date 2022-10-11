package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css\">\n");
      out.write("        <<link rel=\"stylesheet\" href=\"estilosLogin.css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .navbar-main .active,.nav>a:hover{\n");
      out.write("            text-decoration: underline wavy #632ce7;\n");
      out.write("            text-underline-offset:9px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("\n");
      out.write("            margin-top: 180px;\n");
      out.write("            background-color: white !important;\n");
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
      out.write("            <section class=\"user\">\n");
      out.write("                <div class=\"user_options-container\">\n");
      out.write("                    <div class=\"user_options-text\">\n");
      out.write("                        <div class=\"user_options-unregistered\">\n");
      out.write("                            <h2 class=\"user_unregistered-title\">Don't have an account?</h2>\n");
      out.write("                            <p class=\"user_unregistered-text\">Banjo tote bag bicycle rights, High Life sartorial cray craft beer whatever street art fap.</p>\n");
      out.write("                            <button class=\"user_unregistered-signup\" id=\"signup-button\">Sign up</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"user_options-registered\">\n");
      out.write("                            <h2 class=\"user_registered-title\">Have an account?</h2>\n");
      out.write("                            <p class=\"user_registered-text\">Banjo tote bag bicycle rights, High Life sartorial cray craft beer whatever street art fap.</p>\n");
      out.write("                            <button class=\"user_registered-login\" id=\"login-button\">Login</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"user_options-forms\" id=\"user_options-forms\">\n");
      out.write("                        <div class=\"user_forms-login\">\n");
      out.write("                            <h2 class=\"forms_title\">Login</h2>\n");
      out.write("                            <form class=\"forms_form\">\n");
      out.write("                                <fieldset class=\"forms_fieldset\">\n");
      out.write("                                    <div class=\"forms_field\">\n");
      out.write("                                        <input type=\"email\" placeholder=\"Email\" class=\"forms_field-input\" required autofocus />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"forms_field\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Password\" class=\"forms_field-input\" required />\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("                                <div class=\"forms_buttons\">\n");
      out.write("                                    <button type=\"button\" class=\"forms_buttons-forgot\">Forgot password?</button>\n");
      out.write("                                    <input type=\"submit\" value=\"Log In\" class=\"forms_buttons-action\">\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"user_forms-signup\">\n");
      out.write("                            <h2 class=\"forms_title\">Sign Up</h2>\n");
      out.write("                            <form class=\"forms_form\">\n");
      out.write("                                <fieldset class=\"forms_fieldset\">\n");
      out.write("                                    <div class=\"forms_field\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Full Name\" class=\"forms_field-input\" required />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"forms_field\">\n");
      out.write("                                        <input type=\"email\" placeholder=\"Email\" class=\"forms_field-input\" required />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"forms_field\">\n");
      out.write("                                        <input type=\"password\" placeholder=\"Password\" class=\"forms_field-input\" required />\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("                                <div class=\"forms_buttons\">\n");
      out.write("                                    <input type=\"submit\" value=\"Sign up\" class=\"forms_buttons-action\">\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
