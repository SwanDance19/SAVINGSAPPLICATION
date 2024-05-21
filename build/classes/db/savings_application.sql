-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2024 at 06:04 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `savings_application`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_deposit`
--

CREATE TABLE `tbl_deposit` (
  `d_id` int(11) NOT NULL,
  `deposit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_deposit`
--

INSERT INTO `tbl_deposit` (`d_id`, `deposit`) VALUES
(3, 500),
(4, 500);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(20) NOT NULL,
  `user_fname` varchar(50) NOT NULL,
  `user_lname` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_pass` varchar(50) NOT NULL,
  `balance` decimal(20,2) NOT NULL DEFAULT 0.00,
  `account_type` varchar(50) NOT NULL,
  `account_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_fname`, `user_lname`, `user_email`, `user_name`, `user_pass`, `balance`, `account_type`, `account_status`) VALUES
(1004, 'jhon', 'suansing', 'jhonsuansing052904@gmail.com', 'jhonsuansing133', 'SnZApCdLmZX7qoGJQi1IdR+8cLYiDR/RbnpF61NsQdY=', 400.00, 'User', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_withdraw`
--

CREATE TABLE `tbl_withdraw` (
  `w_id` int(11) NOT NULL,
  `withdraw` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_withdraw`
--

INSERT INTO `tbl_withdraw` (`w_id`, `withdraw`) VALUES
(6, 300),
(7, 300);

-- --------------------------------------------------------

--
-- Table structure for table `trans_tbl`
--

CREATE TABLE `trans_tbl` (
  `trans_id` int(11) NOT NULL,
  `users_id` int(50) NOT NULL,
  `dep_id` int(11) NOT NULL,
  `with_id` int(11) NOT NULL,
  `date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `trans_tbl`
--

INSERT INTO `trans_tbl` (`trans_id`, `users_id`, `dep_id`, `with_id`, `date`) VALUES
(5, 1004, 3, 6, ''),
(6, 1004, 4, 7, ''),
(7, 1004, 3, 6, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_deposit`
--
ALTER TABLE `tbl_deposit`
  ADD PRIMARY KEY (`d_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `tbl_withdraw`
--
ALTER TABLE `tbl_withdraw`
  ADD PRIMARY KEY (`w_id`);

--
-- Indexes for table `trans_tbl`
--
ALTER TABLE `trans_tbl`
  ADD PRIMARY KEY (`trans_id`),
  ADD KEY `trans_uid` (`users_id`),
  ADD KEY `trans_did` (`dep_id`),
  ADD KEY `trans_wid` (`with_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_deposit`
--
ALTER TABLE `tbl_deposit`
  MODIFY `d_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1005;

--
-- AUTO_INCREMENT for table `tbl_withdraw`
--
ALTER TABLE `tbl_withdraw`
  MODIFY `w_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `trans_tbl`
--
ALTER TABLE `trans_tbl`
  MODIFY `trans_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `trans_tbl`
--
ALTER TABLE `trans_tbl`
  ADD CONSTRAINT `trans_did` FOREIGN KEY (`dep_id`) REFERENCES `tbl_deposit` (`d_id`),
  ADD CONSTRAINT `trans_uid` FOREIGN KEY (`users_id`) REFERENCES `tbl_user` (`user_id`),
  ADD CONSTRAINT `trans_wid` FOREIGN KEY (`with_id`) REFERENCES `tbl_withdraw` (`w_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
