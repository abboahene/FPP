package Polymorphism.Inheritance.OrderOfExecution;

public class Child extends Parent{
    static String str;
    String instanceStr;

    static {
        str = "Hello World";
    }

    Child(int v) {
        super(v);
    }
}
