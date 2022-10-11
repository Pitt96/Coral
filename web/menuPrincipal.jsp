<%-- 
    Document   : menuPrincipal
    Created on : 05/10/2022, 02:12:01 PM
    Author     : Pitt
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Producto"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <style>
        .navegacion{
            background: #838383;
        }
        .navbar-main .active,.nav>a:hover{
            text-decoration: underline wavy #ADD64F;
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

            margin: 0;
            font-family: 'Roboto', sans-serif;
            background: #eee;

        }
        main{
            margin-top: 50px;
        }

        .cards{

            display:flex ;
            justify-content: space-center;

            align-items: center;
            flex-wrap: wrap;
            padding: 1em;
            max-width: 1100px;
            margin: 0 auto;
            min-height: 100vh;
        }

        .cards * {
            box-sizing: border-box;

        }

        .card{

            width: 17em;
            background: #fff;
            border-radius: 10px;
            box-shadow: rgba(100,100,111,0.2);
            position: relative;

            margin: 2em;
        }
        .card img{
            width: 16em;
            position: absolute;
            top:6em;
            right: -4em;
            filter: drop-shadow(0px 10px 25px rgba(0,0,0,0.5));
        }
        .content{
            padding: 1em;
        }
        .card h2{
            color: #fff;
            margin: 0 0 0 0.8em;
        }
        .banner{
            height: 15em;
            background: linear-gradient(90deg, #8ab92c 30%, #b7df5a 100%);
            padding-top: 3em;
            border-radius: 10px 10px 50% 50%;
        }
        .sizes ul{
            list-style: none;
        }
        .sizes .size{
            display: inline-block;
            margin: 0 0.5em;
            cursor: pointer;
            font-weight: 700;
        }

        .size:hover{
            color: #ccc;
        }
        .active{
            color: #ccc;
        }

        .details small{
            display: block;
            line-height: 24px;
            letter-spacing: 1px;
            font-size: 0.8em;
        }
        .cart{
            background: linear-gradient(to bottom, rgba(255,255,255,0.15) 0%, rgba(0,0,0,0.15) 100%), radial-gradient(at top center, rgba(255,255,255,0.40) 0%, rgba(0,0,0,0.40) 120%) #989898;
            background-blend-mode: multiply,multiply;
            padding: 1em 1.1em;
            display: flex;
            justify-content: space-between;
            align-items: center;
            width: 100%;
            border-radius: 2em;
            color: #fff;
            border:none;
            margin: 0 auto;
            font-weight: 700;
            box-shadow: 0px 5px 15px rgba(0,0,0,0.7);
            cursor: pointer;
        }

        .cart:hover{
            background: linear-gradient(90deg, #333 0%, #111 100%);
        }
        h5{
            font-size: 13px;
            font-weight: bold;
        }
    </style>
    <body>
        <!--Nav Bar-->
        <nav class="navegacion navbar  navbar-expand-lg navbar-light fixed-top bg-dark navbar-main">
            <div class="container">
                <!--Logo-->
                <a href="#" class="navbar-brand d-flex justify-content-center  align-items-center">
                    <p class="m-0 fw-bold text-light fs-1">Optica Coral</p>   
                </a>
                <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#mainNav" aria-controls="mainNav" aria-expanded="false" aria-label="Barra de navegacion">
                    <span class="navbar-toggler-icon"></span> 
                </button>
                <!--Items-->
                <div class="collapse navbar-collapse" id="mainNav">
                    <div class="nav ms-auto text-dark flex-column flex-lg-row">
                        <a href="#" class="nav-link text-light ">Inicio</a>
                        <a href="#" class="nav-link text-light ">Nosotros</a>
                        <a href="#" class="nav-link text-light active">Productos</a>
                        <a href="#" class="nav-link text-light">Contacto</a>

                    </div>
                </div>
                <div class="d-flex align-items-center">
                    <img class="rounded-circle me-2 ms-2" src="https://drive.google.com/uc?export=download&id=1CILbuaRbzsrGzxGkxA1lRdmGBU55cueU" width="80px" height="80px">
                    <div class="d-flex flex-column justify-content-center ">
                        <p class="m-0 fw-bold fs-6 text-light">Hola, </p>
                        <div class="dropdown-center">
                            <button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Invitado
                            </button>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="ControladorLogin?accion=inicio">Iniciar Sesion</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="ms-3">
                        <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="white" class="bi bi-cart4" viewBox="0 0 16 16">
                        <path d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z"/>
                        </svg>
                    </div>
                </div>
            </div>

        </nav>
        <main>
            <section class="cards">
                <%
                    ProductoDAO dao = new ProductoDAO();
                    List<Producto> list = dao.listar();
                    Iterator<Producto> iter = list.iterator();
                    Producto pro = null;
                    while (iter.hasNext()) {
                        pro = iter.next();
                %>
                <div class="card js-tilt" data-tilt>
                    <div class="banner">
                        <h2><%= pro.getNombre()%></h2>
                    </div>
                    <img src="https://drive.google.com/uc?export=download&id=<%= pro.getRuta()%>" alt="" class="pop">
                    <div class="content">
                        <div class="details">
                            <h5>Detalles del Producto</h5>
                            <small>Color: Cherry Red</small>
                            <small>Material: Fibra de carbono</small>
                            <small>Product Code: <%= pro.getCodigo()%> </small>
                        </div>
                        <div class="sizes">
                            <h5>Select Your size</h5>
                            <ul>
                                <li class="size">9</li>
                                <li class="size">9.5</li>
                                <li class="size">10</li>
                                <li class="size">11</li>
                            </ul>
                        </div>
                        <button class="cart pop">
                            <span>Agregar al Carrito</span>
                            <span>$<%= pro.getPrecio()%></span>
                        </button>
                    </div>
                </div>
                <%}%>
            </section>
        </main>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>

    </body>
</html>
