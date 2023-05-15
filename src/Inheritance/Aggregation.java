package Inheritance;

//Employee that is part of the company
//Company
public class Aggregation {
    private Aggregation2 aggregation2;
    private String companyName;

    public Aggregation(Aggregation2 aggregation2, String companyName) {
        this.aggregation2 = aggregation2;
        this.companyName = companyName;
    }

    public Aggregation2 getAggregation2() {
        return aggregation2;
    }

    public void setAggregation2(Aggregation2 aggregation2) {
        this.aggregation2 = aggregation2;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Aggregation{" +
                "Employee Name = " + aggregation2.getEmployeeName() +
                ", companyName = '" + companyName + '\'' +
                '}';
    }
}
