package main;

import box.Box;

public class Box_Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(10,10,10);
        Box box3 = box1.sumBox(box2);
        Box box4 = new Box(box1, box3);
        box1.showVolum();
        box2.showVolum();
        box3.showVolum();
        double volumeSum = box1.volum() + box3.volum();
        System.out.println("box1 + box3 = " + volumeSum);
        box4.showVolum();
    }
}
