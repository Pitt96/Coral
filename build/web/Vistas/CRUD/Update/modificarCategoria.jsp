<%-- 
    Document   : modificarCategoria
    Created on : 08/10/2022, 10:49:16 PM
    Author     : Pitt
--%>

<%@page import="Modelo.CategoriaProducto"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
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
            <div class="card  p-3 col-sm-5 p-3" >
                <div class="mb-3">
                    <h1 class="text-center">Modificar Categoria Producto</h1>
                 </div>
                <div class="mb-2">
                    <%
                            CategoriaDAO udao=new CategoriaDAO();
                            String id = request.getAttribute("iduser").toString();
                            CategoriaProducto catP=new CategoriaProducto();
                            catP=(CategoriaProducto)udao.listar(id);

                        %>
                    <form action="ControladorCategoria" class="d-flex d-flex justify-content-around" >
                        
                       
                            <div class="mb-2">
                                <label for="txtCodigo">Codigo:</label>
                                <input type="text" name="txtCodigo"  value="<%= catP.getCodigo() %>" class="form-control" >
                            </div>
                           <!--<div class="mb-2">
                                <label for="formFileSm" class="form-label">Sube tu foto de perfil:</label>
                                <input class="form-control form-control-sm" id="formFileSm" name="fileFoto" type="file">
                             </div>-->
                            <div class="mb-2"> 
                                <label for="txtNombre">Nombre:</label>
                                <input type="text" name="txtNombre" value="<%= catP.getNombre() %>" class="form-control">
                            </div>    

                            <div class="mb-2"> 
                                
                                  <label for="txtDescripcion" class="form-label">Example textarea</label>
                                  <textarea class="form-control" name="txtDescripcion" rows="6" >
                                      <%= catP.getDescripcion() %>
                                  </textarea>
                            </div>

                            
                            <div class="mb-2">
                                <a class="btn btn-outline-secondary pe-5 ps-5" href="ControladorDirecciones?accion=listarCategoriaProduct" role="button">Cancelar</a>
                                <input class="btn btn-primary pe-5 ps-5" role="button" aria-disabled="true" type="submit" name="accion" value="Modificar">
                            </div>
                            
                        
                    </form>
                 </div>
            </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
    
    </body>
</html>
