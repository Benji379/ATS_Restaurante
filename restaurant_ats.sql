-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-12-2023 a las 05:50:15
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restaurant_ats`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ate.consumo`
--

CREATE TABLE `ate.consumo` (
  `N` int(11) NOT NULL,
  `idReserva` varchar(8) NOT NULL,
  `platillo` varchar(100) NOT NULL,
  `cantidad` int(8) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `ate.consumo`
--

INSERT INTO `ate.consumo` (`N`, `idReserva`, `platillo`, `cantidad`, `estado`, `fecha`, `hora`) VALUES
(10, '00000002', 'Arroz chaufa', 3, 'finalizado', '2023-12-01', '16:08:38'),
(11, '00000002', 'Lomo saltado', 1, 'finalizado', '2023-12-01', '16:08:46'),
(12, '00000004', 'Arroz con pollo', 2, 'finalizado', '2023-12-01', '21:19:18'),
(13, '00000001', 'Arroz con pollo', 5, 'finalizado', '2023-12-01', '21:19:22'),
(14, '00000001', 'Lomo saltado', 2, 'finalizado', '2023-12-01', '21:19:25'),
(15, '00000008', 'Arroz con pollo', 3, 'finalizado', '2023-12-03', '04:31:32'),
(16, '00000008', 'Milanesa', 4, 'finalizado', '2023-12-03', '04:31:35'),
(17, '00000008', 'Pollo a la brasa', 2, 'finalizado', '2023-12-03', '04:31:38'),
(18, '00000009', 'Lomo saltado', 5, 'finalizado', '2023-12-03', '09:18:16'),
(19, '00000009', 'Lomo saltado', 1, 'finalizado', '2023-12-03', '09:18:18'),
(20, '00000009', 'Papa a la huancaina', 2, 'finalizado', '2023-12-03', '09:18:21'),
(21, '00000010', 'Arroz con pollo', 2, 'finalizado', '2023-12-03', '09:39:12'),
(22, '00000010', 'Milanesa', 5, 'finalizado', '2023-12-03', '09:39:15'),
(23, '00000011', 'Milanesa', 3, 'finalizado', '2023-12-03', '10:25:58'),
(24, '00000011', 'Arroz con pollo', 1, 'finalizado', '2023-12-03', '10:26:04'),
(25, '00000011', 'Papa a la huancaina', 2, 'finalizado', '2023-12-03', '10:26:09'),
(26, '00000010', 'Papa a la huancaina', 4, 'finalizado', '2023-12-04', '23:03:02'),
(27, '00000012', 'Lomo saltado', 3, 'esperando', '2023-12-05', '23:30:14'),
(28, '00000012', 'Pollo a la brasa', 3, 'esperando', '2023-12-05', '23:30:17'),
(29, '00000012', 'Lomo saltado', 1, 'esperando', '2023-12-05', '23:30:19'),
(30, '00000013', 'Lomo saltado', 5, 'esperando', '2023-12-05', '23:30:31'),
(31, '00000013', 'Pollo a la brasa', 2, 'esperando', '2023-12-05', '23:30:34'),
(32, '00000013', 'Lomo saltado', 5, 'esperando', '2023-12-05', '23:30:37');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ate.mesas`
--

CREATE TABLE `ate.mesas` (
  `mesa` int(11) NOT NULL,
  `estado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `ate.mesas`
--

INSERT INTO `ate.mesas` (`mesa`, `estado`) VALUES
(1, 'disponible'),
(2, 'ocupado'),
(3, 'disponible'),
(4, 'disponible'),
(5, 'disponible'),
(6, 'disponible'),
(7, 'disponible'),
(8, 'disponible'),
(9, 'disponible'),
(10, 'disponible'),
(11, 'ocupado'),
(12, 'disponible'),
(13, 'disponible'),
(14, 'disponible'),
(15, 'disponible'),
(16, 'disponible'),
(17, 'disponible'),
(18, 'disponible'),
(19, 'disponible'),
(20, 'disponible'),
(21, 'disponible'),
(22, 'disponible'),
(23, 'disponible'),
(24, 'disponible'),
(25, 'disponible'),
(26, 'disponible'),
(27, 'disponible'),
(28, 'disponible'),
(29, 'disponible'),
(30, 'disponible'),
(31, 'disponible'),
(32, 'disponible'),
(33, 'disponible'),
(34, 'disponible'),
(35, 'disponible'),
(36, 'disponible'),
(37, 'disponible'),
(38, 'disponible'),
(39, 'disponible'),
(40, 'disponible'),
(41, 'disponible'),
(42, 'disponible'),
(43, 'disponible'),
(44, 'disponible'),
(45, 'disponible'),
(46, 'disponible'),
(47, 'disponible'),
(48, 'disponible'),
(49, 'disponible'),
(50, 'disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ate.reserva`
--

CREATE TABLE `ate.reserva` (
  `idReserva` varchar(8) NOT NULL,
  `dniCliente` int(8) NOT NULL,
  `mesa` int(11) DEFAULT NULL,
  `estado` varchar(20) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `ate.reserva`
--

INSERT INTO `ate.reserva` (`idReserva`, `dniCliente`, `mesa`, `estado`, `fecha`, `hora`) VALUES
('00000001', 47292383, 5, 'pagado', '2023-12-01', '16:07:23'),
('00000002', 71936801, 9, 'pagado', '2023-12-01', '16:08:21'),
('00000003', 70283923, 12, 'pagado', '2023-12-01', '20:19:52'),
('00000004', 70284642, 11, 'pagado', '2023-12-01', '20:21:09'),
('00000005', 45582393, 5, 'activo', '2023-12-02', '13:04:47'),
('00000006', 45582393, 5, 'activo', '2023-12-02', '13:04:48'),
('00000007', 45582393, 5, 'activo', '2023-12-02', '13:04:50'),
('00000008', 45343443, 6, 'finalizado', '2023-12-02', '16:12:10'),
('00000009', 47834788, 10, 'pagado', '2023-12-03', '09:17:54'),
('00000010', 48943894, 9, 'pagado', '2023-12-03', '09:39:08'),
('00000011', 47287327, 4, 'finalizado', '2023-12-03', '10:25:17'),
('00000012', 44747481, 2, 'activo', '2023-12-05', '23:29:47'),
('00000013', 71936801, 11, 'activo', '2023-12-05', '23:30:28');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `co.menu`
--

CREATE TABLE `co.menu` (
  `platillo` varchar(100) NOT NULL,
  `precio` decimal(8,2) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `co.menu`
--

INSERT INTO `co.menu` (`platillo`, `precio`, `estado`, `descripcion`, `fecha`, `hora`) VALUES
('Arroz con pollo', '19.00', 'no disponible', 'es ricoass', '2023-12-01', '20:24:52'),
('Arroz chaufa', '20.00', 'no disponible', 'es rico', '2023-11-28', '17:44:07'),
('Causa Limeña', '10.00', 'no disponible', 'es rico', '2023-11-28', '21:45:49'),
('Lomo saltado', '14.00', 'disponible', 'es riquisimo', '2023-11-28', '19:03:47'),
('Milanesa', '15.00', 'disponible', 'asdd', '2023-12-01', '20:26:34'),
('Papa a la huancaina', '21.00', 'disponible', 'es muy rico', '2023-12-01', '20:17:33'),
('Pollo a la brasa', '21.00', 'disponible', 'es rico', '2023-11-28', '19:04:52');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fin.factura`
--

CREATE TABLE `fin.factura` (
  `idFactura` varchar(8) NOT NULL,
  `idReserva` varchar(8) NOT NULL,
  `cajero` varchar(9) NOT NULL,
  `tipoPago` varchar(30) NOT NULL,
  `subTotal` double(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `fin.factura`
--

INSERT INTO `fin.factura` (`idFactura`, `idReserva`, `cajero`, `tipoPago`, `subTotal`, `total`, `fecha`, `hora`) VALUES
('00000001', '00000002', '12345678', 'efectivo', 74.00, '87.32', '2023-12-01', '16:09:49'),
('00000002', '00000003', 'A2343TOI', 'efectivo', 0.00, '0.00', '2023-12-02', '13:05:43'),
('00000003', '00000004', 'A2343TOI', 'efectivo', 38.00, '44.84', '2023-12-02', '13:15:04'),
('00000004', '00000001', '12345678', 'efectivo', 123.00, '145.14', '2023-12-02', '13:19:49'),
('00000005', '00000009', '12345678', 'efectivo', 126.00, '148.68', '2023-12-03', '09:22:56'),
('00000006', '00000010', '12345678', 'efectivo', 197.00, '232.46', '2023-12-04', '23:06:50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `re.notificaciones`
--

CREATE TABLE `re.notificaciones` (
  `N` int(11) NOT NULL,
  `IdEmpleado` varchar(9) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `visto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `re.notificaciones`
--

INSERT INTO `re.notificaciones` (`N`, `IdEmpleado`, `descripcion`, `fecha`, `hora`, `visto`) VALUES
(10, '12345678', 'Modifico un empleado', '2023-12-02', '13:19:17', 'si'),
(11, '12345678', 'Cerro una mesa', '2023-12-02', '13:19:50', 'si'),
(12, '12345678', 'Modifico un empleado', '2023-12-02', '13:22:48', 'si'),
(13, 'A2343TOI', 'Modifico un empleado', '2023-12-02', '14:22:32', 'si'),
(14, 'A2343TOI', 'Abrió una mesa', '2023-12-02', '16:12:10', 'si'),
(15, '12345678', 'Cerro una mesa', '2023-12-03', '04:32:00', 'si'),
(16, '12345678', 'Abrió una mesa', '2023-12-03', '04:32:00', 'si'),
(17, '12345678', 'Abrió una mesa', '2023-12-03', '09:17:55', 'si'),
(18, '12345678', 'Cerro una mesa', '2023-12-03', '09:21:04', 'si'),
(19, '12345678', 'Abrió una mesa', '2023-12-03', '09:21:04', 'si'),
(20, '12345678', 'Cerro una mesa', '2023-12-03', '09:22:56', 'si'),
(21, '12345678', 'Abrió una mesa', '2023-12-03', '09:39:08', 'si'),
(22, '12345678', 'Abrió una mesa', '2023-12-03', '10:25:17', 'si'),
(23, '12345678', 'Cerro una mesa', '2023-12-03', '10:27:40', 'si'),
(24, '12345678', 'Abrió una mesa', '2023-12-03', '10:27:40', 'si'),
(25, '12345678', 'Cerro una mesa', '2023-12-04', '23:03:37', 'si'),
(26, '12345678', 'Abrió una mesa', '2023-12-04', '23:03:37', 'si'),
(27, '12345678', 'Cerro una mesa', '2023-12-04', '23:06:51', 'si'),
(28, '12345678', 'Abrió una mesa', '2023-12-05', '23:29:47', 'si'),
(29, '12345678', 'Abrió una mesa', '2023-12-05', '23:30:29', 'si');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `us.chat`
--

CREATE TABLE `us.chat` (
  `N` int(11) NOT NULL,
  `idEmisor` varchar(9) NOT NULL,
  `idReceptor` varchar(9) NOT NULL,
  `mensaje` varchar(1000) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `us.chat`
--

INSERT INTO `us.chat` (`N`, `idEmisor`, `idReceptor`, `mensaje`, `fecha`, `hora`) VALUES
(1, '12345678', 'A2343TOI', 'hola', '2023-12-02', '11:00:42'),
(2, '12345678', 'M2348ESA', 'como estás sofi?', '2023-12-02', '11:05:18'),
(3, '12345678', 'M2348ESA', 'todo bien?', '2023-12-02', '11:05:26'),
(4, 'M2348ESA', '12345678', 'si', '2023-12-02', '11:06:57'),
(5, 'A2343TOI', '12345678', 'hola como estas Benjamin', '2023-12-03', '09:29:41'),
(6, '12345678', 'A2343TOI', 'estoy muy bien', '2023-12-03', '09:29:52'),
(7, '12345678', 'A2343TOI', 'hola', '2023-12-03', '10:32:54'),
(8, 'A2343TOI', '12345678', 'que pidieron hoy?', '2023-12-03', '10:33:12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `us.empleado`
--

CREATE TABLE `us.empleado` (
  `idEmpleado` varchar(9) NOT NULL,
  `idPersona` int(8) NOT NULL,
  `correo` varchar(150) NOT NULL,
  `contraseña` varchar(20) NOT NULL,
  `cargo` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `us.empleado`
--

INSERT INTO `us.empleado` (`idEmpleado`, `idPersona`, `correo`, `contraseña`, `cargo`, `estado`) VALUES
('12345678', 71936801, 'atochelopez@gmail.com', '123', 'administrador', 'activo'),
('A2343TOI', 43489323, 'ne@gmail.com', '123', 'administrador', 'activo'),
('M2348ESA', 48943894, 'chela@gmail.com', '123', 'cocina', 'activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `us.persona`
--

CREATE TABLE `us.persona` (
  `idPersona` int(8) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `us.persona`
--

INSERT INTO `us.persona` (`idPersona`, `nombre`, `apellido`, `fecha`, `hora`) VALUES
(43489323, 'ANGELA', 'TOLEDO CAUTI', '2023-11-28', '17:37:30'),
(44747481, 'ALEX JULIAN', 'YANQUI ITUSACA', '2023-12-05', '23:29:47'),
(45343443, 'ELIDA', 'LOPEZ FERNANDEZ', '2023-12-02', '16:12:10'),
(45582393, 'JULIO CESAR', 'CUYA CALDERON', '2023-12-02', '13:04:47'),
(47287327, 'ELIFIO JEREMIAS', 'HARO ESPINOZA', '2023-12-03', '10:25:17'),
(47292383, 'LISBETH', 'UGAZ RODRIGUEZ', '2023-12-01', '16:07:23'),
(47834788, 'ORLANDO EULOGIO', 'CAMACHO CONDORI', '2023-12-03', '09:17:54'),
(48943894, 'CHELA SOFIA', 'ESTANQUE CARRANZA', '2023-11-22', '00:00:00'),
(70283923, 'PITER JHON', 'MILLA ARILUZ', '2023-12-01', '20:19:52'),
(70284642, 'ALEX OLIVER', 'MIRANDA SAAVEDRA', '2023-12-01', '20:21:09'),
(71936801, 'BENJAMIN JUSTO', 'ATOCHE LOPEZ', '2023-11-21', '00:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ate.consumo`
--
ALTER TABLE `ate.consumo`
  ADD PRIMARY KEY (`N`),
  ADD KEY `idReserva` (`idReserva`),
  ADD KEY `platillo` (`platillo`);

--
-- Indices de la tabla `ate.mesas`
--
ALTER TABLE `ate.mesas`
  ADD PRIMARY KEY (`mesa`);

--
-- Indices de la tabla `ate.reserva`
--
ALTER TABLE `ate.reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `mesa` (`mesa`),
  ADD KEY `dniCliente` (`dniCliente`);

--
-- Indices de la tabla `co.menu`
--
ALTER TABLE `co.menu`
  ADD PRIMARY KEY (`platillo`);

--
-- Indices de la tabla `fin.factura`
--
ALTER TABLE `fin.factura`
  ADD PRIMARY KEY (`idFactura`),
  ADD KEY `idReserva` (`idReserva`),
  ADD KEY `cajero` (`cajero`);

--
-- Indices de la tabla `re.notificaciones`
--
ALTER TABLE `re.notificaciones`
  ADD PRIMARY KEY (`N`),
  ADD KEY `IdEmpleado` (`IdEmpleado`);

--
-- Indices de la tabla `us.chat`
--
ALTER TABLE `us.chat`
  ADD PRIMARY KEY (`N`),
  ADD KEY `idEmisor` (`idEmisor`,`idReceptor`),
  ADD KEY `idReceptor` (`idReceptor`);

--
-- Indices de la tabla `us.empleado`
--
ALTER TABLE `us.empleado`
  ADD PRIMARY KEY (`idEmpleado`),
  ADD KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `us.persona`
--
ALTER TABLE `us.persona`
  ADD PRIMARY KEY (`idPersona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ate.consumo`
--
ALTER TABLE `ate.consumo`
  MODIFY `N` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `ate.mesas`
--
ALTER TABLE `ate.mesas`
  MODIFY `mesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `re.notificaciones`
--
ALTER TABLE `re.notificaciones`
  MODIFY `N` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `us.chat`
--
ALTER TABLE `us.chat`
  MODIFY `N` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ate.consumo`
--
ALTER TABLE `ate.consumo`
  ADD CONSTRAINT `ate.consumo_ibfk_1` FOREIGN KEY (`idReserva`) REFERENCES `ate.reserva` (`idReserva`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ate.consumo_ibfk_2` FOREIGN KEY (`platillo`) REFERENCES `co.menu` (`platillo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ate.reserva`
--
ALTER TABLE `ate.reserva`
  ADD CONSTRAINT `ate.reserva_ibfk_1` FOREIGN KEY (`mesa`) REFERENCES `ate.mesas` (`mesa`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ate.reserva_ibfk_2` FOREIGN KEY (`dniCliente`) REFERENCES `us.persona` (`idPersona`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `fin.factura`
--
ALTER TABLE `fin.factura`
  ADD CONSTRAINT `fin.factura_ibfk_1` FOREIGN KEY (`idReserva`) REFERENCES `ate.reserva` (`idReserva`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fin.factura_ibfk_2` FOREIGN KEY (`cajero`) REFERENCES `us.empleado` (`idEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `re.notificaciones`
--
ALTER TABLE `re.notificaciones`
  ADD CONSTRAINT `re.notificaciones_ibfk_1` FOREIGN KEY (`IdEmpleado`) REFERENCES `us.empleado` (`idEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `us.chat`
--
ALTER TABLE `us.chat`
  ADD CONSTRAINT `us.chat_ibfk_1` FOREIGN KEY (`idEmisor`) REFERENCES `us.empleado` (`idEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `us.chat_ibfk_2` FOREIGN KEY (`idReceptor`) REFERENCES `us.empleado` (`idEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `us.empleado`
--
ALTER TABLE `us.empleado`
  ADD CONSTRAINT `us.empleado_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `us.persona` (`idPersona`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
