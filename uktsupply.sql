-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 03, 2021 at 02:15 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uktsupply`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `ShtoKamaten` ()  BEGIN
DECLARE kamateshuma double;
DECLARE debicount int(11);
DECLARE i int DEFAULT 0;
DECLARE idfaturatemp int(11);


SELECT COUNT(fatura.idfatura) INTO debicount
FROM fatura
WHERE fatura.statusi=0
AND DATE(NOW()) - fatura.afatiPageses > 0;

  WHILE i < debicount DO
 
 SELECT fatura.idfatura  INTO idfaturatemp
                        FROM fatura
                        WHERE fatura.statusi=0
                        AND DATE(NOW()) - fatura.afatiPageses > 0 LIMIT i,1;
  SET i = i+1;                 
                    
       SELECT shuma INTO kamateshuma
       FROM fatura
       WHERE DATE(NOW()) - fatura.afatiPageses > 0
       AND fatura.statusi=0
       AND fatura.idfatura = idfaturatemp;
                           
UPDATE fatura SET shuma = kamateshuma + kamateshuma*0.0005
WHERE fatura.statusi = 0
AND fatura.idfatura = idfaturatemp;
  END WHILE;                    
  
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `debi`
--

CREATE TABLE `debi` (
  `idfatura` int(11) NOT NULL,
  `numrikon` int(10) NOT NULL,
  `shuma` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `debi`
--

INSERT INTO `debi` (`idfatura`, `numrikon`, `shuma`) VALUES
(2, 145001, 630.315),
(5, 145002, 990.495),
(8, 145004, 660.33),
(10, 145005, 450.225),
(13, 145008, 750.375),
(14, 145008, 900.45),
(16, 1450010, 600.3),
(17, 1450010, 450.225),
(18, 1450011, 1050.525),
(19, 1450012, 750.375);

-- --------------------------------------------------------

--
-- Table structure for table `dega`
--

CREATE TABLE `dega` (
  `iddega` int(10) NOT NULL,
  `emri` varchar(50) NOT NULL,
  `adresa` varchar(50) NOT NULL,
  `nrpunonjesve` int(10) NOT NULL,
  `idmenaxheri` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dega`
--

INSERT INTO `dega` (`iddega`, `emri`, `adresa`, `nrpunonjesve`, `idmenaxheri`) VALUES
(10001, 'UKT Vasil Shanto', '12 Rruga Bulevardi Gjergj Fishta', 3, 'b6789h'),
(10002, 'UKT Brryli', '6 Rruga Xhanfize Keko', 3, 'd6789o'),
(10003, 'UKT 21 St Trenit', '9 Bulevardi Zogu I-re', 2, 'e6789r');

-- --------------------------------------------------------

--
-- Table structure for table `fatura`
--

CREATE TABLE `fatura` (
  `idfatura` int(10) NOT NULL,
  `sasiakonsumuar` double NOT NULL,
  `dataFillimit` date NOT NULL,
  `dataMbarimit` date NOT NULL,
  `dataPageses` date NOT NULL,
  `afatiPageses` date NOT NULL,
  `shuma` double NOT NULL,
  `statusi` tinyint(3) NOT NULL,
  `idpunonjes` varchar(10) NOT NULL,
  `numrikon` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fatura`
--

INSERT INTO `fatura` (`idfatura`, `sasiakonsumuar`, `dataFillimit`, `dataMbarimit`, `dataPageses`, `afatiPageses`, `shuma`, `statusi`, `idpunonjes`, `numrikon`) VALUES
(1, 20, '2020-11-09', '2020-12-09', '2020-12-15', '2020-12-31', 600, 1, 'b6789sh', 145001),
(2, 21, '2020-12-09', '2021-01-09', '0000-00-00', '2021-01-31', 630.315, 0, 'b6789sh', 145001),
(3, 30, '2020-10-17', '2020-11-17', '2020-11-25', '2020-11-30', 900, 1, 'd6789k', 145002),
(4, 32, '2020-11-17', '2020-12-17', '2020-12-23', '2020-12-31', 960, 1, 'd6789k', 145002),
(5, 33, '2020-12-17', '2021-01-17', '0000-00-00', '2021-01-31', 990.495, 0, 'd6789k', 145002),
(6, 15, '2020-10-19', '2020-11-19', '2020-11-20', '2020-11-30', 450, 1, 'm6789h', 145004),
(7, 20, '2020-11-19', '2020-12-19', '2020-12-26', '2020-12-31', 600, 1, 'm6789h', 145004),
(8, 22, '2020-12-19', '2021-01-19', '0000-00-00', '2021-01-31', 660.33, 0, 'm6789h', 145004),
(9, 20, '2020-11-24', '2020-12-24', '2020-12-28', '2020-12-31', 600, 1, 'm6789m', 145005),
(10, 15, '2020-12-24', '2021-01-24', '0000-00-00', '2021-01-31', 450.225, 0, 'm6789m', 145005),
(11, 25, '2020-12-12', '2021-01-12', '2021-01-18', '2021-01-31', 750, 1, 'b6789sh', 145006),
(12, 30, '2020-12-14', '2021-01-14', '2021-01-28', '2021-01-31', 900, 1, 'b6789sh', 145007),
(13, 25, '2020-11-09', '2020-12-09', '0000-00-00', '2020-12-31', 750.375, 0, 'd6789k', 145008),
(14, 30, '2020-12-09', '2021-01-09', '0000-00-00', '2021-01-31', 900.45, 0, 'd6789k', 145008),
(15, 15, '2020-12-02', '2021-01-02', '2021-01-08', '2021-01-31', 450, 1, 'm6789h', 145009),
(16, 20, '2020-11-06', '2020-12-06', '0000-00-00', '2020-12-31', 600.3, 0, 'm6789m', 1450010),
(17, 15, '2020-12-06', '2021-01-06', '0000-00-00', '2021-01-31', 450.225, 0, 'm6789m', 1450010),
(18, 35, '2020-12-17', '2021-01-17', '0000-00-00', '2021-01-31', 1050.525, 0, 'b6789sh', 1450011),
(19, 25, '2020-11-15', '2020-12-15', '0000-00-00', '2020-12-31', 750.375, 0, 'b6789sh', 1450012),
(20, 45, '2020-12-15', '2021-01-15', '0000-00-00', '2021-01-31', 1350.675, 0, 'b6789sh', 1450012);

--
-- Triggers `fatura`
--
DELIMITER $$
CREATE TRIGGER `ShtoDebi` AFTER UPDATE ON `fatura` FOR EACH ROW BEGIN
DECLARE debicount int(11);
DECLARE i int DEFAULT 0;
IF EXISTS(SELECT debi.idfatura, debi.numrikon,  debi.shuma
FROM debi, fatura
WHERE debi.idfatura = fatura.idfatura)

THEN
    UPDATE debi SET shuma=NEW.shuma
    WHERE idfatura = OLD.idfatura;

ELSE

SELECT COUNT(fatura.idfatura) INTO debicount
FROM fatura
WHERE fatura.statusi=0
AND DATE(NOW()) - fatura.afatiPageses > 0;

WHILE i<debicount DO

INSERT INTO debi (idfatura, numrikon, shuma)

SELECT idfatura, numrikon, shuma
FROM fatura
WHERE fatura.statusi=0
AND DATE(NOW()) - fatura.afatiPageses > 0 LIMIT i,1;

SET i = i+1;

END WHILE;
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `klient`
--

CREATE TABLE `klient` (
  `idklient` varchar(10) NOT NULL,
  `emri` varchar(30) NOT NULL,
  `mbiemri` varchar(30) NOT NULL,
  `gjinia` char(1) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefoni` int(10) NOT NULL,
  `adresa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `klient`
--

INSERT INTO `klient` (`idklient`, `emri`, `mbiemri`, `gjinia`, `dob`, `email`, `telefoni`, `adresa`) VALUES
('A12345j', 'Ana', 'Jones', 'F', '1998-02-20', 'a@jones.com', 435343234, 'Rue de la Ana'),
('a12345p', 'Andrew', 'Parker', 'M', '1989-05-13', 'andrew@email.com', 682385987, '18 Rue de Solar'),
('a12345t', 'Allison', 'Thomas', 'F', '2001-07-10', 'allison@email.com', 678736435, 'Rue de Ferrari'),
('d12345j', 'Daniel', 'Jones', 'M', '1996-01-16', 'daniel@email.com', 674565468, '7 Rue de Bonjour'),
('j12345g', 'Jack', 'Grace', 'M', '1996-01-16', 'jack@email.com', 67234867, '2 Rue de Loup'),
('j12345h', 'Jessica', 'Harris', 'F', '1993-09-14', 'jessica@email.com', 678329921, '11 Rue de Rain'),
('j12345n', 'Jacqueline', 'North', 'F', '1996-01-16', 'jacqueline@email.com', 679657375, '9 Rue de Flower'),
('j12345s', 'John', 'Smith', 'M', '1976-08-12', 'john@email.com', 683214512, '10 Rue de Fransua'),
('m12345b', 'Mary', 'Brown', 'F', '1996-01-16', 'mary@email.com', 672342318, '6 Rue de Rose'),
('s12345j', 'Samantha', 'Jackson', 'F', '1996-01-16', 'samantha@email.com', 67567532, '15 Rue de Flower'),
('t12345b', 'Tom', 'Mergushi', 'M', '1996-01-16', 'tom@email.com', 67535318, '14 Rue de Rose');

-- --------------------------------------------------------

--
-- Table structure for table `kontrata`
--

CREATE TABLE `kontrata` (
  `numrikon` int(10) NOT NULL,
  `nrmatesit` int(11) NOT NULL,
  `dataFillimit` date NOT NULL,
  `dataMbarimit` date NOT NULL,
  `nrfaturave` int(11) NOT NULL,
  `seksioni` varchar(30) NOT NULL,
  `aktive` tinyint(3) NOT NULL,
  `idklient` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kontrata`
--

INSERT INTO `kontrata` (`numrikon`, `nrmatesit`, `dataFillimit`, `dataMbarimit`, `nrfaturave`, `seksioni`, `aktive`, `idklient`) VALUES
(145001, 298001, '2020-11-09', '2022-11-09', 2, 'SC21', 1, 'a12345p'),
(145002, 298002, '2020-10-17', '2022-10-17', 3, 'SB12', 1, 'a12345t'),
(145003, 298003, '2021-01-15', '2023-01-15', 0, 'SB13', 1, 'd12345j'),
(145004, 298004, '2020-10-19', '2021-10-19', 3, 'SA2', 1, 'j12345g'),
(145005, 298005, '2020-11-24', '2023-11-24', 2, 'SC11', 1, 'j12345h'),
(145006, 298006, '2020-12-12', '2023-12-12', 1, 'SA7', 1, 'j12345n'),
(145007, 298007, '2020-12-14', '2022-12-14', 1, 'SB15', 1, 'j12345s'),
(145008, 298008, '2020-11-09', '2022-11-09', 2, 'SB12', 1, 'm12345b'),
(145009, 298009, '2020-12-02', '2022-12-02', 1, 'SA3', 1, 's12345j'),
(1450010, 2980010, '2020-11-06', '2022-11-06', 2, 'SC17', 1, 't12345b'),
(1450011, 2980011, '2020-12-17', '2022-12-17', 1, 'SB12', 1, 'a12345t'),
(1450012, 2980012, '2020-11-15', '2022-11-15', 2, 'SB13', 1, 'd12345j');

-- --------------------------------------------------------

--
-- Table structure for table `punonjes`
--

CREATE TABLE `punonjes` (
  `idpunonjes` varchar(10) NOT NULL,
  `emri` varchar(30) NOT NULL,
  `mbiemri` varchar(30) NOT NULL,
  `gjinia` char(1) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefon` int(10) NOT NULL,
  `adresa` varchar(100) NOT NULL,
  `paga` double NOT NULL,
  `iddega` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `punonjes`
--

INSERT INTO `punonjes` (`idpunonjes`, `emri`, `mbiemri`, `gjinia`, `dob`, `email`, `telefon`, `adresa`, `paga`, `iddega`) VALUES
('b6789h', 'Bardhyl', 'Hoxha', 'M', '1987-09-23', 'bardhyl@email.com', 686452424, '176 Rue de Pallati', 50000, 10001),
('b6789sh', 'Beni', 'Shehu', 'M', '1991-04-23', 'beni@email.com', 673532353, '178 Rue de Rue', 35000, 10002),
('d6789k', 'Dorian', 'Kraja', 'M', '1994-12-13', 'dorian@email.com', 682331299, '134 Rue de Parade', 35000, 10003),
('d6789m', 'Desara', 'Muco', 'F', '1997-10-15', 'desara@email.com', 673228744, '123 Rue de Bllok', 40000, 10001),
('d6789o', 'Drilona', 'Osmani', 'F', '1996-01-16', 'drilona@email.com', 687835876, '187 Rue de La la', 50000, 10002),
('e6789r', 'Eneid', 'Rama', 'M', '1963-06-05', 'eneid@email.com', 679343482, '65 Rue de Lelea', 40000, 10003),
('m6789h', 'Mentor', 'Haxhiu', 'M', '1985-11-13', 'mentor@email.com', 678923424, '76 Rue de Black', 40000, 10001),
('m6789m', 'Mira', 'Molla', 'F', '1989-05-13', 'mira@email.com', 688374353, '32 Rue de Milano', 40000, 10002);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `debi`
--
ALTER TABLE `debi`
  ADD PRIMARY KEY (`idfatura`,`numrikon`),
  ADD KEY `FKdebi581565` (`numrikon`);

--
-- Indexes for table `dega`
--
ALTER TABLE `dega`
  ADD PRIMARY KEY (`iddega`);

--
-- Indexes for table `fatura`
--
ALTER TABLE `fatura`
  ADD PRIMARY KEY (`idfatura`),
  ADD KEY `FKfatura820776` (`idpunonjes`),
  ADD KEY `FKfatura139556` (`numrikon`);

--
-- Indexes for table `klient`
--
ALTER TABLE `klient`
  ADD PRIMARY KEY (`idklient`);

--
-- Indexes for table `kontrata`
--
ALTER TABLE `kontrata`
  ADD PRIMARY KEY (`numrikon`),
  ADD KEY `FKkontrata377269` (`idklient`);

--
-- Indexes for table `punonjes`
--
ALTER TABLE `punonjes`
  ADD PRIMARY KEY (`idpunonjes`),
  ADD KEY `FKpunonjes794032` (`iddega`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dega`
--
ALTER TABLE `dega`
  MODIFY `iddega` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45346;

--
-- AUTO_INCREMENT for table `fatura`
--
ALTER TABLE `fatura`
  MODIFY `idfatura` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `kontrata`
--
ALTER TABLE `kontrata`
  MODIFY `numrikon` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1450014;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `debi`
--
ALTER TABLE `debi`
  ADD CONSTRAINT `FKdebi581565` FOREIGN KEY (`numrikon`) REFERENCES `kontrata` (`numrikon`);

--
-- Constraints for table `fatura`
--
ALTER TABLE `fatura`
  ADD CONSTRAINT `FKfatura139556` FOREIGN KEY (`numrikon`) REFERENCES `kontrata` (`numrikon`),
  ADD CONSTRAINT `FKfatura820776` FOREIGN KEY (`idpunonjes`) REFERENCES `punonjes` (`idpunonjes`);

--
-- Constraints for table `kontrata`
--
ALTER TABLE `kontrata`
  ADD CONSTRAINT `FKkontrata377269` FOREIGN KEY (`idklient`) REFERENCES `klient` (`idklient`);

--
-- Constraints for table `punonjes`
--
ALTER TABLE `punonjes`
  ADD CONSTRAINT `FKpunonjes794032` FOREIGN KEY (`iddega`) REFERENCES `dega` (`iddega`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
