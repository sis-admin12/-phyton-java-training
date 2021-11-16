package main;

import box.Man;

public class Main {
    public static void main(String[] args) {
        Man Man1 = new Man();
        Man1.Age = 9;
        Man1.Height = 178;
        Man1.Name = "Jora";

        Man Man2 = new Man();
        Man2.Age = 1;
        Man2.Height = 171;
        Man2.Name = "Jopa";

        Man Man3 = new Man();
        Man3.Age = 21;
        Man3.Height = 188;
        Man3.Name = "Gora";

        Man[] men = new Man[3];
        men[0] = Man1;
        men[1] = Man2;
        men[2] = Man3;


        double sum = 0;
        for (int i = 0; i < men.length; i++) {
            sum += men[i].Age;
        }
        //media aritmetica
        double medAge = sum / men.length;
        System.out.println(medAge);

    }
}
