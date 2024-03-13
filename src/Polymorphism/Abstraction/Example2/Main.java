package Polymorphism.Abstraction.Example2;

public class Main {

    public static void main(String[] args) {
        ClosedCurve[] shapes = {
                new Circle(4),
                new Triangle(3.0, 4.0),
                new Square(5.0),
                new Rectangle(2.0, 4.0)
        };

        System.out.println((char)('b' - 32));
        for(ClosedCurve s: shapes){
            double res = s.computeArea();
            System.out.println(s.getClass().getSimpleName()+": "+res);
        }

    }
}
