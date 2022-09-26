

<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UsuarioDAO dao=new UsuarioDAO();
            String id = (String)request.getAttribute("iduser");
            Usuario usuario=(Usuario)dao.listar(id);
        %>
        <div>
            <h1>Modificar Usuario</h1>
            <form action="Controlador">
                ID:<br>
                <input type="text" name="txtCodigo" value="<%= usuario.getCodigo() %>" ><br>
                DNI:<br>
                <input type="text" name="txtDni" value="<%= usuario.getDni()%>"><br>
                Nombres:<br>
                <input type="text" name="txtNombre" value="<%= usuario.getNombre() %>"><br>
                Apellidos:<br>
                <input type="text" name="txtApellido" value="<%= usuario.getApellido() %>"><br>
                Direccion:<br>
                <input type="text" name="txtDireccion" value="<%= usuario.getDireccion() %>"><br>
                Celular:<br>
                <input type="text" name="txtCelular" value="<%= usuario.getCelular() %>"><br>
                Correo:<br>
                <input type="email" name="txtCorreo" value="<%= usuario.getEmail() %>"><br>
                Edad:<br>
                <input type="number" name="txtEdad" value="<%= usuario.getEdad() %>"><br>
                Cargo:<br>
                <input type="text" name="txtCargo" value="<%= usuario.getCargo() %>"><br>
                Usuario:<br>
                <input type="text" name="txtUsuario" value="<%= usuario.getUsuario() %>"><br>
                Contraseña:<br>
                <input type="password" name="txtContra" value="<%= usuario.getPassword() %>"><br><br>
                <input type="submit" name="accion" value="Actualizar"><br>
                <a href="Controlador?accion=listarUsuario">Cancelar</a>
            </form>
        </div>
    </body>
</html>
