package Assignments.Assignment9.Problem2;

public class Main {
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack();
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        System.out.println(as);
        as.pop();
        as.pop();
        as.pop();
        System.out.println(as);
        System.out.println(as.peek());

    }
}
