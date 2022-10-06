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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <style>
        .container_inputs{
            width: 300px;
        }
    </style>
    <body>
        <section class="d-flex justify-content-center align-items-center mt-5">
            <div class="card  p-3 col-sm-6 p-3" >
                <div class="mb-3">
                    <h1 class="text-center">Agregar Usuario</h1>
                 </div>
            
            <div class="mb-2">
            
                <form action="Controlador" class="d-flex d-flex justify-content-around">
                    <div class="container_inputs">
                        <div class="mb-2">
                            <label for="txtCodigo">Codigo:</label>
                            <input type="text" name="txtCodigo" class="form-control" placeholder="Ejem: U0006">
                        </div>
                        <div class="mb-2">
                                <label for="formFileSm" class="form-label">Sube tu foto de perfil:</label>
                                <input class="form-control form-control-sm" id="formFileSm" type="file">
                             </div>
                        <div class="mb-2">
                            <label for="txtDni">DNI:</label >
                            <input type="text" name="txtDni" class="form-control" placeholder="Ejem: 12345678">
                        </div>
                        <div class="mb-2">
                            <label for="txtNombre">Nombres:</label >
                            <input type="text" name="txtNombre" class="form-control" placeholder="Ejem: Nombre Nombre">
                        </div>
                        <div class="mb-2">
                            <label for="txtApellido">Apellidos:</label >
                            <input type="text" name="txtApellido" class="form-control"  placeholder="Ejem: Paterno Materno">
                        </div>
                        <div class="mb-2">
                            <label for="txtDireccion">Direccion:</label >
                            <input type="text" name="txtDireccion" class="form-control"  placeholder="Ejem: Las Palmeras de ñaña">
                        </div>
                        <div class="mb-2 mt-5">
                            <a class="btn btn-outline-secondary pe-5 ps-5"  href="Controlador?accion=listarUsuario" role="button">Cancelar</a>
                        </div>
                    </div>
                    <div class="container_inputs">
                        <div class="mb-2">
                            <label for="txtCelular">Celular:</label >
                            <input type="text" name="txtCelular" class="form-control"  placeholder="Ejem: 123 456 789">
                        </div>
                        <div class="mb-2">
                            <label for="txtCorreo">Correo:</label >
                            <input type="email" name="txtCorreo" class="form-control "  placeholder="Ejem: example@gmail.com" >
                        </div>
                        <div class="mb-2">
                            <label for="txtEdad">Edad:</label >
                            <input type="number" name="txtEdad" class="form-control"  placeholder="Ejem: 18" >
                        </div>
                        <div class="mb-2">
                            <label for="txtCargo">Cargo:</label >
                            <select class="form-select" name="txtCargo" id="rol">
                                <option selected value="0">Seleccione el cargo</option>
                                <option value="1">Super Administrador</option>
                                <option value="2">Administrador</option>
                                <option value="3">Cajero</option>
                              </select>
                            <!--<label for="txtCargo">Cargo:</label >
                            <input type="text" name="txtCargo" class="form-control">-->
                        </div>
                        <div class="mb-2">
                            <label for="txtUsuario">Usuario:</label >
                            <input type="text" name="txtUsuario" class="form-control"  placeholder="Ejem: user96" >
                        </div>
                        <div class="mb-2">
                            <label for="txtContra">Contraseña:</label >
                            <input type="password" name="txtContra" class="form-control"  placeholder="Ejem: contraseña" >
                        </div>
                        <div class="mb-2 d-flex justify-content-end mt-5">
                            <input class="btn btn-primary pe-5 ps-5" role="button" aria-disabled="true" type="submit" name="accion" value="Agregar">
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
