package Inheritance;

public class Main_Figure {
    public static void main(String[] args) {
        Dreptunghi drept=new Dreptunghi(2);
        Triunghi triun= new Triunghi(3,5,6);

        System.out.println(drept.area());
        System.out.println(triun.area());
    }
}
