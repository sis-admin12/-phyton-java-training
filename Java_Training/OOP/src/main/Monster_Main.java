package main;

import box.Monster;

public class Monster_Main {
    public static void main(String[] args) {
        Monster monster= new Monster();
        Monster monster1= new Monster(5);
        Monster monster2= new Monster(4,6);
        Monster monster3= new Monster(5,5,7);
        int picioare = monster.picioare;
        System.out.println(picioare);
        monster.voice();
        monster.voice(3);
        monster.voice(2,"pig pig");

    }
}
