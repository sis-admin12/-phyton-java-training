package Inheritance;


public class Triunghi extends Figure{

    private double c;
    public Triunghi(double a, double b, double c) {
        super(a, b);
        this.c=c;
    }

    public Triunghi(double y) {
        super(y,y);
        this.c=y;
    }

    @Override
    public double area() {
       double p=(getB()+getA()+c)/2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-c));
    }
}
