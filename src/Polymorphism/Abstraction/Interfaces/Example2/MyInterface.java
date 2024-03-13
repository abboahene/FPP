package Polymorphism.Abstraction.Interfaces.Example2;

public interface MyInterface {

    public static final int num = 1000;
    public abstract void greet();
    private static void myStaticMethod(){
        System.out.println("Hello");
    }

    public default void myMethod(){
        printSomething();
        myStaticMethod();
    }

    private void printSomething(){
        System.out.println("Private Method in an Interface.");
    }

}
