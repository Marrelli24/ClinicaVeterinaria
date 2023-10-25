-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-10-2023 a las 23:01:35
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pfclinicaveterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `nombreAlterno` varchar(30) NOT NULL,
  `contactoAlternativo` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `nombre`, `apellido`, `telefono`, `direccion`, `nombreAlterno`, `contactoAlternativo`) VALUES
(1, 38299859, 'Ezequiel', 'Marrelli', 154100010, 'Av Sarmiento', 'Matias', 155202020),
(2, 31100100, 'Mauro', 'Alvarez', 154100010, 'Av Sarmiento', '', 155202020),
(3, 40123456, 'Juan', 'Martinez', 154999999, 'Av San Martin', '', 154888888),
(4, 41123456, 'Marcelo', 'Martinez', 154999999, 'Av San Martin', '', 154888888),
(5, 28888999, 'Julia', 'Marquez', 154222333, 'Av Belgrano', '', 154100200),
(6, 29888999, 'Julieta', 'Marquez', 154222333, 'Av Belgrano', '', 154100200),
(7, 18100100, 'Ezequiel', 'Lopez', 154151515, 'nose', '', 154987654),
(8, 19100100, 'Pedro', 'Lopez', 154151515, 'nose', '', 154987654),
(9, 26000000, 'Juan', 'Alvarez', 11111111, 'Av Sarmiento', '', 2222222),
(10, 1123234, 'Julia', 'Alvarez', 11111111, 'Av San Martin', '', 2222222),
(15, 1, 'Grupito', 'Java', 11111111, 'ArgentinaPrograma', 'Nadie', 2222222);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `NroFactura` int(11) NOT NULL,
  `idVisita` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`NroFactura`, `idVisita`) VALUES
(6, 1),
(5, 2),
(11, 3),
(7, 4),
(8, 5),
(9, 6),
(1, 7),
(4, 12),
(3, 14),
(2, 16),
(10, 17);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL,
  `alias` varchar(30) NOT NULL,
  `sexo` varchar(30) NOT NULL,
  `especie` varchar(30) NOT NULL,
  `raza` varchar(30) NOT NULL,
  `colorPelo` varchar(50) NOT NULL,
  `peso` double(6,3) NOT NULL,
  `pesoPromedio` double(6,3) NOT NULL,
  `fechaNac` date NOT NULL,
  `idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`idMascota`, `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `peso`, `pesoPromedio`, `fechaNac`, `idCliente`) VALUES
(1, 'Indiana', 'Hembra', 'Canino', 'Caniche', 'Blanco', 7.000, 7.167, '2016-06-15', 1),
(2, 'Catalina', 'Hembra', 'Felino', 'Calle', 'Naranja blanco', 6.000, 6.000, '2017-08-16', 4),
(3, 'Leo', 'Macho', 'Canino', 'Salchicha', 'Marron', 4.000, 4.000, '2018-08-16', 5),
(4, 'Messi', 'macho', 'Canino', 'Labrador', 'Negro', 15.500, 15.250, '2022-06-24', 1),
(5, 'Salchicha', 'Macho', 'Perro', 'Salchicha', 'Negro', 5.100, 5.267, '2022-03-23', 1),
(6, 'Peluca', 'Hembra', 'Canino', 'Caniche', 'Marron', 0.000, 0.000, '2023-10-01', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

CREATE TABLE `medicamento` (
  `idMedicamento` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `medicamento`
--

INSERT INTO `medicamento` (`idMedicamento`, `nombre`, `precio`) VALUES
(0, 'Ninguno', 0.00),
(1, 'Antiparasitario', 2500.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idTratamiento` int(11) NOT NULL,
  `descripcion` varchar(70) NOT NULL,
  `idMedicamento` int(11) NOT NULL,
  `importe` double NOT NULL,
  `tipodeTratamiento` varchar(30) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idTratamiento`, `descripcion`, `idMedicamento`, `importe`, `tipodeTratamiento`, `activo`) VALUES
(1, 'Baño', 0, 5000, 'Estetica', 1),
(2, 'Desparacitar', 1, 7000, 'Control', 1),
(3, 'Vacunacion', 1, 17000, 'Vacunacion', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idVisita` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `fechaVisita` date NOT NULL,
  `detalle` varchar(50) NOT NULL,
  `peso` double(6,3) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `pago` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`idVisita`, `idMascota`, `fechaVisita`, `detalle`, `peso`, `idTratamiento`, `pago`) VALUES
(1, 1, '2023-08-16', 'Baño', 8.000, 1, 0),
(2, 2, '2023-06-25', 'Desparacitar', 6.000, 2, 0),
(3, 3, '2023-06-25', 'Baño', 4.000, 2, 0),
(4, 4, '2023-08-16', 'Baño', 15.000, 1, 0),
(5, 1, '2023-09-20', 'Baño', 6.500, 1, 1),
(6, 1, '2023-09-25', 'Desparacitar', 7.000, 2, 1),
(7, 1, '2014-05-13', 'Baño', 7.500, 1, 0),
(12, 5, '2022-03-23', 'Baño', 5.100, 1, 0),
(14, 5, '2022-03-23', 'Control', 5.100, 2, 0),
(16, 5, '2021-10-18', 'Baño', 5.600, 1, 0),
(17, 4, '2023-10-17', 'Baño', 15.500, 1, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`NroFactura`),
  ADD KEY `idVisita` (`idVisita`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idMascota`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`idMedicamento`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idTratamiento`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idMascota` (`idMascota`),
  ADD KEY `idTratamiento` (`idTratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `NroFactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `medicamento`
--
ALTER TABLE `medicamento`
  MODIFY `idMedicamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`idVisita`) REFERENCES `visita` (`idVisita`);

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`),
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idTratamiento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
