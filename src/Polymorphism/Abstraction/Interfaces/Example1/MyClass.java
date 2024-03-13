package Polymorphism.Abstraction.Interfaces.Example1;

public class MyClass implements MyInterface{

    @Override
    public void myAbstractMethod(){
        MyInterface.staticMethodInsideInterface();
        myMethodWithBody();
        System.out.println("My implementation.");

    }

    public static void main(String[] args){
        MyClass c = new MyClass();
        c.myAbstractMethod();
    }
}
