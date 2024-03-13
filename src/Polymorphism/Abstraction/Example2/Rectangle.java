package Polymorphism.Abstraction.Example2;

public class Rectangle implements ClosedCurve {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}
