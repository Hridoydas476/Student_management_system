-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2020 at 03:10 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `student_Id` varchar(300) NOT NULL,
  `student_name` varchar(300) NOT NULL,
  `section` varchar(20) NOT NULL,
  `course_name` varchar(300) NOT NULL,
  `quiz1_marks` varchar(300) NOT NULL,
  `quiz2_marks` varchar(300) NOT NULL,
  `quiz3_marks` varchar(300) NOT NULL,
  `midterm_marks` varchar(300) NOT NULL,
  `final_marks` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`student_Id`, `student_name`, `section`, `course_name`, `quiz1_marks`, `quiz2_marks`, `quiz3_marks`, `midterm_marks`, `final_marks`) VALUES
('192-15-13337', 'Hridoy das', 'G', 'Digital Electronics', '12', '14', '15', '20', '35');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
