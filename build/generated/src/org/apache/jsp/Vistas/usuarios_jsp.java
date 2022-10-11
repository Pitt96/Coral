package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import Modelo.Usuario;
import ModeloDAO.UsuarioDAO;

public final class usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/responsive/2.3.0/css/responsive.dataTables.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/buttons/2.2.3/css/buttons.dataTables.min.css\">\n");
      out.write("     </head>\n");
      out.write("    <title>Usuarios</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("        .navbar-main .active,.nav>a:hover{\n");
      out.write("            text-decoration: underline wavy #632ce7;\n");
      out.write("            text-underline-offset:9px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .tamaño_titulo_table{\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("        .tamaño{\n");
      out.write("            font-size: 13px;\n");
      out.write("            margin-left: 5px;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            height: 100vh;\n");
      out.write("            margin-top: 100px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("    <!--Nav Bar-->\n");
      out.write("        <nav class=\"navbar  navbar-expand-lg navbar-light fixed-top bg-light navbar-main\">\n");
      out.write("            <div class=\"container-fluid\">\n");
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
      out.write("                    <div class=\"nav ms-auto text-dark flex-column flex-lg-row\">\n");
      out.write("                        <a href=\"ControladorDirecciones?accion=dashboard\" class=\"nav-link text-dark \">Inicio</a>\n");
      out.write("                        <a href=\"Controlador?accion=listarUsuario\" class=\"nav-link text-dark active\">Usuarios</a>\n");
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
      out.write("    <main class=\"container_main\">\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <h1>Usuarios</h1>\n");
      out.write("            <div class=\"container_agregar mb-2\">\n");
      out.write("                <a class=\"btn btn-success\" href=\"Controlador?accion=add\" role=\"button\"><span><i class=\"fa-sharp fa-solid fa-plus\"></i></span>Agregar</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <table id=\"tabla_usuarios\" class=\"table-sm-responsive table-striped display responsive nowrap\" style=\"width:100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">ID</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">DNI</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">NOMBRE</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">APELLIDO</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">DIRECCION</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">CELULAR</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">EMAIL</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">EDAD</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">CARGO</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">USUARIO</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">CLAVE</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">ACCIONES</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                <tbody >\n");
      out.write("                ");

                    UsuarioDAO dao = new UsuarioDAO();
                    List<Usuario> list = dao.listar();
                    Iterator<Usuario> iter = list.iterator();
                    Usuario user = null;
                    while (iter.hasNext()) {
                        user = iter.next();
                
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getCodigo());
      out.write("</td>\n");
      out.write("                        <!--<td class=\"tamaño\"><img src=\"ControladorIMG?codigo=");
      out.print( user.getCodigo());
      out.write("\" width=\"80px\" height=\"80px\"></td>-->\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getDni());
      out.write("</td>\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getNombre());
      out.write("</td>\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getApellido());
      out.write("</td>\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getDireccion());
      out.write("</td>\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getCelular());
      out.write("</td>\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getEmail());
      out.write("</td>\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getEdad());
      out.write("</td>\n");
      out.write("                        ");

                                    String cargo=user.getCargo();
                                    String cargo_Muestra="";
                                    if(cargo.equals("1")){
                                        cargo_Muestra="Super Administrador";
                                    }else if(cargo.equals("2")){
                                        cargo_Muestra="Administrador";
                                    }else if(cargo.equals("3")){
                                        cargo_Muestra="Cajero";
                                    }else{
                                        cargo_Muestra="Cargo no seleccionado";
                                    }

                                   
      out.write("\n");
      out.write("                        <td class=\"tamaño\">");
      out.print( cargo_Muestra);
      out.write("</td> \n");
      out.write("                        <td class=\"tamaño\">");
      out.print( user.getUsuario());
      out.write("</td>\n");
      out.write("                        <td><input  class=\"tamaño\" type=\"password\" value=\"");
      out.print( user.getPassword());
      out.write("\"></td>\n");
      out.write("                        <td class=\"d-flex flex-column justify-content-center align-items-center\">\n");
      out.write("                            <a class=\"pt-1 pb-1 ps-4 pe-4 mb-1 mt-1 bg-primary rounded-pill  text-decoration-none text-white fw-bold\" href=\"Controlador?accion=editar&id=");
      out.print( user.getCodigo());
      out.write("\">Editar</a>\n");
      out.write("                            <a class=\"pt-1 pb-1 ps-3 pe-3 mb-1 bg-danger rounded-pill text-decoration-none text-white fw-bold\" href=\"Controlador?accion=eliminar&id=");
      out.print( user.getCodigo());
      out.write("\">Eliminar</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                <tfoot>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">ID</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">DNI</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">NOMBRE</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">APELLIDO</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">DIRECCION</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">CELULAR</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">EMAIL</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">EDAD</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">CARGO</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">USUARIO</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">CLAVE</th>\n");
      out.write("                        <th class=\"tamaño_titulo_table\">ACCIONES</th>\n");
      out.write("                    </tr>\n");
      out.write("                </tfoot>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/responsive/2.3.0/js/dataTables.responsive.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/buttons/2.2.3/js/dataTables.buttons.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/buttons/2.2.3/js/buttons.html5.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/buttons/2.2.3/js/buttons.print.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('#tabla_usuarios').DataTable( {\n");
      out.write("                dom: 'Bfrtip',\n");
      out.write("                buttons: [\n");
      out.write("                     'excel','print'\n");
      out.write("                ]\n");
      out.write("            } );\n");
      out.write("        } )\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
