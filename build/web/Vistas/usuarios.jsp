

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
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
    <title>Usuarios</title>
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
                        <a href="ControladorDirecciones?accion=dashboard" class="nav-link text-dark ">Inicio</a>
                        <a href="Controlador?accion=listarUsuario" class="nav-link text-dark active">Usuarios</a>
                        <a href="ControladorDirecciones?accion=listarProductos" class="nav-link text-dark">Productos</a>
                        <a href="ControladorDirecciones?accion=listarCategoriaProduct" class="nav-link text-dark">Categoria Productos</a>
                        <a href="#" class="nav-link text-dark">Ventas</a>
                        <a href="#" class="nav-link text-dark">Clientes</a>
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
            <h1>Usuarios</h1>
            <div class="container_agregar mb-2">
                <a class="btn btn-success" href="Controlador?accion=add" role="button"><span><i class="fa-sharp fa-solid fa-plus"></i></span>Agregar</a>
            </div>
            

            <table id="tabla_usuarios" class="table-sm-responsive table-striped display responsive nowrap" style="width:100%">
                <thead>
                    <tr>
                        <th class="tamaño_titulo_table">ID</th>
                        <th class="tamaño_titulo_table">DNI</th>
                        <th class="tamaño_titulo_table">NOMBRE</th>
                        <th class="tamaño_titulo_table">APELLIDO</th>
                        <th class="tamaño_titulo_table">DIRECCION</th>
                        <th class="tamaño_titulo_table">CELULAR</th>
                        <th class="tamaño_titulo_table">EMAIL</th>
                        <th class="tamaño_titulo_table">EDAD</th>
                        <th class="tamaño_titulo_table">CARGO</th>
                        <th class="tamaño_titulo_table">USUARIO</th>
                        <th class="tamaño_titulo_table">CLAVE</th>
                        <th class="tamaño_titulo_table">ACCIONES</th>
                    </tr>
                </thead>
                
                <tbody >
                <%
                    UsuarioDAO dao = new UsuarioDAO();
                    List<Usuario> list = dao.listar();
                    Iterator<Usuario> iter = list.iterator();
                    Usuario user = null;
                    while (iter.hasNext()) {
                        user = iter.next();
                %>
                    <tr>
                        <td class="tamaño"><%= user.getCodigo()%></td>
                        <!--<td class="tamaño"><img src="ControladorIMG?codigo=<%= user.getCodigo()%>" width="80px" height="80px"></td>-->
                        <td class="tamaño"><%= user.getDni()%></td>
                        <td class="tamaño"><%= user.getNombre()%></td>
                        <td class="tamaño"><%= user.getApellido()%></td>
                        <td class="tamaño"><%= user.getDireccion()%></td>
                        <td class="tamaño"><%= user.getCelular()%></td>
                        <td class="tamaño"><%= user.getEmail()%></td>
                        <td class="tamaño"><%= user.getEdad()%></td>
                        <%
                                    String cargo=user.getCargo();
                                    String cargo_Muestra="";
                                    if(cargo.equals("1")){
                                        cargo_Muestra="Super Administrador";
                                    }else if(cargo.equals("2")){
                                        cargo_Muestra="Administrador";
                                    }else if(cargo.equals("3")){
                                        cargo_Muestra="Cajero";
                                    }else{
                                        cargo_Muestra="Cargo no seleccionado";
                                    }

                                   %>
                        <td class="tamaño"><%= cargo_Muestra%></td> 
                        <td class="tamaño"><%= user.getUsuario()%></td>
                        <td><input  class="tamaño" type="password" value="<%= user.getPassword()%>"></td>
                        <td class="d-flex flex-column justify-content-center align-items-center">
                            <a class="pt-1 pb-1 ps-4 pe-4 mb-1 mt-1 bg-primary rounded-pill  text-decoration-none text-white fw-bold" href="Controlador?accion=editar&id=<%= user.getCodigo()%>">Editar</a>
                            <a class="pt-1 pb-1 ps-3 pe-3 mb-1 bg-danger rounded-pill text-decoration-none text-white fw-bold" href="Controlador?accion=eliminar&id=<%= user.getCodigo()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
                <tfoot>
                    <tr>
                        <th class="tamaño_titulo_table">ID</th>
                        <th class="tamaño_titulo_table">DNI</th>
                        <th class="tamaño_titulo_table">NOMBRE</th>
                        <th class="tamaño_titulo_table">APELLIDO</th>
                        <th class="tamaño_titulo_table">DIRECCION</th>
                        <th class="tamaño_titulo_table">CELULAR</th>
                        <th class="tamaño_titulo_table">EMAIL</th>
                        <th class="tamaño_titulo_table">EDAD</th>
                        <th class="tamaño_titulo_table">CARGO</th>
                        <th class="tamaño_titulo_table">USUARIO</th>
                        <th class="tamaño_titulo_table">CLAVE</th>
                        <th class="tamaño_titulo_table">ACCIONES</th>
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
