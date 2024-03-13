package Polymorphism.Inheritance;

public class Manager extends Employee {
    private  double bonus;
    public  Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

