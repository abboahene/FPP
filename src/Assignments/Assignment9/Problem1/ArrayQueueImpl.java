package Assignments.Assignment9.Problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    public void enqueue(int obj){
        if(rear == arr.length){
            resize();
        }
        if(front == -1) front++;
        arr[rear] = obj;
        rear++;
    }
    public int dequeue() {
        //implement
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front++];
    }
    public boolean isEmpty(){
        //implement
        return (front == rear) || (front == -1);
    }
    public int size(){
        //implement
        return rear - front;
    }
    private void resize(){
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp,0, arr.length);
        arr = temp;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = front; i < rear; i++){
            sb.append(arr[i]).append(" <- ");
        }
        sb.append("\b\b\b");
        return sb.toString();
    }
}
