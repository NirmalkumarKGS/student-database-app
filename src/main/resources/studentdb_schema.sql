create database if not exists studentdb;

use studentdb;

DROP TABLE IF EXISTS `studentdb`.`student`;

CREATE TABLE `student` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(100) NOT NULL,
  `LastName` varchar(100) DEFAULT NULL,
  `EmailId` varchar(100) DEFAULT NULL,
  `Address` varchar(150) DEFAULT NULL,
  `CreatedDate` datetime NOT NULL,
  `UpdatedDate` datetime NOT NULL,
  PRIMARY KEY (`Id`)
);

Insert into student(FirstName,LastName,EmailId,Address,CreatedDate,UpdatedDate) values("Nirmal","Kumar","nirmal@testleaf.com","Kanchipuram","2021-09-01","2021-09-01");
Insert into student(FirstName,LastName,EmailId,Address,CreatedDate,UpdatedDate) values("Sethu","karthik","sethu@testleaf.com","Kanchipuram","2021-09-01","2021-09-01");


select * from student;
commit;