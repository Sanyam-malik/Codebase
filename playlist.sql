-- --------------------------------------------------------
-- Host:                         Z:\home\sam-arora\PycharmProjects\codebase-flask\codebase.db
-- Server version:               3.39.4
-- Server OS:                    
-- HeidiSQL Version:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES  */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table codebase.playlist: 4 rows
/*!40000 ALTER TABLE "playlist" DISABLE KEYS */;
INSERT INTO "playlist" ("id", "uid", "title", "description", "status") VALUES
	(1, 'SUDOLLD', 'Low Level System Design | SudoCode', '', 'TODO'),
	(2, 'SUDOHLD', 'High Level System Design | SudoCode', '', 'TODO'),
	(3, 'KKDS', 'Data Structures | Kunal Kushwaha', '', 'TODO'),
	(4, 'ACDS', 'Data Structures | Apna College', '', 'TODO');
/*!40000 ALTER TABLE "playlist" ENABLE KEYS */;

-- Dumping data for table codebase.playlist_item: 21 rows
/*!40000 ALTER TABLE "playlist_item" DISABLE KEYS */;
INSERT INTO "playlist_item" ("id", "uid", "section_uid", "title", "description", "status", "image", "url", "content", "content_type") VALUES
	(1, 'SUDOLLDS1I1', 'SUDOLLDS1', 'Steps and Resources to learn LLD as a beginner', NULL, 'TODO', 'https://i.ytimg.com/vi/B3zrIwz_t4M/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLCP-4aSpMi26yd5jYePZVxYdQA-Dw', 'https://youtu.be/B3zrIwz_t4M', NULL, 'URL'),
	(2, 'SUDOLLDS1I2', 'SUDOLLDS1', 'What is LLD(Low Level Design)? Simplified steps to learn and break LLD problem', NULL, 'TODO', 'https://i.ytimg.com/vi/5Tz9EUMHOGI/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLCBd2kR96FjthlU7pDzgRFrFV22eQ', 'https://youtu.be/5Tz9EUMHOGI', NULL, 'URL'),
	(3, 'SUDOLLDS1I3', 'SUDOLLDS1', 'How to design low level applications using objects and classes', NULL, 'TODO', 'https://i.ytimg.com/vi/FbQYifw9Be8/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLAakVud3VDdilDr-S0kjLB8QYtrGg', 'https://youtu.be/FbQYifw9Be8', NULL, 'URL'),
	(4, 'SUDOLLDS1I4', 'SUDOLLDS1', 'How to build Classes in Object Oriented Design', NULL, 'TODO', 'https://i.ytimg.com/vi/_wmyYdOkCo4/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLBlgMgR1RbAxVdj2K44c3U1e3EZMg', 'https://youtu.be/_wmyYdOkCo4', NULL, 'URL'),
	(5, 'SUDOLLDS2I1', 'SUDOLLDS2', 'Single Responsibility Principle', NULL, 'TODO', 'https://i.ytimg.com/vi/-T0H--a8WnY/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLAyn2AFhsqUqUoDa2rNLDFN0Ifk3w', 'https://youtu.be/-T0H--a8WnY', NULL, 'URL'),
	(6, 'SUDOLLDS2I2', 'SUDOLLDS2', 'Inheritance and Polymorphism', NULL, 'TODO', 'https://i.ytimg.com/vi/tIavGKafBV8/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLA3FECVDLs1UU4q4tVZGJY_oNLi6w', 'https://youtu.be/tIavGKafBV8', NULL, 'URL'),
	(7, 'SUDOLLDS2I3', 'SUDOLLDS2', 'Liskov Substitution Principle', NULL, 'TODO', 'https://i.ytimg.com/vi/HbGDobtxzWk/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDMXPCgFUsjJrxcSO_to7ujsoecuw', 'https://youtu.be/HbGDobtxzWk', NULL, 'URL'),
	(8, 'SUDOLLDS2I4', 'SUDOLLDS2', 'Interface Segregation Principle', NULL, 'TODO', 'https://i.ytimg.com/vi/-E-E6pd-psU/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDcwwsTDuT2xdnwSAPEeoiL9EO2WA', 'https://youtu.be/-E-E6pd-psU', NULL, 'URL'),
	(9, 'SUDOLLDS2I5', 'SUDOLLDS2', 'Dependency Inversion Principle', NULL, 'TODO', 'https://i.ytimg.com/vi/_CQuOfIqaGE/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLArnOz42t67TSO8GYaWnFTifaa2Rg', 'https://youtu.be/_CQuOfIqaGE', NULL, 'URL'),
	(10, 'SUDOLLDS3I1', 'SUDOLLDS3', 'What are Design Patterns?', NULL, 'TODO', 'https://i.ytimg.com/vi/FM_pRefVCB4/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLAtUtaTrA6K3pjYii9LbMGQhCD87w', 'https://youtu.be/FM_pRefVCB4', NULL, 'URL'),
	(11, 'SUDOLLDS3I2', 'SUDOLLDS3', 'Types of Design Patterns', NULL, 'TODO', 'https://i.ytimg.com/vi/1004gyjLhkA/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLCgY0bGIYGjr8iRhu66kURCQ-TP8g', 'https://youtu.be/1004gyjLhkA', NULL, 'URL'),
	(12, 'SUDOLLDS3I3', 'SUDOLLDS3', 'How to use Factory Method Design Pattern to design a course website like Udacity, Edx, Coursera', NULL, 'TODO', 'https://i.ytimg.com/vi/s3Wr5_tsODs/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLAKV8sYaeGan7aCk6VZ4aGhTT4dzw', 'https://youtu.be/s3Wr5_tsODs', NULL, 'URL'),
	(13, 'SUDOLLDS3I4', 'SUDOLLDS3', 'How does Builder Design Pattern solves problems like URL creation?', NULL, 'TODO', 'https://i.ytimg.com/vi/4ff_KZdvJn8/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLBscUJoT39AtsLwRhU42T7p22weDw', 'https://youtu.be/4ff_KZdvJn8', NULL, 'URL'),
	(14, 'SUDOLLDS3I5', 'SUDOLLDS3', 'How to use abstract factory to design admit card module for schools like Harvard, MIT, Georgia Tech', NULL, 'TODO', 'https://i.ytimg.com/vi/5hXZnI86E2Y/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLA5tRgsKUMQHH8rRtEAkE5uqy6xsg', 'https://youtu.be/5hXZnI86E2Y', NULL, 'URL'),
	(15, 'SUDOLLDS3I6', 'SUDOLLDS3', 'Story of Singleton Design Pattern and a Prime Minister', NULL, 'TODO', 'https://i.ytimg.com/vi/EZDeEHXUf8w/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLAUnzVTcjV_Oec6Y_vp3cIGKUiNcA', 'https://youtu.be/EZDeEHXUf8w', NULL, 'URL'),
	(16, 'SUDOLLDS3I7', 'SUDOLLDS3', 'How to design classes for bookmyshow like app using Facade Design Pattern', NULL, 'TODO', 'https://i.ytimg.com/vi/Dv88HvVeo3M/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLB19T4cBNEmPor216V2wyKrXDenEQ', 'https://youtu.be/Dv88HvVeo3M', NULL, 'URL'),
	(17, 'SUDOLLDS3I8', 'SUDOLLDS3', 'Why adapter design pattern is simpler to understand without charger analogy', NULL, 'TODO', 'https://i.ytimg.com/vi/eR22JuwTa54/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLAT01k0DaHkSzp3jknO7TPbgbdgrw', 'https://youtu.be/eR22JuwTa54', NULL, 'URL'),
	(18, 'SUDOLLDS3I9', 'SUDOLLDS3', 'Introduction to circuit breaker in microservices (for beginners)', NULL, 'TODO', 'https://i.ytimg.com/vi/HRS9mIfiNn4/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLCJJnc1QMwlrNUosmFwRzPFE03Pyw', 'https://youtu.be/HRS9mIfiNn4', NULL, 'URL'),
	(19, 'SUDOLLDS3I10', 'SUDOLLDS3', 'How flyweight pattern helps in memory optimisation', NULL, 'TODO', 'https://i.ytimg.com/vi/8cL9KbHS5kE/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLCybMKi9A55JUDrWYd3mf-Pmxqq2Q', 'https://youtu.be/8cL9KbHS5kE', NULL, 'URL'),
	(20, 'SUDOLLDS4I1', 'SUDOLLDS4', 'Low Level Design of a Fitness Application', NULL, 'TODO', 'https://i.ytimg.com/vi/7-A5NgGrJqY/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDPhTHTVPWapydlWjaqHd6ZN53Z2Q', 'https://youtu.be/7-A5NgGrJqY', NULL, 'URL'),
	(21, 'SUDOLLDS4I2', 'SUDOLLDS4', 'Mock Low Level Design of Vaccination Centre Management', NULL, 'TODO', 'https://i.ytimg.com/vi/cqxowa0JbpI/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCYlbeNCsPDnmNix8q8mNdIqACxdg', 'https://youtu.be/cqxowa0JbpI', NULL, 'URL');
/*!40000 ALTER TABLE "playlist_item" ENABLE KEYS */;

-- Dumping data for table codebase.playlist_section: 19 rows
/*!40000 ALTER TABLE "playlist_section" DISABLE KEYS */;
INSERT INTO "playlist_section" ("id", "uid", "playlist_uid", "title", "description", "status") VALUES
	(1, 'SUDOLLDS1', 'SUDOLLD', 'Introduction', '', 'TODO'),
	(2, 'SUDOLLDS2', 'SUDOLLD', 'SOLID Principles', '', 'TODO'),
	(3, 'SUDOLLDS3', 'SUDOLLD', 'Design Patterns', '', 'TODO'),
	(4, 'SUDOLLDS4', 'SUDOLLD', 'Mock Interviews', '', 'TODO'),
	(5, 'SUDOHLDS1', 'SUDOHLD', 'Introduction', '', 'TODO'),
	(6, 'SUDOHLDS2', 'SUDOHLD', 'Client/Server Architecture', '', 'TODO'),
	(7, 'SUDOHLDS3', 'SUDOHLD', 'Proxies', '', 'TODO'),
	(8, 'SUDOHLDS4', 'SUDOHLD', 'Data and Databases', '', 'TODO'),
	(9, 'SUDOHLDS5', 'SUDOHLD', 'Applications And API', '', 'TODO'),
	(10, 'SUDOHLDS6', 'SUDOHLD', 'Data Caching', '', 'TODO'),
	(11, 'SUDOHLDS7', 'SUDOHLD', 'Message Queues', '', 'TODO'),
	(12, 'SUDOHLDS8', 'SUDOHLD', 'Performance Metrics', '', 'TODO'),
	(13, 'SUDOHLDS9', 'SUDOHLD', 'Performance Metrics', '', 'TODO'),
	(14, 'SUDOHLDS10', 'SUDOHLD', 'Fault v/s Failure', '', 'TODO'),
	(15, 'SUDOHLDS11', 'SUDOHLD', 'Database Replication And Sharding', '', 'TODO'),
	(16, 'SUDOHLDS12', 'SUDOHLD', 'Consistency, Availability and Partitioning(CAP)', '', 'TODO'),
	(17, 'SUDOHLDS13', 'SUDOHLD', 'Hashing', '', 'TODO'),
	(18, 'SUDOHLDS14', 'SUDOHLD', 'Clearing the Interview', '', 'TODO'),
	(19, 'SUDOHLDS15', 'SUDOHLD', 'Mock Interviews', '', 'TODO');
/*!40000 ALTER TABLE "playlist_section" ENABLE KEYS */;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
