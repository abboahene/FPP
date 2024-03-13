package Polymorphism.Abstraction.Example2;

public class Square implements ClosedCurve {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }
}
