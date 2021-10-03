package Liv2TrainCore.Storage.Impl;

import Liv2TrainCore.Storage.ISQLStatements;

/**
 * All required SQL Statements for the Project
 */
public class SQLStatements implements ISQLStatements {

    @Override
    public String listAllTrainingCenters() {
        return "SELECT * FROM trainingcenter";
    }

    @Override
    public String createTrainingCenter() {
        return "INSERT INTO trainingcenter VALUES (?, ?, ?, ?, ?, ?, ?, ?, current_timestamp, ?, ?) ;";
    }

    @Override
    public String listCenterCourses() {
        return "SELECT name FROM courses WHERE  centerId=?" ;
    }

    @Override
    public String createCourse() {
        return "INSERT INTO courses(centerId, name) VALUES (?, ?)" ;
    }

}
