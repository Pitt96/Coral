<%-- 
    Document   : agregarUsuario
    Created on : 24/09/2022, 02:22:26 AM
    Author     : Pitt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Agregar Usuario</h1>
            <form action="Controlador">
                ID:<br>
                <input type="text" name="txtCodigo"><br>
                DNI:<br>
                <input type="text" name="txtDni"><br>
                Nombres:<br>
                <input type="text" name="txtNombre"><br>
                Apellidos:<br>
                <input type="text" name="txtApellido"><br>
                Direccion:<br>
                <input type="text" name="txtDireccion"><br>
                Celular:<br>
                <input type="text" name="txtCelular"><br>
                Correo:<br>
                <input type="email" name="txtCorreo"><br>
                Edad:<br>
                <input type="number" name="txtEdad"><br>
                Cargo:<br>
                <input type="text" name="txtCargo"><br>
                Usuario:<br>
                <input type="text" name="txtUsuario"><br>
                Contraseña:<br>
                <input type="password" name="txtContra"><br><br>
                <input type="submit" name="accion" value="Agregar"><br>
            </form>
        </div>
        
    </body>
</html>
