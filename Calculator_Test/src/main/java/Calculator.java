public class Calculator {

    public double adunare(double a, double b) {
        return a+b;
    }

    public double adunare(String a, String b) {
        int intA=Integer.parseInt(a);
        int intB=Integer.parseInt(b);
        return intA+intB;
    }

    public double inmultire(double a, double b) {
        return a*b;
    }
    public double inmultire(String a, String b) {
        double intA=Double.parseDouble(a);
        double intB=Double.parseDouble(b);
        return intA*intB;
    }

    public double impartire(double a, double b) {

        return a/b;
    }
    public double reidicare_la_putere(double a, double b) {
        return  Math.pow(a,b);
    }
}
