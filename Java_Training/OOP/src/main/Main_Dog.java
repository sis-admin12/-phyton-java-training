package main;

import box.Dog;

public class Main_Dog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.Poroda = "mops";
        dog1.Clicika = "Jozy";
        dog1.viteza = 5;

        dog1.run();//afisam ce este in metoda run()

        String info1 = dog1.info();//afisam informatira returnata de metoda info()
        System.out.println(info1);
    }

}
