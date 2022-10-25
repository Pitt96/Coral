
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <title>JSP Page</title>
    </head>
    <style>
        .navbar-main .active,.nav>a:hover{
            text-decoration: underline wavy #632ce7;
            text-underline-offset:9px;
            font-weight: bold;
        }
        body{

            margin-top: 180px;
            background-color: white !important;
        }
        .cajitas{
            width: 350px;
            padding: 20px;
            border-radius: 20px;
            background-color: black;
        }
        .cajitas .titulo{
            color: white;
            font-size: 17px;
        }
        .cajitas .info{
            color: white;
            font-size: 45px;
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
                        <a href="ControladorDirecciones?accion=dashboard" class="nav-link text-dark active">Inicio</a>
                        <a href="Controlador?accion=listarUsuario" class="nav-link text-dark ">Usuarios</a>
                        <a href="ControladorDirecciones?accion=listarProductos" class="nav-link text-dark">Productos</a>
                        <a href="ControladorDirecciones?accion=listarCategoriaProduct" class="nav-link text-dark">Categoria Productos</a>
                        <a href="#" class="nav-link text-dark">Ventas</a>
                        <a href="./Vistas/clientes.jsp" class="nav-link text-dark">Clientes</a>
                        <a href="ControladorOftalmologo?accion=listarOftalmologo" class="nav-link text-dark">Oftalmologo</a>
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
        <main class="main">
            <div class="container mt-5 d-flex justify-content-center gap-5 flex-wrap">
                <div class="cajitas d-flex gap-3 align-items-center">
                    <div>
                        <svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" fill="white" class="bi bi-people-fill" viewBox="0 0 16 16">
                        <path d="M7 14s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1H7zm4-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
                        <path fill-rule="evenodd" d="M5.216 14A2.238 2.238 0 0 1 5 13c0-1.355.68-2.75 1.936-3.72A6.325 6.325 0 0 0 5 9c-4 0-5 3-5 4s1 1 1 1h4.216z"/>
                        <path d="M4.5 8a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5z"/>
                        </svg>
                    </div>
                    <div class="d-flex flex-column ">
                        <span class="titulo">CLIENTES</span>
                        <span class="info">16</span>
                    </div>
                </div>
                <div class="cajitas d-flex gap-3 align-items-center">
                    <div>
                        <svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" fill="white" class="bi bi-sunglasses" viewBox="0 0 16 16">
                        <path d="M3 5a2 2 0 0 0-2 2v.5H.5a.5.5 0 0 0 0 1H1V9a2 2 0 0 0 2 2h1a3 3 0 0 0 3-3 1 1 0 1 1 2 0 3 3 0 0 0 3 3h1a2 2 0 0 0 2-2v-.5h.5a.5.5 0 0 0 0-1H15V7a2 2 0 0 0-2-2h-2a2 2 0 0 0-1.888 1.338A1.99 1.99 0 0 0 8 6a1.99 1.99 0 0 0-1.112.338A2 2 0 0 0 5 5H3zm0 1h.941c.264 0 .348.356.112.474l-.457.228a2 2 0 0 0-.894.894l-.228.457C2.356 8.289 2 8.205 2 7.94V7a1 1 0 0 1 1-1z"/>
                        </svg>
                    </div>
                    <%
                        ProductoDAO proD = new ProductoDAO();
                        int cantP = proD.contarProductos();
                    %>
                    <div class="d-flex flex-column ">
                        <span class="titulo">PRODUCTOS</span>
                        <span class="info"><%= cantP%></span>
                    </div>
                </div>
                <div class="cajitas d-flex gap-3 align-items-center">
                    <div>
                        <svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" fill="white" class="bi bi-currency-dollar" viewBox="0 0 16 16">
                        <path d="M4 10.781c.148 1.667 1.513 2.85 3.591 3.003V15h1.043v-1.216c2.27-.179 3.678-1.438 3.678-3.3 0-1.59-.947-2.51-2.956-3.028l-.722-.187V3.467c1.122.11 1.879.714 2.07 1.616h1.47c-.166-1.6-1.54-2.748-3.54-2.875V1H7.591v1.233c-1.939.23-3.27 1.472-3.27 3.156 0 1.454.966 2.483 2.661 2.917l.61.162v4.031c-1.149-.17-1.94-.8-2.131-1.718H4zm3.391-3.836c-1.043-.263-1.6-.825-1.6-1.616 0-.944.704-1.641 1.8-1.828v3.495l-.2-.05zm1.591 1.872c1.287.323 1.852.859 1.852 1.769 0 1.097-.826 1.828-2.2 1.939V8.73l.348.086z"/>
                        </svg>
                    </div>
                    <div class="d-flex flex-column ">
                        <span class="titulo">TOTAL VENTAS</span>
                        <span class="info">$18620</span>
                    </div>
                </div>
                <%
                    UsuarioDAO udao=new UsuarioDAO();
                    int cantidadU=udao.contarUsuarios();
                %>
                <div class="cajitas d-flex gap-3 align-items-center">
                    <div>
                        <svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" fill="white" class="bi bi-person-workspace" viewBox="0 0 16 16">
                        <path d="M4 16s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1H4Zm4-5.95a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5Z"/>
                        <path d="M2 1a2 2 0 0 0-2 2v9.5A1.5 1.5 0 0 0 1.5 14h.653a5.373 5.373 0 0 1 1.066-2H1V3a1 1 0 0 1 1-1h12a1 1 0 0 1 1 1v9h-2.219c.554.654.89 1.373 1.066 2h.653a1.5 1.5 0 0 0 1.5-1.5V3a2 2 0 0 0-2-2H2Z"/>
                        </svg>
                    </div>
                    <div class="d-flex flex-column ">
                        <span class="titulo">USUARIOS</span>
                        <span class="info"><%= cantidadU%></span>
                    </div>
                </div>
            </div>
        </main>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
    </body>
</html>
