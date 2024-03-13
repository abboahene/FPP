package Polymorphism.Inheritance;

import java.time.LocalDate;

public class Employee {

    //instance fields
    private String name;
    private  double salary;
    private LocalDate hireDay;

    Employee(String aName, double aSalary, int aYear, int aMonth, int aDay){
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(aYear, aMonth, aDay);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * (byPercent / 100);
        salary += raise;

    }
}
