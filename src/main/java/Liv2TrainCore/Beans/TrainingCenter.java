package Liv2TrainCore.Beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * Training Center Object
 *
 */

public class TrainingCenter {

    private Integer id ;
    @Pattern(regexp = "^[a-zA-Z0-9]{1,40}$", message = "Center Name may not exceed 40 characters.")
    private String centerName ;
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Invalid Center Code.")
    private String centerCode ;
    private CenterAddress address ;
    private Integer capacity ;
    private List<String> courses ;
    private LocalDate createdOn ;
    @Email(message = "Invalid Email Address.")
    private String email ;
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid Phone Number.")
    private String number ;

    public TrainingCenter() {
    }

    public TrainingCenter(String centerName, String centerCode, CenterAddress address, Integer capacity, List<String> courses, LocalDate createdOn, String email, String number) {
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.capacity = capacity;
        this.courses = courses;
        this.createdOn = LocalDate.now() ;
        this.email = email;
        this.number = number;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public CenterAddress getAddress() {
        return address;
    }

    public void setAddress(CenterAddress address) {
        this.address = address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
