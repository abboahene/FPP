package Polymorphism.Abstraction.Example2;

public class Triangle implements ClosedCurve{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}
