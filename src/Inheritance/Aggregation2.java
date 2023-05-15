package Inheritance;

//Employee that is part of the company
//Company
public class Aggregation2 {
    private String employeeName;

    public Aggregation2(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
