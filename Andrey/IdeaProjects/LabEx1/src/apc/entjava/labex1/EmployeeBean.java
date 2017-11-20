package apc.entjava.labex1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBean {

    public EmployeeBean() {
        this.employeeName = "Joe User";
        this.employeeID = "a1234";
        this.employeeHealthPlan = "CareFirst PPO";
    }

    private String employeeName;
    private String employeeID;
    private String employeeHealthPlan;


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeHealthPlan() {

        return employeeHealthPlan;
    }

    public void setEmployeeHealthPlan(String employeeHealthPlan) {
        this.employeeHealthPlan = employeeHealthPlan;
    }

    public String submit(){
        if(employeeName == "" || employeeID == "" || employeeHealthPlan == "") {
            return "error";
        }
        else{
            return "result";
        }
    }
}
