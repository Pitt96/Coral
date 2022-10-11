<%-- 
    Document   : modificarProducto
    Created on : 09/10/2022, 05:00:19 PM
    Author     : Pitt
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CategoriaProducto"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="Modelo.Producto"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        <title>Modificar Producto</title>
    </head>
    <body>
        <section class="d-flex justify-content-center align-items-center mt-5">
            <div class="card  p-3 col-sm-4 p-3" >
                <div class="mb-3">
                    <h1 class="text-center">Modificar Producto</h1>
                </div>
                <div class="mb-2">
                    <%
                        ProductoDAO udao = new ProductoDAO();
                        String id = request.getAttribute("iduser").toString();
                        System.out.println("Id en modifcacion: " + id);
                        Producto pro = new Producto();
                        pro = (Producto) udao.listar(id);

                    %>
                    <form action="ControladorProducto" class="d-flex d-flex flex-column justify-content-around" >

                        
                            <div class="mb-2">
                                <label for="txtCodigo">Codigo:</label>
                                <input type="text" name="txtCodigo"  value="<%= pro.getCodigo()%>" class="form-control" >
                            </div>
                            <div class="mb-2"> 
                                <label for="txtImagen">Imagen:</label>
                                <input type="text" name="txtImagen" value="<%= pro.getRuta()%>" class="form-control">
                            </div>
                            <div class="mb-2"> 
                                <label for="txtNombre">Nombre:</label>
                                <input type="text" name="txtNombre" value="<%= pro.getNombre()%>" class="form-control">
                            </div>    

                            <div class="mb-2"> 
                                <label for="txtPrecio">Precio:</label>
                                <input type="number" name="txtPrecio" value="<%= pro.getPrecio()%>" class="form-control">
                            </div>

                            <div class="mb-2"> 
                                <label for="txtStock">Stock:</label>
                                <input type="text" name="txtStock" value="<%= pro.getStock()%>" class="form-control">
                            </div>
                            <div class="mb-2">
                                <label for="txtCat">Cargo:</label >
                                <select class="form-select" name="txtCat" id="rol">
                                    <option  value="0">Seleccione la Categoria</option>
                                    <%
                                        CategoriaDAO dao = new CategoriaDAO();
                                        List<CategoriaProducto> list = dao.listar();
                                        Iterator<CategoriaProducto> iter = list.iterator();
                                        CategoriaProducto cat = null;
                                        while (iter.hasNext()) {
                                            cat = iter.next();
                                    %>
                                    <option  value="<%= cat.getCodigo()%>"><%= cat.getNombre()%></option>
                                    <%}%>

                                </select>
                                <!--<label for="txtCargo">Cargo:</label >
                                <input type="text" name="txtCargo" class="form-control">-->
                            </div>
                            <div class="mb-2 d-flex justify-content-around">
                                <a class="btn btn-outline-secondary pe-5 ps-5" href="ControladorProducto?accion=listarProducto" role="button">Cancelar</a>
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
