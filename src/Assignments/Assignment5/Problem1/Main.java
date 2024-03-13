package Assignments.Assignment5.Problem1;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("red", 5);
        Circle c2 = new Circle("blue", 10);
        Rectangle r1 = new Rectangle("green", 5, 10);
        Square s1 = new Square("yellow", 5);
        Square s2 = new Square("orange", 10);
        Shape[] shapes = {c1, c2, r1, s1, s2};
        printTotal(shapes);

    }

    public static void printTotal(Shape[] shapes) {
        double totalP = 0;
        double totalA = 0;
        for(Shape s: shapes){
            totalP += s.calculatePerimeter();
            totalA += s.calculateArea();
        }
        System.out.println("Total area: "+ totalA);
        System.out.println("Total perimeter: "+ totalP);
    }
}
