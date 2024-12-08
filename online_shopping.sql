-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 24, 2023 at 09:53 AM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online_shopping`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(200) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `email`, `password`) VALUES
(1, 'admin@gmail.com', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `cid` int NOT NULL,
  `cname` varchar(200) NOT NULL,
  `cdesc` text,
  PRIMARY KEY (`cname`),
  UNIQUE KEY `cid_UNIQUE` (`cid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cid`, `cname`, `cdesc`) VALUES
(1, 'Dell Laptop I3', 'High Speed Laptop'),
(2, 'Dell Laptop I7', 'High Speed Laptop'),
(3, 'samsung', 'j7'),
(4, 'infinix', 'hot-10i'),
(5, 'sony', 'tv');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(200) DEFAULT NULL,
  `cname` varchar(200) DEFAULT NULL,
  `pqty` int DEFAULT NULL,
  `pprice` double DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `fk_category_name` (`cname`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pid`, `pname`, `cname`, `pqty`, `pprice`) VALUES
(1, 'Laptop', 'Dell Laptop I3', 10, 280000),
(2, 'dell', 'Dell Laptop I7', 22, 300000),
(3, 'phone', 'samsung', 10, 45000),
(4, 'phone', 'infinix', -2, 500000);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
CREATE TABLE IF NOT EXISTS `purchase` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int DEFAULT NULL,
  `uname` varchar(200) DEFAULT NULL,
  `uphone` varchar(15) DEFAULT NULL,
  `pid` int DEFAULT NULL,
  `product_name` varchar(200) DEFAULT NULL,
  `qty` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `p_date` varchar(20) DEFAULT NULL,
  `uaddress` text,
  `receive_date` varchar(20) DEFAULT NULL,
  `supplier` varchar(200) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_uid` (`uid`),
  KEY `fk_supplier_name` (`supplier`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`id`, `uid`, `uname`, `uphone`, `pid`, `product_name`, `qty`, `price`, `total`, `p_date`, `uaddress`, `receive_date`, `supplier`, `status`) VALUES
(1, 1, 'Kavishka', '0783807980', 2, 'dell', 2, 300000, 600000, '2023-11-23', 'Handapangoda, Sri Lanka', '2023-11-23', 'Dulara', 'Received'),
(2, 1, 'Kavishka', '0783807980', 4, 'phone', 2, 500000, 1000000, '2023-11-23', 'Handapangoda, Sri Lanka', '2023-11-23', 'Dulara', 'Received');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `sid` int NOT NULL,
  `sname` varchar(100) NOT NULL,
  `semail` varchar(100) DEFAULT NULL,
  `spassword` varchar(100) DEFAULT NULL,
  `sphone` varchar(15) DEFAULT NULL,
  `saddress1` text,
  `saddress2` text,
  PRIMARY KEY (`sname`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`sid`, `sname`, `semail`, `spassword`, `sphone`, `saddress1`, `saddress2`) VALUES
(1, 'Dulara', 'Dulara@gmail.com', '1234', '0783807900', 'Horana', 'Sri lanaka'),
(2, 'Kanthi', 'Kanthi@gmail.com', '1234', '1234567890', 'handapangoda', 'sri lanka'),
(3, 'sisira', 'sisira@gmail.com', '1234', '0987654321', 'handapangoda', 'sri lanka');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(200) DEFAULT NULL,
  `uemail` varchar(100) DEFAULT NULL,
  `upassword` varchar(100) DEFAULT NULL,
  `uphone` varchar(15) DEFAULT NULL,
  `usecqus` text,
  `uans` text,
  `uaddress1` text,
  `uaddress2` text,
  PRIMARY KEY (`uid`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uid`, `uname`, `uemail`, `upassword`, `uphone`, `usecqus`, `uans`, `uaddress1`, `uaddress2`) VALUES
(1, 'Kavishka', 'Kavishka@gmail.com', '1234', '0783807980', 'What is your favorite color?', 'Red', 'Handapangoda', 'Sri Lanka'),
(2, 'shehara', 'shehara@gmail.com', '1234', '23145678901', 'What is your favorite color?', 'blue', 'handapangoda', 'sri lanka'),
(3, 'nethsarani', 'nethsarani@gmail.com', '1234', '12345679808', 'What is your favorite color?', 'pink', 'horana', 'sri lanka');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
