package Polymorphism.Inheritance.OrderOfExecution;

public class Parent {
    static int value;
    int instanceValue;

    static {
        value = 10;
        System.out.println("Parent static block value = " + value);
    }

    {
        instanceValue = 10;
        System.out.println("Parent instance block value = " + instanceValue);
    }

    Parent(int v){
        instanceValue = v;
        System.out.println("Parent Constructor instanceValue = " + instanceValue);
    }
}
