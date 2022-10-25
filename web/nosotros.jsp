

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <style>
        @import url("https://fonts.googleapis.com/css2?family=Poppins&display=swap");
        @import url("https://fonts.googleapis.com/css2?family=Open+Sans&display=swap");
        @import url("https://fonts.googleapis.com/css2?family=Lato:wght@900&display=swap");

        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        h1 {
            margin-top: 30px;
            margin-left: 15px;
            font-weight: lighter;
            font-size: 2.3em;
        }
        span {
            font-family: "Poppins", sans-serif;
        }
        span:nth-child(2) {
            text-decoration: line-through;
        }
        span:last-child {
            display: block;

        }
        span:last-child::after {
            content: ".";
            color: #cc0e74;
        }

        p {
            margin-top: 15px;
            margin-left: 15px;

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
                        <a href="./nosotros.jsp" class="nav-link text-light ">Nosotros</a>
                        <a href="./menuPrincipal" class="nav-link text-light active">Productos</a>
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
            <h1 class="titulo">
                <span>Acerca</span>
                <span>de</span>
                <span>Nosotros</span>
            </h1>
            <p class="titulo">
                Ópticas Coral, es una empresa líder en diseño, fabricación y distribución de lentes de moda, 
                deporte y lujo con altos estándares técnicos y estéticos, cuenta con una amplia variedad de marcas. 
                Además, es reconocida a nivel Lima Metropolitana contando con demás sucursales a nivel de Lima - Callao, 
                además de proporcionar una buena calidad y cumpliendo los estándares correspondientes para la obtención de una ISO tanto en servicio como en satisfacción.
            </p>
        </main>
    </body>
</html>
