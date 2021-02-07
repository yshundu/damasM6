-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-02-2021 a las 18:53:38
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `damas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `idMoviment` int(3) NOT NULL,
  `columnaOrigen` int(3) NOT NULL,
  `columnaDesti` int(3) NOT NULL,
  `filaOrigen` int(3) NOT NULL,
  `filaDesti` int(3) NOT NULL,
  `idPartida` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `movimiento`
--

INSERT INTO `movimiento` (`idMoviment`, `columnaOrigen`, `columnaDesti`, `filaOrigen`, `filaDesti`, `idPartida`) VALUES
(243, 4, 3, 6, 5, 38),
(244, 5, 4, 1, 2, 38),
(245, 3, 4, 5, 4, 38),
(246, 4, 3, 2, 3, 38),
(247, 4, 3, 4, 3, 38),
(248, 3, 4, 1, 2, 38),
(249, 3, 4, 3, 2, 38),
(250, 4, 3, 0, 1, 38),
(251, 4, 5, 2, 1, 38),
(252, 3, 4, 1, 2, 38),
(253, 5, 4, 1, 0, 38),
(254, 2, 3, 6, 5, 39),
(255, 3, 2, 1, 2, 39),
(256, 1, 2, 7, 6, 39),
(257, 5, 4, 1, 2, 39),
(258, 3, 4, 5, 4, 39),
(259, 4, 3, 2, 3, 39),
(260, 4, 5, 4, 3, 39),
(261, 3, 2, 3, 4, 39),
(262, 2, 3, 6, 5, 39),
(263, 2, 3, 4, 5, 39),
(264, 3, 2, 7, 6, 39),
(265, 3, 2, 5, 6, 39),
(266, 4, 3, 6, 5, 39),
(267, 2, 3, 6, 7, 39),
(268, 4, 5, 6, 5, 40),
(269, 5, 4, 1, 2, 40),
(270, 5, 4, 5, 4, 40),
(271, 4, 3, 2, 3, 40),
(272, 3, 4, 7, 6, 40),
(273, 3, 4, 3, 4, 40),
(274, 2, 3, 6, 5, 40),
(275, 4, 3, 4, 5, 40),
(276, 4, 5, 6, 5, 40),
(277, 3, 4, 5, 6, 40),
(278, 6, 7, 6, 5, 40),
(279, 4, 5, 6, 7, 40),
(280, 4, 3, 6, 5, 41),
(281, 5, 4, 1, 2, 41),
(282, 3, 4, 5, 4, 41),
(283, 4, 3, 2, 3, 41),
(284, 6, 5, 6, 5, 41),
(285, 3, 2, 3, 4, 41),
(286, 4, 3, 4, 3, 41),
(287, 3, 4, 1, 2, 41),
(288, 3, 4, 3, 2, 41),
(289, 4, 3, 0, 1, 41),
(290, 4, 3, 2, 1, 41),
(291, 1, 2, 1, 2, 41),
(292, 3, 4, 1, 0, 41),
(293, 4, 3, 6, 5, 42),
(294, 5, 4, 1, 2, 42),
(295, 2, 1, 6, 5, 42),
(296, 4, 3, 2, 3, 42),
(297, 6, 5, 6, 5, 42),
(298, 3, 4, 3, 4, 42),
(299, 5, 4, 5, 4, 42),
(300, 3, 2, 1, 2, 42),
(301, 4, 3, 4, 3, 42),
(302, 2, 1, 2, 3, 42),
(303, 3, 4, 3, 2, 42),
(304, 4, 3, 0, 1, 42),
(305, 4, 3, 2, 1, 42),
(306, 1, 2, 1, 2, 42),
(307, 3, 4, 1, 0, 42),
(308, 4, 5, 6, 5, 43),
(309, 5, 4, 1, 2, 43),
(310, 6, 7, 6, 5, 43),
(311, 4, 5, 2, 3, 43),
(312, 5, 4, 5, 4, 43),
(313, 5, 4, 3, 4, 43),
(314, 3, 4, 7, 6, 43),
(315, 4, 5, 4, 5, 43),
(316, 7, 6, 7, 6, 43),
(317, 5, 6, 5, 6, 43),
(318, 7, 6, 5, 4, 43),
(319, 6, 7, 6, 7, 43),
(320, 4, 3, 6, 5, 44),
(321, 5, 4, 1, 2, 44),
(322, 3, 4, 5, 4, 44),
(323, 4, 3, 2, 3, 44),
(324, 4, 3, 4, 3, 44),
(325, 7, 6, 1, 2, 44),
(326, 6, 5, 6, 5, 44),
(327, 6, 5, 2, 3, 44),
(328, 5, 6, 5, 4, 44),
(329, 5, 4, 3, 4, 44),
(330, 6, 5, 4, 3, 44),
(331, 4, 5, 4, 5, 44),
(332, 5, 4, 7, 6, 44),
(333, 5, 6, 5, 6, 44),
(334, 4, 5, 6, 5, 44),
(335, 6, 5, 6, 7, 44),
(336, 4, 3, 6, 5, 45),
(337, 5, 4, 1, 2, 45),
(338, 6, 5, 6, 5, 45),
(339, 7, 6, 1, 2, 45),
(340, 5, 6, 5, 4, 45),
(341, 6, 5, 2, 3, 45),
(342, 6, 5, 4, 3, 45),
(343, 4, 3, 2, 3, 45),
(344, 5, 6, 3, 2, 45),
(345, 6, 5, 0, 1, 45),
(346, 6, 5, 2, 1, 45),
(347, 3, 4, 3, 4, 45),
(348, 5, 6, 1, 0, 45),
(349, 2, 3, 6, 5, 46),
(350, 3, 4, 1, 2, 46),
(351, 3, 4, 5, 4, 46),
(352, 4, 5, 2, 3, 46),
(353, 4, 3, 4, 3, 46),
(354, 5, 4, 3, 4, 46),
(355, 6, 5, 6, 5, 46),
(356, 4, 5, 4, 5, 46),
(357, 4, 3, 6, 5, 46),
(358, 5, 4, 5, 6, 46),
(359, 5, 6, 7, 6, 46),
(360, 4, 5, 6, 7, 46),
(361, 4, 3, 6, 5, 47),
(362, 5, 4, 1, 2, 47),
(363, 3, 4, 5, 4, 47),
(364, 4, 3, 2, 3, 47),
(365, 4, 3, 4, 3, 47),
(366, 3, 4, 1, 2, 47),
(367, 3, 4, 3, 2, 47),
(368, 4, 5, 0, 1, 47),
(369, 4, 3, 2, 1, 47),
(370, 1, 2, 1, 2, 47),
(371, 3, 4, 1, 0, 47),
(372, 6, 5, 6, 5, 48),
(373, 7, 6, 1, 2, 48),
(374, 5, 6, 5, 4, 48),
(375, 6, 5, 2, 3, 48),
(376, 6, 5, 4, 3, 48),
(377, 5, 6, 1, 2, 48),
(378, 5, 6, 3, 2, 48),
(379, 6, 5, 0, 1, 48),
(380, 6, 5, 2, 1, 48),
(381, 3, 4, 1, 2, 48),
(382, 5, 6, 1, 0, 48);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partida`
--

CREATE TABLE `partida` (
  `idPartida` int(3) NOT NULL,
  `ganador` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `partida`
--

INSERT INTO `partida` (`idPartida`, `ganador`) VALUES
(38, 'O'),
(39, 'X'),
(40, 'X'),
(41, 'O'),
(42, 'O'),
(43, 'X'),
(44, 'X'),
(45, 'O'),
(46, 'X'),
(47, 'O'),
(48, 'O');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`idMoviment`),
  ADD KEY `idPartida` (`idPartida`);

--
-- Indices de la tabla `partida`
--
ALTER TABLE `partida`
  ADD PRIMARY KEY (`idPartida`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  MODIFY `idMoviment` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=383;

--
-- AUTO_INCREMENT de la tabla `partida`
--
ALTER TABLE `partida`
  MODIFY `idPartida` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD CONSTRAINT `movimiento_ibfk_1` FOREIGN KEY (`idPartida`) REFERENCES `partida` (`idPartida`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
