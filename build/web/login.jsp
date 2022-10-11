<%-- 
    Document   : login
    Created on : 11/10/2022, 04:42:05 AM
    Author     : Pitt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="estilosLogin.css"/>
        <title>Login</title>
    </head>
    <style>
        .navbar-main .active,.nav>a:hover{
            text-decoration: underline wavy #632ce7;
            text-underline-offset:9px;
            font-weight: bold;
        }
        body{
            margin-top: 280px;
            background-color: white !important;
            display: flex;
            align-items:center;
            justify-content:center;
        }
    </style>
    <body>
        
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
                        <a href="#" class="nav-link text-light ">Productos</a>
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
                                <li><a class="dropdown-item" href="#">Iniciar Sesion</a></li>
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
            <section class="user">
                <div class="user_options-container">
                    <div class="user_options-text">
                        <div class="user_options-unregistered">
                            <h2 class="user_unregistered-title">¿No tienes una cuenta?</h2>
                            <p class="user_unregistered-text">Ser parte de Optica Coral te brindara beneficios que pueden servirte a la hora de comprar</p>
                            <button class="user_unregistered-signup" id="signup-button">Registrarse</button>
                        </div>

                        <div class="user_options-registered">
                            <h2 class="user_registered-title">¿Tienes una cuenta?</h2>
                            <p class="user_registered-text">Inicia sesion para poder empezar a acumular puntos.</p>
                            <button class="user_registered-login" id="login-button">Iniciar Sesion</button>
                        </div>
                    </div>

                    <div class="user_options-forms" id="user_options-forms">
                        <div class="user_forms-login">
                            <h2 class="forms_title">Iniciar Sesion</h2>
                            <form class="forms_form" action="ControladorLogin" method="POST">
                                <fieldset class="forms_fieldset">
                                    <div class="forms_field">
                                        <input type="text" placeholder="Usuario" name="usu" class="forms_field-input" required autofocus />
                                    </div>
                                    <div class="forms_field">
                                        <input type="password" placeholder="Contraseña" name="pass" class="forms_field-input" required />
                                    </div>
                                </fieldset>
                                <div class="forms_buttons">
                                    <button type="button" class="forms_buttons-forgot">¿Olvidaste tu contraseña?</button>
                                    <input type="submit" name="accion" value="Ingresar" class="forms_buttons-action">
                                </div>
                            </form>
                        </div>
                        <div class="user_forms-signup">
                            <h2 class="forms_title">Registrarse</h2>
                            <form class="forms_form">
                                <fieldset class="forms_fieldset">
                                    <div class="forms_field">
                                        <input type="text" placeholder="Full Name" class="forms_field-input" required />
                                    </div>
                                    <div class="forms_field">
                                        <input type="email" placeholder="Email" class="forms_field-input" required />
                                    </div>
                                    <div class="forms_field">
                                        <input type="password" placeholder="Password" class="forms_field-input" required />
                                    </div>
                                </fieldset>
                                <div class="forms_buttons">
                                    <input type="submit" value="Registrarse" class="forms_buttons-action">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </main>
        <script src="animacionLogin.js"></script>




        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>

    </body>
</html>
