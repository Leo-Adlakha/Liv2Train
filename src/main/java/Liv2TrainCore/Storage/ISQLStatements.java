package Liv2TrainCore.Storage;

/**
 * Interface for all SQL Commands
 */
public interface ISQLStatements {

    public String listAllTrainingCenters();

    public String createTrainingCenter() ;

    public String listCenterCourses() ;

    public String createCourse() ;

}
