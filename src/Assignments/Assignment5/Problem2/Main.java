package Assignments.Assignment5.Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Tom", 2000, 4, 1997, 4,13);
        Professor p2 = new Professor("Rob", 2500, 7, 1995, 7,20);
        Professor p3 = new Professor("Bom", 2700, 10, 1992, 9,12);
        Secretary s1 = new Secretary("Sue", 1500, 5, 1999, 3, 14);
        Secretary s2 = new Secretary("Ama", 1700, 9, 1998, 5, 11);
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the sum of all Professor and Secretaries salary?");
        String answer = sc.next();

        if(answer.equals("Y")){
            double sum = 0;
            for (DeptEmployee e: department){
                sum += e.computeSalary();
            }
            System.out.println("Sum of salaries: "+ sum);
        }

    }
}

