-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: pfclinicaveterinaria
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `dni` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `nombreAlterno` varchar(30) NOT NULL,
  `contactoAlternativo` bigint(20) NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `dni` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,30100100,'Mariano','Alvarez',154100010,'Av Sarmiento','Otro',155202020),(2,31100100,'Mauro','Alvarez',154100010,'Av Sarmiento','',155202020),(3,40123456,'Juan','Martinez',154999999,'Av San Martin','',154888888),(4,41123456,'Marcelo','Martinez',154999999,'Av San Martin','',154888888),(5,28888999,'Julia','Marquez',154222333,'Av Belgrano','',154100200),(6,29888999,'Julieta','Marquez',154222333,'Av Belgrano','',154100200),(7,18100100,'Ezequiel','Lopez',154151515,'nose','',154987654),(8,19100100,'Pedro','Lopez',154151515,'nose','',154987654),(9,26000000,'Juan','Alvarez',11111111,'Av Sarmiento','',2222222),(14,45484848,'Ezequiel','Marrelli',44,'Calle solari','Matias',55);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mascota`
--

DROP TABLE IF EXISTS `mascota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL AUTO_INCREMENT,
  `alias` varchar(30) NOT NULL,
  `sexo` varchar(30) NOT NULL,
  `especie` varchar(30) NOT NULL,
  `raza` varchar(30) NOT NULL,
  `colorPelo` varchar(50) NOT NULL,
  `peso` double(6,3) NOT NULL,
  `pesoPromedio` double(6,3) NOT NULL,
  `fechaNac` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`idMascota`),
  KEY `idCliente` (`idCliente`),
  CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mascota`
--

LOCK TABLES `mascota` WRITE;
/*!40000 ALTER TABLE `mascota` DISABLE KEYS */;
INSERT INTO `mascota` VALUES (1,'Indiana','Femenino','Canino','Caniche','Blanco',8.000,7.000,'2016-06-15',1),(2,'Catalina','Femenino','Felino','Calle','Naranja blanco',6.000,0.000,'2017-08-16',4),(3,'Leo','Masculino','Canino','Salchicha','Marron',0.000,0.000,'2018-08-16',5),(4,'Messi','Masculino','Canino','Ovejero Aleman','Negro',0.000,0.000,'2022-12-18',1);
/*!40000 ALTER TABLE `mascota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicamento` (
  `idMedicamento` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `precio` double(8,2) NOT NULL,
  PRIMARY KEY (`idMedicamento`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
INSERT INTO `medicamento` VALUES (1,'Antiparasitario',2500.00);
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tratamiento`
--

DROP TABLE IF EXISTS `tratamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tratamiento` (
  `idTratamiento` int(11) NOT NULL AUTO_INCREMENT,
  `tipodeTratamiento` varchar(30) NOT NULL,
  `descripcion` varchar(70) NOT NULL,
  `importe` double(10,2) NOT NULL,
  `idMedicamento` int(11) NOT NULL DEFAULT 1,
  `activo` tinyint(1) NOT NULL,
  PRIMARY KEY (`idTratamiento`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tratamiento`
--

LOCK TABLES `tratamiento` WRITE;
/*!40000 ALTER TABLE `tratamiento` DISABLE KEYS */;
INSERT INTO `tratamiento` VALUES (1,'Estetica','',500.00,1,1),(2,'Control','',700.00,1,1);
/*!40000 ALTER TABLE `tratamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visita`
--

DROP TABLE IF EXISTS `visita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visita` (
  `idVisita` int(11) NOT NULL AUTO_INCREMENT,
  `idMascota` int(11) NOT NULL,
  `fechaVisita` date NOT NULL,
  `detalle` varchar(50) NOT NULL,
  `peso` double(6,3) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  PRIMARY KEY (`idVisita`),
  KEY `idMascota` (`idMascota`),
  KEY `idTratamiento` (`idTratamiento`),
  CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`),
  CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idTratamiento`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visita`
--

LOCK TABLES `visita` WRITE;
/*!40000 ALTER TABLE `visita` DISABLE KEYS */;
INSERT INTO `visita` VALUES (1,1,'2023-08-16','Baño',8.000,1),(2,2,'2023-06-25','Desparacitar',6.000,2),(3,3,'2023-06-25','Baño',4.000,2),(4,4,'2023-08-16','Baño',15.000,1),(5,1,'2023-09-20','Baño',6.000,1),(6,1,'2023-09-25','Desparacitar',7.000,2),(7,1,'2014-05-13','Baño',500.000,1);
/*!40000 ALTER TABLE `visita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'pfclinicaveterinaria'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-18  0:54:24
