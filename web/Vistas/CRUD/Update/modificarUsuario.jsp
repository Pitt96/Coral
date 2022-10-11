

<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <section class="d-flex justify-content-center align-items-center mt-5">
            <div class="card  p-3 col-sm-6 p-3" >
                <div class="mb-3">
                    <h1 class="text-center">Modificar Usuario</h1>
                 </div>
                <div class="mb-2">
                    <%
                            UsuarioDAO udao=new UsuarioDAO();
                            String id = request.getAttribute("iduser").toString();
                            Usuario usua=new Usuario();
                            usua=(Usuario)udao.listar(id);

                        %>
                    <form action="Controlador" class="d-flex d-flex justify-content-around" >
                        
                        <div>
                            <div class="mb-2">
                                <label for="txtCodigo">Codigo:</label>
                                <input type="text" name="txtCodigo"  value="<%= usua.getCodigo() %>" class="form-control" >
                            </div>
                           <!--<div class="mb-2">
                                <label for="formFileSm" class="form-label">Sube tu foto de perfil:</label>
                                <input class="form-control form-control-sm" id="formFileSm" name="fileFoto" type="file">
                             </div>-->
                            <div class="mb-2"> 
                                <label for="txtDni">DNI:</label>
                                <input type="text" name="txtDni" value="<%= usua.getDni()%>" class="form-control">
                            </div>
                            <div class="mb-2"> 
                                <label for="txtNombre">Nombre:</label>
                                <input type="text" name="txtNombre" value="<%= usua.getNombre() %>" class="form-control">
                            </div>    

                            <div class="mb-2"> 
                                <label for="txtApellido">Apellido:</label>
                                <input type="text" name="txtApellido" value="<%= usua.getApellido() %>" class="form-control">
                            </div>

                            <div class="mb-2"> 
                                <label for="txtDireccion">Direccion:</label>
                                <input type="text" name="txtDireccion" value="<%= usua.getDireccion() %>" class="form-control">
                            </div>
                            <div class="mb-2">
                                <a class="btn btn-outline-secondary pe-5 ps-5" href="Controlador?accion=listarUsuario" role="button">Cancelar</a>
                            </div>
                        </div>
                        <div>
                            <div class="mb-2">
                                <label for="txtCelular">Celular:</label>
                                <input type="text" name="txtCelular" value="<%= usua.getCelular() %>" class="form-control">
                            </div>
                            <div class="mb-2">
                                <label for="txtCorreo">Correo:</label>
                                <input type="email" name="txtCorreo" value="<%= usua.getEmail() %>" class="form-control">
                            </div>
                            <div class="mb-2">
                               <label for="txtEdad">Edad:</label>
                                <input type="number" name="txtEdad" value="<%= usua.getEdad() %>" class="form-control">
                            </div>
                            <!--<div class="mb-2">
                                <% %>
                                <label for="txtCargo">Cargo:</label>
                                <input type="text" name="txtCargo" value="<%= "" %>" class="form-control">
                            </div>-->
                            <div class="mb-2">
                                <label for="txtCargo">Cargo:</label >
                                <select class="form-select" name="txtCargo" id="rol">
                                        <option <%= udao.obtenerCargo0(usua.getCargo()) %> value="0">Seleccione el cargo</option>
                                        <option <%= udao.obtenerCargo1(usua.getCargo()) %> value="1">Super Administrador</option>
                                        <option <%= udao.obtenerCargo2(usua.getCargo()) %> value="2">Administrador</option>
                                        <option <%= udao.obtenerCargo3(usua.getCargo()) %> value="3">Cajero</option>
                                 </select>
                                <!--<label for="txtCargo">Cargo:</label >
                                <input type="text" name="txtCargo" class="form-control">-->
                            </div>
                            <div class="mb-2">
                                <label for="txtUsuario">Usuario:</label>
                                <input type="text" name="txtUsuario" value="<%= usua.getUsuario() %>" class="form-control">
                            </div>
                            <div class="mb-2">
                                <label for="txtContra">Contraseña:</label>
                                <input type="password" name="txtContra" value="<%= usua.getPassword() %>" class="form-control">
                            </div>
                            <div class="mb-2 d-flex justify-content-end">
                                <input class="btn btn-primary pe-5 ps-5" role="button" aria-disabled="true" type="submit" name="accion" value="Actualizar">
                            </div>
                        </div>
                    </form>
                 </div>
            </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
    
    </body>
</html>
