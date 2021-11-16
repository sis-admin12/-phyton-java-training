package Inheritance;

public abstract class Figure {//daca are macar un constructor abstract deci si el devine abstract
    private double a;
    private double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double area();//se scrie abstract pentru ca nu intoarce nimic si recpectiv metoda trebuie refacuta in alte clase

    public final double getA() {//final se foloseste daca nu dorim ca sa mai fie schimbata valoarea
        return a;
    }

    public final double getB() {
        return b;
    }
}
