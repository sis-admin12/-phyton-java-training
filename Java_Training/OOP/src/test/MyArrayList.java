package test;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> combi = new ArrayList<>();

        //adaug numerele in prima colectie
        for(int i=1; i<=10; i++){
            numbers.add(i);
                   }
        //afisez numerele
        for (int i : numbers){
            System.out.println(i);
        }

        //adaug nume in a doua colectie
        for(int i=1; i<=numbers.size();i++)
        {
            names.add("Adam-"+i);
        }

       /* names.add("Sara");
        names.add("Siri");
        names.add("Sorina");
        names.add("Sabina");
        names.add("Scufita");
        names.add("Sasha");
        names.add("Silvia");
        names.add("Sabrina");
        names.add("Silicia");
        names.add("Soroca");*/

        //afisez numele
        for(String s: names){
            System.out.println(s);
        }

        //adaug in colectia 3
        for (int i = 0; i < numbers.size(); i++) {
            String comb = numbers.get(i) + " - " + names.get(i);
            combi.add(comb);
        }
        for (String s : combi) {
            System.out.println(s);
        }









    }
}
