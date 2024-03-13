package Assignments.Assignment5.Problem1;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea(){
        return width * height;
    }
    @Override
    double calculatePerimeter(){
        return 2 * width + 2 * height;
    }
}
