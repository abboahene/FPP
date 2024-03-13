package Assignments.Assignment5.Problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return  baseSalary + (super.getGrossSales() * (super.getCommissionRate() / 100));
    }

    @Override
    public String toString() {
        return super.toString() + "\b, baseSalary: " + baseSalary +"]";
    }

}
