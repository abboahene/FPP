package Assignments.Assignment5.Problem1;

public class Circle extends Shape{

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius* radius;
    }
    @Override
    double calculatePerimeter(){
        return  2 * Math.PI * radius;
    }
}
