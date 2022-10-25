<%-- 
    Document   : clientes
    Created on : 25/10/2022, 06:32:28 AM
    Author     : Pitt
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        
        <link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.3.0/css/responsive.dataTables.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/buttons/2.2.3/css/buttons.dataTables.min.css">
     </head>
    <title>Clientes</title>
</head>
<style>
        .navbar-main .active,.nav>a:hover{
            text-decoration: underline wavy #632ce7;
            text-underline-offset:9px;
            font-weight: bold;
        }
        
        .tamaño_titulo_table{
            font-size: 15px;
        }
        .tamaño{
            font-size: 13px;
            margin-left: 5px;
        }
        body{
            height: 100vh;
            margin-top: 100px;
        }
    </style>
<body>
    <!--Nav Bar-->
        <nav class="navbar  navbar-expand-lg navbar-light fixed-top bg-light navbar-main">
            <div class="container-fluid">
                 <!--Logo-->
                <a href="#" class="navbar-brand d-flex justify-content-center align-items-center">
                    <img  src="https://drive.google.com/uc?export=download&id=1iUow5ZygEqHMITfist1OW1-29wdKQGkA" alt="" width="100px" height="50px">
                    <p class="m-0 fw-bold">Panel de administracion</p>   
                </a>
                <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#mainNav" aria-controls="mainNav" aria-expanded="false" aria-label="Barra de navegacion">
                    <span class="navbar-toggler-icon"></span> 
                </button>
                <!--Items-->
                <div class="collapse navbar-collapse" id="mainNav">
                    <div class="nav ms-auto text-dark flex-column flex-lg-row">
                        <a href="../index.jsp" class="nav-link text-dark ">Inicio</a>
                        <a href="./usuarios.jsp" class="nav-link text-dark ">Usuarios</a>
                        <a href="./producto.jsp" class="nav-link text-dark">Productos</a>
                        <a href="./categoria.jsp" class="nav-link text-dark">Categoria Productos</a>
                        <a href="#" class="nav-link text-dark">Ventas</a>
                        <a href="./Vistas/clientes.jsp" class="nav-link text-dark active">Clientes</a>
                        <a href="./oftalmologo.jsp" class="nav-link text-dark">Oftalmologo</a>
                    </div>
                </div>
                <div class="d-flex">
                    <img class="rounded-circle me-2 ms-2" src="https://drive.google.com/uc?export=download&id=1CILbuaRbzsrGzxGkxA1lRdmGBU55cueU" width="80px" height="80px">
                    <div class="d-flex flex-column justify-content-center ">
                        <p class="m-0 fw-bold fs-6">Hola, Daniel Laruzo</p>
                        <div class="dropdown-center">
                            <button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                              Administrador
                            </button>
                            <ul class="dropdown-menu">
                              <li><a class="dropdown-item" href="#">Cerrar Sesión</a></li>
                            </ul>
                         </div>
                    </div>
                    
                </div>
            </div>
            
        </nav>
    <main class="container_main">
        <div class="container mt-5">
            <h1>Clientes</h1>
            
            

            <table id="tabla_usuarios" class="table-sm-responsive table-striped display responsive nowrap" style="width:100%">
                <thead>
                    <tr>
                        <th class="tamaño_titulo_table">ID</th>
                        
                        <th class="tamaño_titulo_table">NOMBRE</th>
                        <th class="tamaño_titulo_table">APELLIDO</th>
                        <th class="tamaño_titulo_table">DIRECCION</th>
                        <th class="tamaño_titulo_table">CELULAR</th>
                        <th class="tamaño_titulo_table">EMAIL</th>
                        <th class="tamaño_titulo_table">EDAD</th>
                        <th class="tamaño_titulo_table">SEXO</th>
                        
                    </tr>
                </thead>
                
                <tbody >
                <%
                    ClienteDAO dao = new ClienteDAO();
                    List<Cliente> list = dao.listar();
                    Iterator<Cliente> iter = list.iterator();
                    Cliente cl = null;
                    while (iter.hasNext()) {
                        cl = iter.next();
                %>
                    <tr>
                        <td class="tamaño"><%= cl.getId()%></td>
                       <td class="tamaño"><%= cl.getNombre()%></td>
                        <td class="tamaño"><%= cl.getApellido()%></td>
                        <td class="tamaño"><%= cl.getDireccion()%></td>
                        <td class="tamaño"><%= cl.getCelular()%></td>
                        <td class="tamaño"><%= cl.getEmail()%></td>
                        <td class="tamaño"><%= cl.getEdad()%></td>
                        <td class="tamaño"><%= cl.getSexo()%></td>
                        
                    </tr>
                    <%}%>
                </tbody>
                <tfoot>
                    <tr>
                        <th class="tamaño_titulo_table">ID</th>
                        <th class="tamaño_titulo_table">NOMBRE</th>
                        <th class="tamaño_titulo_table">APELLIDO</th>
                        <th class="tamaño_titulo_table">DIRECCION</th>
                        <th class="tamaño_titulo_table">CELULAR</th>
                        <th class="tamaño_titulo_table">EMAIL</th>
                        <th class="tamaño_titulo_table">EDAD</th>
                        <th class="tamaño_titulo_table">SEXO</th>
                    </tr>
                </tfoot>
            </table>



        </div>
    </main>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
    
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/responsive/2.3.0/js/dataTables.responsive.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/dataTables.buttons.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/buttons.html5.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/buttons.print.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#tabla_usuarios').DataTable( {
                dom: 'Bfrtip',
                buttons: [
                     'excel','print'
                ]
            } );
        } )
    </script>
</body>
</html>
