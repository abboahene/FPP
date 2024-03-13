package DataStructures.Stack;

import java.util.Arrays;

public class ArrayStack {
    private Object[] a;
    private int top;
    public ArrayStack(int n){
        a = new Object[n];
        top = -1;
    }

    public void push(Object o){
        if(top == a.length) System.out.println("Stack is full");
        top++;
        a[top] = o;
    }
    public Object pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        };
        top--;
        return a[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public Object peek(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return a[top];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       for(int i = 0 ; i <= top; i++){
           sb.append(a[i] + " -> ");
       }
       sb.append("\b\b\b");

       return sb.toString();
    }
}
