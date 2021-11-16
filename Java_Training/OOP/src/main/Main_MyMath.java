package main;

import test.MyMath;

public class Main_MyMath {
    public static void main(String[] args) {
       int result= MyMath.square(25);
        System.out.println(result);
        double lungime_cerc= MyMath.radius(6);
        System.out.println(lungime_cerc);
        double arie_cerc=MyMath.area(6);
        System.out.println(arie_cerc);

        int sum = MyMath.sum(1,2,3,3,3,4,4,5,6,7,8,9);
        System.out.println(sum);
    }
}
