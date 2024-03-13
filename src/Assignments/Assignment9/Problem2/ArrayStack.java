package Assignments.Assignment9.Problem2;

public class ArrayStack {
    private class Node {
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
        }
    }
    private Node top;

    int size;

    ArrayStack(){
        size = 0;
    }

    public void push(Object o){
        Node newNode = new Node(o);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public Object pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return top.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node pointer = top;

       while(pointer != null){
           sb.append(pointer.data).append(" -> ");
           pointer = pointer.next;
       }
       sb.append("\b\b\b");

       return sb.toString();
    }
}
