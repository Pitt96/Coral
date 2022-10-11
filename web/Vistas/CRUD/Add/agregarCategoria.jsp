<%-- 
    Document   : agregarCategoria
    Created on : 08/10/2022, 10:48:19 PM
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
        .container_inputs,.form-control{
            width: 300px;
        }
    </style>
    <body>
        <section class="d-flex justify-content-center align-items-center mt-5">
            <div class="card  p-3 col-sm-6 p-3" >
                <div class="mb-3">
                    <h1 class="text-center">Agregar Categoria</h1>
                </div>

                <div class="mb-2">

                    <form action="ControladorCategoria" class="d-flex  justify-content-center" >
                        <div class="container_inputs d-flex  flex-column justify-content-center align-items-center">
                            <div class="mb-2">
                                <label for="txtCodigo">Codigo:</label>
                                <input type="text" name="txtCodigo" class="form-control" placeholder="Ejem: 1001">
                            </div>
                            <div class="mb-2">
                                <label for="txtNombre">Nombres:</label >
                                <input type="text" name="txtNombre" class="form-control" placeholder="Ejem: Nombre Categoria">
                            </div>
                            <div class="mb-2">
                                <label for="txtDescripcion" class="form-label">Descripcion:</label>
                                <textarea class="form-control" name="txtDescripcion" rows="6" >
                                    
                                </textarea>
                            </div>

                            <div class="mb-2 d-flex gap-3">
                                <a class="btn btn-outline-secondary pe-5 ps-5"  href="ControladorDirecciones?accion=listarCategoriaProduct" role="button">Cancelar</a>
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
