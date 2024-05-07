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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `emp_no` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `position` varchar(30) NOT NULL,
  `deptId` int NOT NULL,
  `managerID` int DEFAULT NULL,
  `createdByID` int DEFAULT NULL,
  `updatedByID` int DEFAULT NULL,
  PRIMARY KEY (`emp_no`),
  KEY `fk_dept` (`deptId`),
  KEY `managerID` (`managerID`),
  KEY `createdByID` (`createdByID`),
  KEY `updatedByID` (`updatedByID`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`managerID`) REFERENCES `employee` (`emp_no`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`createdByID`) REFERENCES `employee` (`emp_no`),
  CONSTRAINT `employee_ibfk_3` FOREIGN KEY (`updatedByID`) REFERENCES `employee` (`emp_no`),
  CONSTRAINT `fk_dept` FOREIGN KEY (`deptId`) REFERENCES `department` (`DepartmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (3,'CreatorFirstName','CreatorLastName','creator@example.com','CreatorPosition',1,NULL,NULL,NULL),(4,'John','Adams','john@example.com','Software Developer',1,8,3,NULL),(8,'Jane','Smith','jane.smith@example.com','IT Project Manager',1,NULL,NULL,NULL),(9,'Alice','Johnson','alice.johnson@example.com','HR Manager',2,NULL,NULL,NULL),(10,'Sarah','Jones','sarah.jones@example.com','Marketing Manager',3,NULL,NULL,NULL),(11,'Daniel','Taylor','daniel.taylor@example.com','R&D Manager',4,NULL,NULL,NULL),(12,'Michael','Johnson','michael.johnson@example.com','Customer Service Manager',5,NULL,NULL,NULL),(15,'Kora','Dimity','kora@example.com','Network Engineer',1,8,3,NULL),(16,'Max','William','max@example.com','Systems Administrator',1,8,3,NULL),(20,'Ava','Anderson','ava.anderson@example.com','Recruitment Specialist',2,9,3,NULL),(21,'William','Martinez','william.martinez@example.com','Training Coordinator',2,9,3,NULL),(22,'Isabella','Rodriguez','isabella.rodriguez@example.com','Employee Relations Specialist',2,9,3,NULL),(23,'Benjamin','White','benjamin.white@example.com','Market Research Analyst',3,10,3,NULL),(24,'James','Miller','james.miller@example.com','Advertising Specialist',3,10,3,NULL),(25,'Logan','Garcia','logan.garcia@example.com','Research Scientist',4,11,3,NULL),(26,'Sophia','Lee','sophia.lee@example.com','Quality Assurance Engineer',4,11,3,NULL),(27,'Emily','Brown','emily.brown@example.com','Customer Support Specialist',5,12,3,NULL),(28,'Charlotte','Lopez','charlotte.lopez@example.com','Help Desk Technician',5,12,3,NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
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
