package Assignments.Assignment4;

public class Main {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println("-------reverse digits----------");
        r.reverseDigits(1434);
        System.out.println("-------count digits----------");
        System.out.println(r.countDigits(86686));
        System.out.println("-------sum array----------");
        System.out.println(r.sumArr(new int[]{1,2,3,4,5, 10}));
    }
}