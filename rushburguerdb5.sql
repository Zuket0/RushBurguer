-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-03-2024 a las 05:48:07
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
-- Base de datos: `rushburguerdb5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL,
  `descripcion` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `descripcion`) VALUES
(1, 'Extras'),
(2, 'Acompaniamiento'),
(3, 'Hamburguesas'),
(4, 'Bebidas'),
(5, 'Combos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL,
  `Precio` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idFactura`, `Precio`) VALUES
(1, 153.00),
(2, 153.00),
(3, 55.00),
(4, 26.00),
(5, 58.00),
(6, 26.00),
(7, 96.00),
(8, 30.00),
(9, 68.00),
(10, 119.50),
(11, 15.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `precio` decimal(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `id_categoria`, `descripcion`, `precio`) VALUES
(1, 3, 'Hamburguesa con Queso', 15.00),
(2, 3, 'Hamburguesa Clasica', 10.00),
(3, 3, 'Hamburguesa con Tocino', 25.00),
(4, 3, 'Hamburguesa Vegetariana', 15.00),
(5, 3, 'Hamburguesa con Champiñones', 15.00),
(6, 3, 'Hamburguesa BBQ', 30.00),
(7, 3, 'Hamburguesa Picante', 20.00),
(8, 2, 'Papas Fritas', 5.00),
(9, 2, 'Aros de Cebolla', 4.50),
(10, 2, 'Nuggets de pollo', 9.50),
(11, 2, 'Palitos de Mozzarella', 10.00),
(12, 1, 'Ensalada', 10.00),
(16, 4, 'Inca Kola', 5.00),
(17, 4, 'Coca Cola', 5.00),
(18, 4, 'Pepsi', 5.00),
(19, 4, 'Fanta', 5.00),
(20, 4, 'Batido de Vainilla', 3.00),
(21, 4, 'Batido de Chocolate', 3.00),
(22, 4, 'Batido de Fresa', 3.00),
(23, 4, 'Limonada', 4.00),
(24, 4, 'Te Helado', 4.00),
(25, 4, 'Agua mineral', 5.00),
(26, 1, 'ketchup', 1.00),
(27, 1, 'Mostaza', 1.00),
(28, 1, 'Mayonesa', 1.00),
(29, 1, 'Queso', 2.00),
(30, 1, 'Tocino', 7.00),
(31, 1, 'Arroz', 5.00),
(120, 5, 'Combo Delux', 40.00),
(1535, 5, 'Combo Unico', 50.00),
(1538, 5, 'Combo Deluxe', 50.00),
(1539, 5, 'Combo vegano', 80.00),
(1540, 4, 'Cola Inglesa', 10.00),
(1541, 1, 'Alitas picantes', 10.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Id` int(11) NOT NULL,
  `Nombre` varchar(250) NOT NULL,
  `Login` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`Id`, `Nombre`, `Login`, `Password`, `Correo`) VALUES
(1, 'Alberto Ipince', '612321', '612321', 'aipince@deskshop.pe'),
(2, 'Julio Campos', '123456', '123456', 'julito@deskshop.pe'),
(3, 'Gresly Ruiz', '789456', '789456', 'gruiz@deskshop.pe'),
(4, 'Piero Tong', '236548', '236548', 'ptong@deskshop.pe'),
(5, 'Messi', '635987', '635987', 'lmessi@deskshop.pe'),
(7, 'George', '136548', '136548', 'george@newton.com'),
(10, 'Wiliamm', '125469', '125469', 'Willian@rushburger.pee'),
(11, 'Jose', '123845', '123845', 'Jose@gmail.com'),
(12, 'Miguel', '732569', '732569', 'Miguel@gmail.com'),
(13, 'Gabriel', '745269', '745269', 'Gabriel@gmail.com'),
(14, 'Kiara', '623587', '623587', 'Kiara1469@gmail.com'),
(15, 'Mauricio', '256987', '256987', 'Mauri@hotmail.com'),
(16, 'Walter', '569874', '569874', 'WalterWhite@BreakingBad.com'),
(17, 'Robert', '659874', '659874', 'RDJr@hotmail.com'),
(18, 'Xiomara', '365896', '365896', 'Xio2309jpp@gmail.com'),
(19, 'Ashley', '258746', '258746', 'AshiAshi@mail.com'),
(20, 'Ricardo', '369452', '369452', 'RicardoDotero@hotmail.com'),
(21, 'Antonhy', '587269', '587269', 'Anthpro1555@yahoo.com'),
(22, 'Ana', '258799', '258799', 'Anitagamer@gmail.com'),
(23, 'Angelo', '987233', '987233', '4ngelx@hotmail.com'),
(24, 'Edson', '987654', '987654', 'EdgarT_43@gmail.com'),
(25, 'Pablito', '231232', '231232', 'Pablitorito@rushburguer.com'),
(26, 'Mathias', '654555', '654555', 'Mathi64.account@email.com'),
(27, 'Monica', '151544', '151544', 'MonicaLucia@yahoo.com'),
(28, 'Fabiola', '258656', '258656', 'Fabixx@email.com'),
(29, 'Naiara', '689841', '689841', 'anaiara.rosas@gmail.com'),
(30, 'Milena', '548235', '548235', 'milena.lopez@hotmail.com'),
(32, 'Gohan', '123658', 'asd', 'gohan.superfan@gmail.com'),
(33, 'Yotun', '397125', 'yu', 'yotun.official@hotmail.com'),
(35, 'Marcos', '561144', 'b', 'amarcos.gonzalez@gmail.com'),
(36, 'Garnacho', '697798', 'l', 'garnacho.marketing@hotmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idFactura`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `categoria_producto` (`id_categoria`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `idFactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1542;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `categoria_producto` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
