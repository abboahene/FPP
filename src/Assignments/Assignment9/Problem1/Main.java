package Assignments.Assignment9.Problem1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl aQi = new ArrayQueueImpl();
        aQi.enqueue(4);
        aQi.enqueue(5);
        aQi.enqueue(6);
        aQi.enqueue(61);
        aQi.enqueue(51);
        aQi.enqueue(21);
        aQi.enqueue(81);
        aQi.enqueue(91);
        aQi.enqueue(11);
        aQi.enqueue(31);
        aQi.enqueue(41);
        aQi.enqueue(231);
        aQi.enqueue(411);

        aQi.dequeue();
        aQi.dequeue();
        aQi.dequeue();
        aQi.dequeue();
        aQi.dequeue();

        System.out.println("Queue size: " + aQi.size());
        System.out.println("Queue: " + aQi);

    }
}
