

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
            <h1>Usuarios</h1>
            <a href="Controlador?accion=add">Agregar Nuevo</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>NOMBRE</th>
                        <th>APELLIDO</th>
                        <th>DIRECCION</th>
                        <th>CELULAR</th>
                        <th>EMAIL</th>
                        <th>EDAD</th>
                        <th>CARGO</th>
                        <th>USUARIO</th>
                        <th>CLAVE</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    UsuarioDAO dao=new UsuarioDAO();
                    List<Usuario>list=dao.listar();
                    Iterator<Usuario>iter=list.iterator();
                    Usuario user=null;
                    while(iter.hasNext()){
                        user=iter.next();
                %>
                <tbody>
                    <tr>
                        <td><%= user.getCodigo()%></td>
                        <td><%= user.getDni()%></td>
                        <td><%= user.getNombre()%></td>
                        <td><%= user.getApellido()%></td>
                        <td><%= user.getDireccion()%></td>
                        <td><%= user.getCelular()%></td>
                        <td><%= user.getEmail()%></td>
                        <td><%= user.getEdad()%></td>
                        <td><%= user.getCargo()%></td>
                        <td><%= user.getUsuario()%></td>
                        <td><input type="password" value="<%= user.getPassword()%>"></td>
                        <td>
                            <a href="Controlador?accion=editar&id=<%= user.getCodigo()%>">Editar</a>
                            <a href="Controlador?accion=eliminar&id=<%= user.getCodigo()%>">Eliminar</a>
                        </td>
                    </tr>
                  <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
