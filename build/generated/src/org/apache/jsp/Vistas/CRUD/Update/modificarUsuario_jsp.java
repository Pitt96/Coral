package org.apache.jsp.Vistas.CRUD.Update;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Usuario;
import ModeloDAO.UsuarioDAO;

public final class modificarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            UsuarioDAO dao=new UsuarioDAO();
            String id = (String)request.getAttribute("iduser");
            Usuario usua=(Usuario)dao.listar(id);
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1>Modificar Usuario</h1>\n");
      out.write("            <form action=\"Controlador\">\n");
      out.write("                ID:<br>\n");
      out.write("                <input type=\"text\" name=\"txtCodigo\" value=\"");
      out.print( usua.getCodigo() );
      out.write("\" ><br>\n");
      out.write("                DNI:<br>\n");
      out.write("                <input type=\"text\" name=\"txtDni\" value=\"");
      out.print( usua.getDni());
      out.write("\"><br>\n");
      out.write("                Nombres:<br>\n");
      out.write("                <input type=\"text\" name=\"txtNombre\" value=\"");
      out.print( usua.getNombre() );
      out.write("\"><br>\n");
      out.write("                Apellidos:<br>\n");
      out.write("                <input type=\"text\" name=\"txtApellido\" value=\"");
      out.print( usua.getApellido() );
      out.write("\"><br>\n");
      out.write("                Direccion:<br>\n");
      out.write("                <input type=\"text\" name=\"txtDireccion\" value=\"");
      out.print( usua.getDireccion() );
      out.write("\"><br>\n");
      out.write("                Celular:<br>\n");
      out.write("                <input type=\"text\" name=\"txtCelular\" value=\"");
      out.print( usua.getCelular() );
      out.write("\"><br>\n");
      out.write("                Correo:<br>\n");
      out.write("                <input type=\"email\" name=\"txtCorreo\" value=\"");
      out.print( usua.getEmail() );
      out.write("\"><br>\n");
      out.write("                Edad:<br>\n");
      out.write("                <input type=\"number\" name=\"txtEdad\" value=\"");
      out.print( usua.getEdad() );
      out.write("\"><br>\n");
      out.write("                Cargo:<br>\n");
      out.write("                <input type=\"text\" name=\"txtCargo\" value=\"");
      out.print( usua.getCargo() );
      out.write("\"><br>\n");
      out.write("                Usuario:<br>\n");
      out.write("                <input type=\"text\" name=\"txtUsuario\" value=\"");
      out.print( usua.getUsuario() );
      out.write("\"><br>\n");
      out.write("                Contraseña:<br>\n");
      out.write("                <input type=\"password\" name=\"txtContra\" value=\"");
      out.print( usua.getPassword() );
      out.write("\"><br><br>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Actualizar\"><br>\n");
      out.write("                <a href=\"Controlador?accion=listarUsuario\">Cancelar</a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
