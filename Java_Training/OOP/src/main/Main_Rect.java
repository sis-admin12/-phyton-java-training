package main;

import box.Rect;

public class Main_Rect {
    public static void main(String[] args) {
        Rect R =new Rect();
        R.rect(4,5);
        System.out.println("Perimetrul este: "+R.perimetru());
        System.out.println("Aria este: "+R.aria());
    }
}
