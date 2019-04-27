CREATE DATABASE  IF NOT EXISTS `basevialidad` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `basevialidad`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: basevialidad
-- ------------------------------------------------------
-- Server version	5.5.59

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `passord` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (1,'Memo','321'),(2,'Chepo','666');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `passord` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'ramon','741'),(2,'frank','852usuario'),(5,'gil','321');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiculo` (
  `Id_FolioNUM` int(11) NOT NULL,
  `Propietario` tinytext NOT NULL,
  `CP` tinytext NOT NULL,
  `LFExpedicion` tinytext NOT NULL,
  `ClaveVehicular` tinytext NOT NULL,
  `Recaudadora` int(11) NOT NULL,
  `Placas` tinytext NOT NULL,
  `Marca` tinytext NOT NULL,
  `LSubmarca` tinytext NOT NULL,
  `Version` tinytext NOT NULL,
  `Modelo` tinytext NOT NULL,
  `Color_1` tinytext NOT NULL,
  `Color_2` tinytext NOT NULL,
  `N_Serie` tinytext NOT NULL,
  `N_Motor` tinytext NOT NULL,
  `NRPVDOC_REG` int(11) NOT NULL,
  `Movimiento` int(11) NOT NULL,
  `Procedencia` int(11) NOT NULL,
  `Combustibles` int(11) NOT NULL,
  `Servicio` int(11) NOT NULL,
  `Uso` int(11) NOT NULL,
  `Clase` int(11) NOT NULL,
  `Tipo` int(11) NOT NULL,
  `Cilindros` int(11) NOT NULL,
  `Puertas` int(11) NOT NULL,
  `PasajKG` tinytext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (1,'DON NADIE','45200','04/09/2018','8765RF3',666,'JKU7371','MERCEDEZ BENZ','LINEA','COUPE','CG 15','BLANCO ','AZUL','I8654DFGHJO87654322ERFG','KU6543ERT',1,1,3,1,1,48,1,11,4,4,'455'),(2,'DON NADIE4','45200','03/11/2016','765EDFJYTR',1,'JNK1500','MERCEDEZ BENZ','LINEA','2017','CLASE G 63','NEGRO',' ','I65433ERGHJ6543WEDFG','JHTRE1234567UJNBVDERTY',2,1,3,1,1,48,2,41,8,4,'478844'),(3,'DON NADIE7','45300','02/04/2016','KTEWE4R5T6Y78U6',4,'JR91804','DSHKSOH','LINEA','SUPER DUTY','2018','NEGRO',' ','NBVDEERR4E3E4RG','098765432QSDFGHJKDE',24,1,3,3,5,49,2,46,8,6,'76945'),(4,'DON NADIE4','45120','24/02/2012','U76543W23E4RF',4,'HYZ1643','CHEVROLET','LINEA','PAQ M MANUAL MOTOR Z 18 TELA','ASTRA','AZUL',' ','JUY65432W34R56YHH54','9I87Y6T5REW2QWSDTF',4,1,1,1,2,46,1,15,4,4,'87654'),(7,'GILberto','45360','20/20/2019','L7654EDJI6543',8,'J7654RF3D','FERRARI','LINEA','LA','SPORT','ROJO','AMARILLO','HGR22TYUIO98765RF','JY54WDFGY65',2,1,3,1,1,48,1,14,12,2,'3456'),(8,'NAN','452000','30/20/2018','875RHU',12,'U654EFGHY64','CHEVROLET','765R','UYTR','X','X','X','X','X',3,3,2,2,3,2,2,15,2,1,'8666');
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-27 23:45:28
