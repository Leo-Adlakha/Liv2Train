# Liv2Train Assessment
Made by - Leo Adlakha

## Setup Instructions

#### 1. Please install Maven, Java 1.8, Postgres, Spring Boot and your favorite IDE to start the setup.
#### 2. Database Setup ( SQL Commands for the same are present in databaseScripts.sql for reference ).

- Create a database with the name liv2train
- Create two tables for the project as trainingcenter and courses.
- Enter any dummy data for the project ( or it may be done by sending requests ).

#### 3. Project Setup

- Change Directory to a suitable location for your project
- Clone the repository
```
$ git clone https://github.com/Leo-Adlakha/Liv2Train && cd Liv2Train/
```
- Install all the Maven Dependencies.
```
$ mvn clean install
```
- Run the project on PORT 8080 
```
$ java -jar target Liv2Train-0.0.1-SNAPSHOT.jar
```

#### 4. Send in your Requests
By Curl or Postman
- Get All Training Centers at localhost:8080/ in Postman.
- For Creating a new Training Center - Add Header Content-Type to application/json, then add below as your Body to create a Training Center -
```
{
    "id": 1,
    "centerName": "Training Center 1",
    "centerCode": "ABCD12342021",
    "address": {
        "detailedAddress": "A-21, Anand Niketan",
        "city": "New Delhi",
        "state": "Delhi",
        "pincode": 110021
    },
    "capacity": 100,
    "courses": [
        "Maths",
        "Science",
        "English"
    ],
    "email": "demo@test.com",
    "number": "9999888800"
}
```

Voilà, you created your first Training Center. Thanks!