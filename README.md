# Student Database Management

## Class
**Student**
	**Properties**
	
	1. Id
	2. FirstName
	3. LastName
	4. EmailId
	5. Address
	6. CreatedDate
	7. UpdatedDate
	
## SQL Schema	

**This schema generates a new database and creates a Student table**

```
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

```


## List of Request for Student Controller
[Student Controller](student-database-app/README.md)

**Get All Students**
``` 
Request Method - GET
URL - http://localhost:8080/student-portal/list-all
Response - [  {
        "id": 1,
        "address": "Kanchipuram",
        "firstName": "Nirmal",
        "lastName": "Kumar",
        "emailId": "nirmal@testleaf.com",
        "updatedDate": "2021-08-31T18:30:00.000+00:00",
        "createdDate": "2021-08-31T18:30:00.000+00:00"
    },
    {
        "id": 2,
        "address": "updated",
        "firstName": "Sethu",
        "lastName": "karthik",
        "emailId": "sethu@testleaf.com",
        "updatedDate": "2021-09-03T15:35:19.000+00:00",
        "createdDate": "2021-08-31T18:30:00.000+00:00"
    }
]
```

**Find Student by Id**
```
Request Method - GET
URL - http://localhost:8080/student-portal/find/1
Response - {
    "id": 1,
    "address": "Kanchipuram",
    "firstName": "Nirmal",
    "lastName": "Kumar",
    "emailId": "nirmal@testleaf.com",
    "updatedDate": "2021-08-31T18:30:00.000+00:00",
    "createdDate": "2021-08-31T18:30:00.000+00:00"
}
```

**Register New Student**
```
Request Method - POST
URL - http://localhost:8080/student-portal/register
Payload - {
   
    "address": "Chennai",
    "emailId": "Janani@testleaf.com",
    "firstName": "Janani",
    "lastName": ""
}

Response - Student has been registered successfull with register Id: 3
```

**Update student info**
```
Request Method - PUT
URL - http://localhost:8080/student-portal/update
Payload - {
   "id": 3,
   "address": "Chennai",
    "emailId": "Janani@testleaf.com",
    "firstName": "Janani",
    "lastName": " Velmurugan"
}

Response - Student details are updated!
```

**Delete student details**
```
Request Method - DELETE
URL - http://localhost:8080/student-portal?id=9
Params - id

Response - Student details deleted!
```
