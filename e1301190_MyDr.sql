-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 29, 2016 at 03:44 PM
-- Server version: 5.5.53-0+deb8u1
-- PHP Version: 5.6.27-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `e1301190_MyDr`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor_visitation_note`
--

CREATE TABLE IF NOT EXISTS `doctor_visitation_note` (
  `doctor_name` char(30) NOT NULL DEFAULT '',
  `patient_name` char(255) NOT NULL,
  `location` char(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `primary_diagnosis` char(50) DEFAULT NULL,
  `seconday_diagnosis` char(50) DEFAULT NULL,
  `clicinal_note` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `User_Name` char(255) NOT NULL DEFAULT '',
  `Password` char(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `name` char(255) NOT NULL DEFAULT '',
  `gender` char(1) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `birthplace` char(255) DEFAULT NULL,
  `telephone_number` varchar(20) DEFAULT NULL,
  `social_security_number` varchar(11) DEFAULT NULL COMMENT 'social security number',
  `email` varchar(100) CHARACTER SET utf16 DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`name`, `gender`, `birthdate`, `birthplace`, `telephone_number`, `social_security_number`, `email`) VALUES
('Jaska Jokunen', 'M', '1993-08-12', 'Ylistaro', '123456789', '120893-145L', 'jasmin.jokunen@gmail.com'),
('Jasmin Jokunen', 'M', '1993-08-11', 'Ylistaro', '123456789', '110893-788Y', 'jaska.jokunen@email.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor_visitation_note`
--
ALTER TABLE `doctor_visitation_note`
 ADD PRIMARY KEY (`doctor_name`), ADD UNIQUE KEY `doctor_name` (`doctor_name`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`User_Name`), ADD UNIQUE KEY `User_Name` (`User_Name`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
 ADD PRIMARY KEY (`name`), ADD UNIQUE KEY `name` (`name`), ADD KEY `name_2` (`name`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
