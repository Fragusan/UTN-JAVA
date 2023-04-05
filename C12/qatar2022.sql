-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-04-2023 a las 20:30:35
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `qatar2022`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `ID_departamento` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Presupuesto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`ID_departamento`, `Nombre`, `Presupuesto`) VALUES
(1, 'Ventas', 350000),
(2, 'Legales', 350000),
(3, 'Recursos Humanos', 450000),
(4, 'Programación', 5600000),
(5, 'Marketing', 640000),
(6, 'Learning', 7500000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `DNI` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Nacionalidad` int(11) DEFAULT NULL,
  `Departamento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`DNI`, `Nombre`, `Apellido`, `Nacionalidad`, `Departamento`) VALUES
(1145741, 'Isaac', ' Hernández', 34, 3),
(7853692, 'Jeffrey Preston', 'Bezos', 1, 1),
(16789456, 'Fernando Andrés', 'Burlando', 54, 2),
(38256321, 'Federico', 'Stauber', 49, 6),
(39789456, 'Lucas', 'Prado', 54, 6),
(74852431, 'Elon Reeve', 'Musk', 27, 4),
(87123852, 'William Henry III', 'Gates ', 1, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nacionalidad`
--

CREATE TABLE `nacionalidad` (
  `ID_nacionalidad` int(11) NOT NULL,
  `País` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `nacionalidad`
--

INSERT INTO `nacionalidad` (`ID_nacionalidad`, `País`) VALUES
(49, 'Alemania'),
(54, 'Argentina'),
(0, 'Canada'),
(34, 'España'),
(1, 'Estados Unidos de América'),
(8, 'Reino Unido de Gran Bretaña'),
(27, 'Sudáfrica');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`ID_departamento`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`DNI`),
  ADD KEY `Nacionalidad_idx` (`Nacionalidad`),
  ADD KEY `Departamento_idx` (`Departamento`);

--
-- Indices de la tabla `nacionalidad`
--
ALTER TABLE `nacionalidad`
  ADD PRIMARY KEY (`ID_nacionalidad`),
  ADD UNIQUE KEY `País_UNIQUE` (`País`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `Departamento` FOREIGN KEY (`Departamento`) REFERENCES `departamento` (`ID_departamento`) ON UPDATE CASCADE,
  ADD CONSTRAINT `Nacionalidad` FOREIGN KEY (`Nacionalidad`) REFERENCES `nacionalidad` (`ID_nacionalidad`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
