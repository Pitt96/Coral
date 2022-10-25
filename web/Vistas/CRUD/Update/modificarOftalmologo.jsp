

<%@page import="Modelo.Oftalmologo"%>
<%@page import="ModeloDAO.OftalmologoDAO"%>
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
                    <h1 class="text-center">Modificar Oftalmologo</h1>
                </div>
                <div class="mb-2">
                    <%
                        OftalmologoDAO udao = new OftalmologoDAO();
                        String id = request.getAttribute("iduser").toString();
                        Oftalmologo usua = new Oftalmologo();
                        usua = (Oftalmologo) udao.listar(id);

                    %>
                    <form action="ControladorOftalmologo" class="d-flex d-flex justify-content-around" >

                        <div>
                            <div class="mb-2">
                                <label for="txtCodigo">Codigo:</label>
                                <input type="text" name="txtCodigo" class="form-control" placeholder="">
                            </div>
                            <div class="mb-2">
                                <label for="txtFecha">Horario:</label >
                                <input type="date" name="txtFecha" class="form-control" placeholder="">
                            </div>
                            <div class="mb-2">
                                <label for="txtEspecialidad">Especialidad:</label >
                                <input type="text" name="txtEspecialidad" class="form-control" placeholder="">
                            </div>
                            <div class="mb-2 mt-5">
                                <a class="btn btn-outline-secondary pe-5 ps-5"  href="ControladorOftalmologo?accion=listarOfalmologo" role="button">Cancelar</a>
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
