-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-09-2022 a las 02:19:24
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `opticacoralbd`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarUsuario` (IN `_cod` VARCHAR(10))   DELETE FROM usuario WHERE codigo=_cod$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarUsuario` (IN `_cod` VARCHAR(10), IN `_dni` CHAR(8), IN `_nombre` VARCHAR(20), IN `_apellido` VARCHAR(30), IN `_direccion` VARCHAR(60), IN `_cel` VARCHAR(9), IN `_correo` VARCHAR(30), IN `_edad` INT, IN `_cargo` VARCHAR(30), IN `_user` VARCHAR(60), IN `_contra` VARCHAR(30))   INSERT INTO usuario (codigo,dni,nombre,apellido,direccion,celular,email,edad,cargo,us,contra) VALUES (_cod,_dni,_nombre,_apellido,_direccion,_cel,_correo,_edad,_cargo,_user,_contra)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `modificarUsuario` (IN `_cod` VARCHAR(10), IN `_dni` CHAR(8), IN `_nombre` VARCHAR(20), IN `_apellido` VARCHAR(30), IN `_direccion` VARCHAR(60), IN `_cel` CHAR(9), IN `_correo` VARCHAR(30), IN `_edad` INT, IN `_cargo` VARCHAR(30), IN `_user` VARCHAR(60), IN `_contra` VARCHAR(30))   UPDATE usuario
SET
dni=_dni,nombre=_nombre,apellido=_apellido,direccion=_direccion,celular=_cel,
email=_correo,edad=_edad,cargo=_cargo,us=_user,contra=_contra WHERE codigo=_cod$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `readUsuarios` ()   SELECT * FROM usuario$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_productos`
--

CREATE TABLE `categoria_productos` (
  `codigoCategoria` varchar(10) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `descripcion` varchar(160) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  `imagen_url` varchar(100) NOT NULL,
  `codigoCategoria` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `codigo` varchar(10) NOT NULL,
  `dni` char(8) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `direccion` varchar(60) NOT NULL,
  `celular` char(9) NOT NULL,
  `email` varchar(30) NOT NULL,
  `edad` int(11) NOT NULL,
  `cargo` varchar(30) NOT NULL,
  `us` varchar(60) NOT NULL,
  `contra` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codigo`, `dni`, `nombre`, `apellido`, `direccion`, `celular`, `email`, `edad`, `cargo`, `us`, `contra`) VALUES
('U0001', '12345678', 'omar', 'ninaja', 'las malvinas', '123456789', 'omar@gmail.com', 25, 'cajero', 'omarNinaja', '123456789'),
('U0002', '96325874', 'adwar', 'gonzales', 'sjl', '963258741', 'adwar@gmail.com', 23, 'administrador', 'adwaradmi', '123456p'),
('U0003', '65432198', 'SEBAS', 'truco', 'comas', '951357632', 'sebas@gmail.com', 22, 'administrador', 'sebasAdmi', '123'),
('U0004', '91648237', 'omar', 'Casas', 'ÑAÑA', '973164825', 'omar26@gmail.com', 26, 'cajero', 'omar26', '0000');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria_productos`
--
ALTER TABLE `categoria_productos`
  ADD PRIMARY KEY (`codigoCategoria`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codigoCategoria` (`codigoCategoria`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `celular` (`celular`),
  ADD UNIQUE KEY `usuario` (`us`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codigoCategoria`) REFERENCES `categoria_productos` (`codigoCategoria`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
