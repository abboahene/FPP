package NestedClasses.NonStaticNestedClasses.AnonymousNestedClasses;

public class Vehicle {
    String name;
    Vehicle (){
    }
    Vehicle (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printSomething(){
        System.out.println("Vehicle");
    }
}
