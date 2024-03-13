package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.println("My Queue queue:");
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        lq.dequeue();
        lq.display();

        System.out.println("Normal queue:");

        Queue<Integer> mq = new LinkedList<>();
        mq.add(42);
        mq.add(-3);
        mq.add(17); // front [42, -3, 17] back
        System.out.println(mq.remove()); // 42
    }
}
