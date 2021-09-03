# Student Database Management

## List of Request for Student Controller

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
