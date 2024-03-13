package Assignments.Assignment5.Problem2;

import java.time.LocalDate;

public class DeptEmployee {

    private String name;
    private LocalDate hireDate;
    private double salary;

    public DeptEmployee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.hireDate = LocalDate.of(year, month, day);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return salary;
    }
}
