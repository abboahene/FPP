package Polymorphism.Abstraction.Example2;

public class Circle implements ClosedCurve {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
