package apc.entjava.labex2;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBean {
    private String[] healthPlans = {"CareFirst PPO", "Blue Cross Blue Shield", "Humana", "Kaiser Permanente", "Aetna"};
    public EmployeeBean() {
        this.employeeName = "Joe User";
        this.employeeID = "a1234";
        this.employeeHealthPlan = "CareFirst PPO";
        for (int i=0; i<healthPlans.length; i++){
            String healthPlan = healthPlans[i];
        }
    }

    public String[] getHealthPlans() {
        return healthPlans;
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
