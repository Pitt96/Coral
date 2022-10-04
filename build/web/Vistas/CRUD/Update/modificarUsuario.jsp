

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
        
        <div>
            
            
            <h1>Modificar Usuario</h1>
            <form action="Controlador">
                <%
                    UsuarioDAO udao=new UsuarioDAO();
                    String id = request.getAttribute("iduser").toString();
                    Usuario usua=new Usuario();
                    usua=(Usuario)udao.listar(id);
                    
                %>
                <label><%= usua%></label>
                ID:<br>
                <input type="text" name="txtCodigo" value="<%= id %>" ><br>
                DNI:<br>
                <input type="text" name="txtDni" value="<%= usua.getDni()%>"><br>
                Nombres:<br>
                <input type="text" name="txtNombre" value="<%= usua.getNombre() %>"><br>
                Apellidos:<br>
                <input type="text" name="txtApellido" value="<%= usua.getApellido() %>"><br>
                Direccion:<br>
                <input type="text" name="txtDireccion" value="<%= usua.getDireccion() %>"><br>
                Celular:<br>
                <input type="text" name="txtCelular" value="<%= usua.getCelular() %>"><br>
                Correo:<br>
                <input type="email" name="txtCorreo" value="<%= usua.getEmail() %>"><br>
                Edad:<br>
                <input type="number" name="txtEdad" value="<%= usua.getEdad() %>"><br>
                Cargo:<br>
                <input type="text" name="txtCargo" value="<%= usua.getCargo() %>"><br>
                Usuario:<br>
                <input type="text" name="txtUsuario" value="<%= usua.getUsuario() %>"><br>
                Contraseña:<br>
                <input type="password" name="txtContra" value="<%= usua.getPassword() %>"><br><br>
                <input type="submit" name="accion" value="Actualizar"><br>
                <a href="Controlador?accion=listarUsuario">Cancelar</a>
            </form>
        </div>
    </body>
</html>
