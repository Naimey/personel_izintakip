-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.30-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema izintakipsistem
--

CREATE DATABASE IF NOT EXISTS izintakipsistem;
USE izintakipsistem;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `kadi` varchar(45) NOT NULL,
  `sifre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`id`,`kadi`,`sifre`) VALUES 
 (0000000001,'naime','12345'),
 (0000000002,'esra','12346'),
 (0000000003,'hasan','45678'),
 (0000000004,'mehmet','85213'),
 (0000000005,'raziye','78945'),
 (0000000006,'tuncay','85213'),
 (0000000007,'ahmet','32100'),
 (0000000008,'selin','45236'),
 (0000000009,'fatma','21004'),
 (0000000010,'yusuf','78524'),
 (0000000011,'ceren','23108'),
 (0000000012,'yasemin','56123'),
 (0000000013,'nesrin','52123'),
 (0000000014,'hilmi','hilmican'),
 (0000000015,'can','cn12'),
 (0000000016,'melis','12538'),
 (0000000017,'furkan','frkn12'),
 (0000000018,'asli','asli'),
 (0000000019,'sibel','78412'),
 (0000000020,'alptekin','cavidan');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `izin`
--

DROP TABLE IF EXISTS `izin`;
CREATE TABLE `izin` (
  `kayit_no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `birim` varchar(45) NOT NULL,
  `sicil_no` int(10) unsigned NOT NULL,
  `kalan_izin_mik` int(10) unsigned NOT NULL,
  `izin_bas_tarih` date NOT NULL,
  `izin_bts_tarih` date NOT NULL,
  `izin_turu` varchar(45) NOT NULL,
  `kullanılan_izin_mik` int(10) unsigned NOT NULL,
  PRIMARY KEY (`kayit_no`),
  KEY `FK_izin_1` (`sicil_no`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `izin`
--

/*!40000 ALTER TABLE `izin` DISABLE KEYS */;
INSERT INTO `izin` (`kayit_no`,`birim`,`sicil_no`,`kalan_izin_mik`,`izin_bas_tarih`,`izin_bts_tarih`,`izin_turu`,`kullanılan_izin_mik`) VALUES 
 (1,'yazilim',1,20,'2016-05-20','2016-05-30','yillik',10),
 (2,'yönetim',2,10,'2016-04-10','2016-04-30','mazeret',20),
 (3,'donanim',3,27,'2016-02-04','2016-02-07','rapor',3),
 (4,'teknik',4,20,'2012-01-29','2012-02-11','ucretsiz',10),
 (5,'servis',5,28,'2005-01-29','2005-02-01','yillik',2),
 (6,'yazilim',6,8,'2008-02-20','2008-03-12','mazeret',22),
 (7,'donanim',7,20,'2013-05-08','2013-05-18','mazeret',10),
 (8,'yönetim',8,15,'2014-04-11','2014-04-26','ucretsiz',15),
 (9,'teknik',9,15,'2014-08-03','2014-08-18','mazeret',15),
 (10,'yönetim',10,20,'2015-08-24','2015-09-04','yillik',10),
 (11,'yönetim',11,20,'2016-05-20','2016-05-30','yillik',10),
 (12,'yazilim',12,10,'2016-04-10','2016-04-30','rapor',20),
 (13,'donanim',13,20,'2015-06-01','2015-06-11','mazeret',10),
 (14,'servis',14,15,'2016-03-25','2016-04-10','rapor',15),
 (15,'servis',15,17,'2013-02-05','2013-02-28','mazeret',13),
 (16,'teknik',16,3,'2016-08-01','2016-08-28','yillik',27),
 (17,'yönetim',17,6,'2014-09-04','2014-09-28','ucretsiz',24),
 (18,'yönetim',18,22,'2015-06-30','2015-07-08','ucretsiz',8),
 (19,'yazilim',19,25,'2015-12-30','2016-01-05','rapor',5),
 (20,'donanim',20,14,'2016-03-12','2016-03-28','yillik',16),
 (21,'yazilim',1,25,'2015-02-06','2015-02-16','yillik',10),
 (22,'yazilim',20,20,'2011-07-11','2020-11-07','yillik',5);
/*!40000 ALTER TABLE `izin` ENABLE KEYS */;


--
-- Definition of table `personel`
--

DROP TABLE IF EXISTS `personel`;
CREATE TABLE `personel` (
  `sicil_no` int(10) unsigned NOT NULL,
  `ad` varchar(45) NOT NULL,
  `soyad` varchar(45) NOT NULL,
  `tc_no` varchar(45) NOT NULL,
  `cinsiyet` varchar(45) NOT NULL,
  `dogum_tarihi` date NOT NULL,
  `sehir` varchar(45) NOT NULL,
  `k_adi` varchar(45) NOT NULL,
  `sifre` varchar(45) NOT NULL,
  PRIMARY KEY (`sicil_no`,`tc_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personel`
--

/*!40000 ALTER TABLE `personel` DISABLE KEYS */;
INSERT INTO `personel` (`sicil_no`,`ad`,`soyad`,`tc_no`,`cinsiyet`,`dogum_tarihi`,`sehir`,`k_adi`,`sifre`) VALUES 
 (1,'alpay','topal','12345678910','E','1994-04-27','adana','alpaytopal','alpaytopal1'),
 (2,'okan','tekin','12345678911','E','1993-02-18','adiyaman','okantekin','okantekin1'),
 (3,'emel','salman','12345678912','K','1997-08-16','konya','emelsalman','emelsalman1'),
 (4,'esra','sari','12345678913','K','1988-09-03','hatay','esrasari','esrasari1'),
 (5,'osman','kamas','12345678914','E','1996-07-30','nigde','osmankamas','osmankamas1'),
 (6,'izzet','can','12345678915','E','1992-03-24','ankara','izzetcan','izzetcan1'),
 (7,'bilgehan','cam','12345678910','K','1992-12-04','kars','bilgehancam','bilgehancam1'),
 (8,'hasret','kum','12345678917','K','2000-06-13','izmir','hasretkum','hasretkum1'),
 (9,'fatih','kalender','12345678918','E','1990-08-30','erzurum','fatihkalender','fatihkelender1'),
 (10,'bilgehan','cam','12345678919','E','1992-12-04','karsssli','bilgehancam','bilgehancam1'),
 (11,'bilgehan','cam','12345678919','K','1992-12-04','kars','bilgehancam','bilgehancam1'),
 (12,'buse','cebeci','23456789124','K','1980-03-07','denizli','busecebeci','busecebeci1'),
 (13,'burak','akkanat','23456789125','E','1981-06-01','bursa','burakakkanat','burakakkanat1'),
 (14,'cem','aglar','23456789126','E','1965-05-08','adana','cemaglar','cemaglar1'),
 (15,'canan','kanat','23456789127','K','1975-02-02','istanbul','canankanat','canankanat1'),
 (16,'canan','kanat','23456789127','K','1975-02-02','istanbul','canankanat','canankanat1'),
 (17,'emree','tekin','23456789129','E','1990-10-10','ankaraa','emretekinn','emretekin1'),
 (18,'evren','serin','23456789120','K','1992-11-11','eskisehir','evrenserin','evrenserin1'),
 (19,'gizem','yalcin','84561237045','K','1986-12-05','konya','gizemyalcin','gizemyalcin1'),
 (20,'mihriban','ay','23541957650','K','1982-09-15','adana','mihribanay','mihribanay1'),
 (21,'naime','yalcin','21','K','2009-10-03','adana','naimee','1234');
/*!40000 ALTER TABLE `personel` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
