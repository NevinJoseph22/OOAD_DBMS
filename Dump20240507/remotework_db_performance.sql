CREATE DATABASE  IF NOT EXISTS `remotework_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `remotework_db`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: remotework_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `performance`
--

DROP TABLE IF EXISTS `performance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `performance` (
  `PerformanceID` int NOT NULL AUTO_INCREMENT,
  `employeeID` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `Rating` int DEFAULT NULL,
  `Feedback` text,
  `evaluatorId` int NOT NULL,
  PRIMARY KEY (`PerformanceID`),
  KEY `employeeID` (`employeeID`),
  KEY `evalatorId` (`evaluatorId`),
  CONSTRAINT `performance_ibfk_1` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`emp_no`),
  CONSTRAINT `performance_ibfk_2` FOREIGN KEY (`evaluatorId`) REFERENCES `employee` (`emp_no`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `performance`
--

LOCK TABLES `performance` WRITE;
/*!40000 ALTER TABLE `performance` DISABLE KEYS */;
INSERT INTO `performance` VALUES (1,4,'2024-04-25',4,'Good performance overall',8),(2,15,'2024-03-22',5,'Excellent work',8),(3,16,'2023-07-19',3,'Needs improvement in managing system backups',8),(4,20,'2022-06-12',4,'effectively manages the recruitment proces',9),(5,21,'2021-04-11',5,'Exceptional performance',9),(6,22,'2023-01-17',2,'Needs improvement in resolving workplace conflicts',9),(7,23,'2019-05-22',3,'Shows competence in collecting and analyzing market data but needs to improve presentation skills',10),(8,24,'2024-01-05',5,'Consistently delivers outstanding advertising campaigns and exceeds expectation',10),(9,25,'2023-11-04',4,'Consistently produces high-quality research findings and contributes positively to projects',11),(10,26,'2022-10-25',4,'Consistently identifies and addresses software defects effectively, contributing to overall product quality',11),(11,27,'2022-01-26',5,'Provides exceptional customer service and consistently exceeds performance targets',12),(12,28,'2023-08-07',3,'Shows competency in resolving basic technical issues but needs improvement in handling complex problems',12);
/*!40000 ALTER TABLE `performance` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 11:42:26
