-- Create Table

Create table trainingcenter (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    code VARCHAR(12) NOT NULL UNIQUE,
    address VARCHAR(200),
    city VARCHAR(50),
    state VARCHAR(50),
    pincode INT,
    capacity INT,
    createdOn DATE,
    email VARCHAR(100),
    number VARCHAR(10)) ;

create table courses (
    id INT PRIMARY KEY,
    centerId INT NOT NULL,
    name VARCHAR(100)) ;

-- Insert in the table

-- Training Center
INSERT INTO trainingcenter VALUES (2, 'Angular Training Center', 'ABCD56782021', 'Mere papa ke ghar ka address', 'Bangalore', 'Karnataka', '110021', 100, current_timestamp, 'rk10172@gmail.com', '9136116785') ;

-- Courses
INSERT INTO courses(centerId, name) VALUES (4, 'Java AWT') ;