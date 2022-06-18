-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: student_mark
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `class` (
  `class_id` int NOT NULL AUTO_INCREMENT,
  `class_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `class_size` int DEFAULT NULL,
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES (1,'Điện tử 10 - K63',80,'Cô Thoa'),(2,'Điện tử 11 - K63',80,'Cô Huệ'),(3,'Điện tử 09 - K63',80,'Thầy Tiến'),(4,'Điện tử 08 - K63',80,'Thầy Tĩnh');
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mark`
--

DROP TABLE IF EXISTS `mark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mark` (
  `student_id` int NOT NULL,
  `subject_id` int NOT NULL,
  `mark` double DEFAULT NULL,
  `semester_code` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  KEY `mark_student_idx` (`student_id`),
  KEY `mark_subject_idx` (`subject_id`),
  CONSTRAINT `mark_student` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`),
  CONSTRAINT `mark_subject` FOREIGN KEY (`subject_id`) REFERENCES `subject` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mark`
--

LOCK TABLES `mark` WRITE;
/*!40000 ALTER TABLE `mark` DISABLE KEYS */;
INSERT INTO `mark` VALUES (1,1,8.3,'20211'),(1,2,5.3,'20211'),(1,3,4.3,'20212'),(1,4,3.4,'20221'),(1,5,7.6,'20221'),(1,6,9.8,'20212'),(2,1,5.3,'20211'),(2,2,5.3,'20211'),(2,3,4.3,'20212'),(2,4,3.4,'20221'),(2,5,7.6,'20221'),(2,6,9.8,'20212'),(3,1,5.3,'20211'),(3,2,5.3,'20211'),(3,3,4.3,'20212'),(3,4,3.4,'20221'),(3,5,7.6,'20221'),(3,6,9.8,'20212'),(4,1,5.3,'20211'),(4,2,5.3,'20211'),(4,3,4.3,'20212'),(4,4,3.4,'20221'),(4,5,7.6,'20221'),(4,6,9.8,'20212'),(5,1,5.3,'20211'),(5,2,5.3,'20211'),(5,3,4.3,'20212'),(5,4,3.4,'20221'),(5,5,7.6,'20221'),(5,6,9.8,'20212'),(6,1,5.3,'20211'),(6,2,5.3,'20211'),(6,3,4.3,'20212'),(6,4,3.4,'20221'),(6,5,7.6,'20221'),(6,6,9.8,'20212'),(7,1,5.3,'20211'),(7,2,5.3,'20211'),(7,3,4.3,'20212'),(7,4,3.4,'20221'),(7,5,7.6,'20221'),(7,6,9.8,'20212'),(8,1,5.3,'20211'),(8,2,5.3,'20211'),(8,3,4.3,'20212'),(8,4,3.4,'20221'),(8,5,7.6,'20221'),(8,6,9.8,'20212'),(9,1,5.3,'20211'),(9,2,5.3,'20211'),(9,3,4.3,'20212'),(9,4,3.4,'20221'),(9,5,7.6,'20221'),(9,6,9.8,'20212'),(10,1,5.3,'20211'),(10,2,5.3,'20211'),(10,3,4.3,'20212'),(10,4,3.4,'20221'),(10,5,7.6,'20221'),(10,6,9.8,'20212'),(11,1,5.3,'20211'),(11,2,5.3,'20211'),(11,3,4.3,'20212'),(11,4,3.4,'20221'),(11,5,7.6,'20221'),(11,6,9.8,'20212'),(12,1,5.3,'20211'),(12,2,5.3,'20211'),(12,3,4.3,'20212'),(12,4,3.4,'20221'),(12,5,7.6,'20221'),(12,6,9.8,'20212');
/*!40000 ALTER TABLE `mark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` tinyint DEFAULT NULL,
  `dob` datetime DEFAULT NULL,
  `class_id` int DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `class_id_idx` (`class_id`),
  CONSTRAINT `student_class` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Nguyễn Văn','Nam',1,'2000-01-14 00:00:00',1),(2,'Đăng Gia Long','Khánh',1,'2000-05-20 00:00:00',1),(3,'Trần Thị','Hà',0,'2000-02-01 00:00:00',1),(4,'Bùi Huy','Hoàng',1,'2000-05-20 00:00:00',2),(5,'Phạm Thị','Quỳnh',0,'2000-12-11 00:00:00',2),(6,'Lưu Thị Hoàng','Anh',0,'2000-09-09 00:00:00',2),(7,'Nguyễn Thị Cẩm','Nhung',0,'2000-10-10 00:00:00',3),(8,'Nguyễn Nhật','Quang',1,'2000-11-12 00:00:00',3),(9,'Đặng Văn','Huyên',1,'2000-07-19 00:00:00',3),(10,'Phạm Thị','Lan',0,'2000-11-11 00:00:00',4),(11,'Nguyễn Thị Mai','Hằng',0,'2000-06-05 00:00:00',4),(12,'Ngô Bình','Minh',1,'2000-06-06 00:00:00',4),(14,'First_name','Last_name',0,'3899-11-12 00:00:00',1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `subject_id` int NOT NULL AUTO_INCREMENT,
  `subject_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `credits` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,'LTNC','Cô Thoa'),(2,'KTMPUD','Thầy Tĩnh'),(3,'ĐA I','Thầy Minh'),(4,'ĐTTT 1','Thầy Quyền'),(5,'ĐTTT 2','Thầy Quang'),(6,'ĐTS','Thầy Thắng');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-18  8:53:07
