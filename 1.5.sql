-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: carshowroom
-- ------------------------------------------------------
-- Server version	8.0.30

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
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buyer`
--

LOCK TABLES `buyer` WRITE;
/*!40000 ALTER TABLE `buyer` DISABLE KEYS */;
INSERT INTO `buyer` VALUES (1,'Dmitruy','Nikrasov','Ivanovich','2000-10-30','MALE','+79155460888'),(3,'Oleg','Nikrasov','Ivanovich','2000-10-30','MALE','+79155460888'),(4,'Oleg','Amogus','Ivanovich','2000-10-30','MALE','+79155460888'),(5,'Oleg','Nikrasov','Ivanovich','2000-10-30','MALE','+79155460888'),(7,'Oleg','Nikrasov','Ivanovich','2000-10-30','MALE','+79155460888'),(10,'Оля','Лопина','Дубина','2002-03-20','MALE','+795564230123'),(11,'апа','енен','гыг','1975-01-10','MALE','+7945613245'),(19,'Глеб','Бабаков','Анон','1101-01-12','FEMALE','+791554689241'),(20,'Глеб','Бабаков','Анон','1101-01-12','MALE','+791554689241'),(21,'Олег','Генадьев','Генадьевич','1973-06-13','MALE','+791154648'),(22,'Глег','Чмек','КАмбек','1993-05-06','MALE','+791154648'),(27,'Акулбек ','Чумбек','ЧикЧ ек','1998-10-12','MALE','+79155460893'),(28,'Жмых','Чумбек','ЧикЧ ек','1998-10-12','MALE','+79155460893'),(29,'Олег','Газманов','Генайдевич','1963-10-27','MALE','+794415485156'),(30,'Олег','Димитров','Иванович','1998-03-16','MALE','+79154141615'),(31,'Акулбек ','Малобек','Урюрюрю','1993-05-16','FEMALE','+7915116861');
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500),(2,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500),(3,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500),(4,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500),(5,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500),(6,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500),(7,1,'BMW','e34','WBAPN7C52AA778342','1996-10-10',4500);
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
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
-- Table structure for table `transport`
--

DROP TABLE IF EXISTS `transport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transport` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_owner` int DEFAULT NULL,
  `typeTC` varchar(45) NOT NULL,
  `brandTC` varchar(45) NOT NULL,
  `modelTC` varchar(45) NOT NULL,
  `vin` varchar(45) NOT NULL,
  `dateOfManufacture` date NOT NULL,
  `prise` int NOT NULL,
  `id_employee` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transport`
--

LOCK TABLES `transport` WRITE;
/*!40000 ALTER TABLE `transport` DISABLE KEYS */;
INSERT INTO `transport` VALUES (4,0,'car','BMW','M5 E39','XNR4641578','2002-01-13',13500,2),(16,31,'truck','Pavel','Mamontov','Блатной','1101-01-13',300,2),(18,15,'truck','Камаз','2311541-05.13','165451584','2013-11-23',48600,1),(20,0,'car','Audi','A6','sadasdsaweq','2013-02-17',17500,NULL),(21,19,'car','Yoyota','Camry X70','Sd454*7847*','2020-01-18',28500,2),(22,30,'car','BMW','E38','*B4151184E384151','1997-02-03',26540,1),(23,2,'car','BMW','E34','WBAPN7C52AA77834','1994-03-12',27560,2),(24,0,'car','BMW','E30','WBA123','1993-03-15',18500,NULL),(25,0,'car','BMW','E32','WBA32123','1993-05-06',17560,NULL),(26,0,'car','BMW','E34','WBA123','1995-03-14',22500,NULL);
/*!40000 ALTER TABLE `transport` ENABLE KEYS */;
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

-- Dump completed on 2022-11-28 16:21:40
