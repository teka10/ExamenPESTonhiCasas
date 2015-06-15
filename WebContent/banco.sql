-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.24 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para banco
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `banco`;


-- Volcando estructura para tabla banco.tarjetacredito
CREATE TABLE IF NOT EXISTS `tarjetacredito` (
  `numero` varchar(12) NOT NULL,
  `cupoMaximo` int(11) NOT NULL,
  `cupoDisponible` int(11) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `numeroComprobacion` varchar(7) NOT NULL,
  `contrasenha` varchar(7) NOT NULL,
  `bloqueada` tinyint(1) unsigned NOT NULL,
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numero` (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla banco.tarjetacredito: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tarjetacredito` DISABLE KEYS */;
INSERT INTO `tarjetacredito` (`numero`, `cupoMaximo`, `cupoDisponible`, `tipo`, `numeroComprobacion`, `contrasenha`, `bloqueada`, `id`) VALUES
	('123456', 1000, 4500, 'Visa', '654321', '9999', 0, 1),
	('1234567', 1000, 2000, 'Visa', '7654321', '9999', 0, 2),
	('10', 10, 10, 'Visa', '10', '10', 0, 11),
	('11', 11, 1000, 'Visa', '11', '11', 1, 13),
	('17', 5000, 5000, 'MasterCard', '18', '9999', 0, 14);
/*!40000 ALTER TABLE `tarjetacredito` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
