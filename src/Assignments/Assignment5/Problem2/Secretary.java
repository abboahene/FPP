package Assignments.Assignment5.Problem2;

public class Secretary extends DeptEmployee {
   private int overtimeHours;

    public Secretary(String name, double salary, int overtimeHours, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary(){
        return super.computeSalary() + 12 * overtimeHours;
    }

}
