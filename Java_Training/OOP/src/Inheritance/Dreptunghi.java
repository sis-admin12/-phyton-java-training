package Inheritance;

public class Dreptunghi extends Figure{
    public Dreptunghi(double a, double b) {
        super(a,b);
    }
    public Dreptunghi(double a) {
        super(a,a);

    }

    @Override
    public double area() {
        return getA()*getB();
    }
}
