-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: carshowroom
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `buyer`
--

DROP TABLE IF EXISTS `buyer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buyer` (
  `id_buyer` int NOT NULL AUTO_INCREMENT,
  `first_name_buyer` varchar(45) DEFAULT NULL,
  `midle_name_buyer` varchar(45) DEFAULT NULL,
  `last_name_buyer` varchar(45) DEFAULT NULL,
  `birth_buyer` date DEFAULT NULL,
  `gender_buyer` varchar(45) DEFAULT NULL,
  `phone_number_buyer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_buyer`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buyer`
--

LOCK TABLES `buyer` WRITE;
/*!40000 ALTER TABLE `buyer` DISABLE KEYS */;
INSERT INTO `buyer` VALUES (1,'Dmitruy','Nikrasov','Ivanovich','2000-10-30','MALE','+79155460888'),(2,'Dmitruy','Nikrasov','Ivanovich','2000-10-30','MALE','+79155460888');
/*!40000 ALTER TABLE `buyer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_owner` int DEFAULT NULL,
  `brandCar` varchar(45) DEFAULT NULL,
  `modelCar` varchar(45) DEFAULT NULL,
  `vin` varchar(45) DEFAULT NULL,
  `dateOfMnufacture` date DEFAULT NULL,
  `prise` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500),(2,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id_employee` int NOT NULL AUTO_INCREMENT,
  `first_name_employee` varchar(45) DEFAULT NULL,
  `midle_name_employee` varchar(45) DEFAULT NULL,
  `last_name_employee` varchar(45) DEFAULT NULL,
  `birth_employee` date DEFAULT NULL,
  `gender_employee` varchar(45) DEFAULT NULL,
  `phone_number_employee` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_employee`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Anastsia','Ivanova','Alexseivna','1997-01-01','FEMALE','+79261278764'),(2,'Anastsia','Ivanova','Alexseivna','1997-01-01','FEMALE','+79261278764');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenance`
--

DROP TABLE IF EXISTS `maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maintenance` (
  `id` int NOT NULL,
  `buyer` varchar(45) DEFAULT NULL,
  `transport` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenance`
--

LOCK TABLES `maintenance` WRITE;
/*!40000 ALTER TABLE `maintenance` DISABLE KEYS */;
/*!40000 ALTER TABLE `maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `showroom`
--

DROP TABLE IF EXISTS `showroom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `showroom` (
  `id` int NOT NULL,
  `buyer` varchar(45) DEFAULT NULL,
  `transport` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `showroom`
--

LOCK TABLES `showroom` WRITE;
/*!40000 ALTER TABLE `showroom` DISABLE KEYS */;
/*!40000 ALTER TABLE `showroom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truck`
--

DROP TABLE IF EXISTS `truck`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `truck` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_owner` int DEFAULT NULL,
  `brandTruck` varchar(45) DEFAULT NULL,
  `modelTruck` varchar(45) DEFAULT NULL,
  `vin` varchar(45) DEFAULT NULL,
  `dateOfMnufacture` date DEFAULT NULL,
  `prise` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truck`
--

LOCK TABLES `truck` WRITE;
/*!40000 ALTER TABLE `truck` DISABLE KEYS */;
INSERT INTO `truck` VALUES (1,2,'Volvo','FH16','SKN42454434*12','2007-09-05',25000);
/*!40000 ALTER TABLE `truck` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'carshowroom'
--

--
-- Dumping routines for database 'carshowroom'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-01 23:20:07
