package Liv2TrainCore.Beans;

/**
 *
 * Courses Object for Training Center
 *
 */

public class Course {

    private Integer id ;
    private Integer centerId ;
    private String courseName ;

    public Course() {
    }

    public Course(Integer id, Integer centerId, String courseName) {
        this.id = id;
        this.centerId = centerId;
        this.courseName = courseName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
