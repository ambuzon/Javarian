package apc.entjava.managedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentBean {

    private String studentId;
    private String lastName;
    private String firstName;
    private String course;
    private int yearEnrolled;
    private int expectedGraduation;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(int yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public int getExpectedGraduation() {
        //int expectedGraduation = 4;
        return expectedGraduation;
    }

    public String submit() {
        this.expectedGraduation = this.yearEnrolled + 4;
        return "result";
    }
}
