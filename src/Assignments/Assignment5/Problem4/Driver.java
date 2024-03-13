package Assignments.Assignment5.Problem4;

public class Driver {
    public static void main(String[] args) {

        HourlyEmployee he1 = new HourlyEmployee("Son", "Zoe", "489345",20, 48);
        SalariedEmployee se1 = new SalariedEmployee("Gon", "Roe", "489344",1000);
        CommissionEmployee ce1 = new CommissionEmployee("Jon", "Doe", "489343",4900, 32);
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee("Tom", "Cat", "489342", 4830, 30, 2000);
        BasePlusCommissionEmployee bpce2 = new BasePlusCommissionEmployee("Bob", "Rat", "489341", 4930, 35, 2300);

        Employee[] employees = new Employee[5];
        employees[0] = he1;
        employees[1] = se1;
        employees[2] = ce1;
        employees[3] = bpce1;
        employees[4] = bpce2;

        double totalSalary = 0;
        for (Employee e : employees){
           // System.out.println(e.toString());
            totalSalary += e.getPayment();
        }

        System.out.println("The total salary is: " + totalSalary);

    }
}
