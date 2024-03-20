package DataStructures.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(4);
        as.push(1);
        as.push(2);
        as.push(4);
        as.push(3);

        System.out.println(as.pop());
        as.pop();
        as.pop();
        System.out.println(as);

        System.out.println("Java stack");
        Stack<Integer> s = new Stack<>();
        s.push(42);
        s.push(-3);
        s.push(17); // [42, -3, 17]
        System.out.println(s.pop()); // 17

    }
}
