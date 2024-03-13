package Polymorphism.Abstraction.Interfaces.Example2;

public class MyClass implements MyInterface {


    @Override
    public void greet(){
        System.out.println("Hi");
    }

    public static void main(String[] args){
        MyClass c = new MyClass();
        c.myMethod();
    }
}
