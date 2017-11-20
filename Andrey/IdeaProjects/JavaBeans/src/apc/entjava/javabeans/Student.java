package apc.entjava.javabeans;

public class Student {
    private String studentId;
    private String lastName;
    private String firstName;
    private String course;
    private int yearEnrolled;

    public Student(){

    }

    public Student(String studentId, String lastName, String firstName, String course, int yearEnrolled) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
        this.yearEnrolled = yearEnrolled;
    }

    public String getStudentID() {
        return studentId;
    }

    public void setStudentID(String studentID) {
        this.studentId = studentID;
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
}



