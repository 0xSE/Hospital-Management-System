create database HMS ; 
CREATE TABLE patient (
    id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(25),
    age INT,
    gender VARCHAR(6),
    address VARCHAR(50),
    contact VARCHAR(25)
);
CREATE TABLE diagnosis (
    id INT PRIMARY KEY AUTO_INCREMENT,
    doctor varchar(25),
    symptom VARCHAR(50),
    diagnosis VARCHAR(50),
    medicines VARCHAR(30)
);
CREATE TABLE doctor (
    id_doctor INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(25),
    age INT,
    gender VARCHAR(6),
    address VARCHAR(50),
    contact VARCHAR(25),
    password VARCHAR(45),
    Specialization VARCHAR(15)
);







































