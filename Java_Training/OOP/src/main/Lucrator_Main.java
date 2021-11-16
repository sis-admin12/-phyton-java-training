package main;

import box.Lucrator;

public class Lucrator_Main {

    public static void main(String[] args) {
        Lucrator lucrator = new Lucrator("Vasea","inginer", 16000.10);
        String info=lucrator.descriere(12);
        System.out.println(info);
    }

}
