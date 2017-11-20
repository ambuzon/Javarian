package apc.entjava.quiz1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ElectricCalculator {

    public String[] getCusTypes() {
        return cusTypes;
    }

    private String[] cusTypes = {"Residential", "Commercial"};

    public ElectricCalculator(){
        for(int i=0; i<cusTypes.length; i++){
            String Type = cusTypes[i];
        }
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        this.CustomerType = customerType;
    }

    public String getDateOfBilling() {
        return DateOfBilling;
    }

    public void setDateOfBilling(String dateOfBilling) {
        this.DateOfBilling = dateOfBilling;
    }

    public int getPreviousReading() {
        return PreviousReading;
    }

    public void setPreviousReading(int previousReading) {
        this.PreviousReading = previousReading;
    }

    public int getPresentReading() {
        return PresentReading;
    }

    public void setPresentReading(int presentReading) {
        this.PresentReading = presentReading;
    }

    private String CustomerName;
    private String CustomerType;
    private String DateOfBilling;
    private int PreviousReading;
    private int PresentReading;

    public double getTotalAmount() {
        TotalAmount = TotalKwhConsumed * RatePerKwh;
        return TotalAmount;
    }

    public int getTotalKwhConsumed() {
        TotalKwhConsumed = PresentReading - PreviousReading;
        return TotalKwhConsumed;
    }

    public double getRatePerKwh() {
        return RatePerKwh;
    }

    private double TotalAmount;
    private int TotalKwhConsumed;
    private double RatePerKwh;

    public String submit() {
        if(this.CustomerType.equals("Residential")){
            this.RatePerKwh = 1.50;
        }
        if(this.CustomerType.equals("Commercial")){
            this.RatePerKwh = 2.50;
        }

        return "result";
    }
}
