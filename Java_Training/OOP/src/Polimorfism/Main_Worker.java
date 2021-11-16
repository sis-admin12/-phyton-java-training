package Polimorfism;

import java.util.ArrayList;

public class Main_Worker {
    public static void main(String[] args) {


        Programist programist = new Programist("jora");
        Programist programist1= new Programist("Sasha");
        Programist programist2= new Programist("Saric");
        Povar povar=new Povar("Andre");
        Povar povar1 = new Povar("Alex");
        Povar povar2 = new Povar("Iura");
        Sofer sofer = new Sofer("Misha");
        Sofer sofer1 = new Sofer("Masha");
        Sofer sofer2= new Sofer("Tolea");

        ArrayList<Worker> lucrator = new ArrayList<>();
        lucrator.add(programist);
        lucrator.add(programist1);
        lucrator.add(programist2);
        lucrator.add(povar);
        lucrator.add(povar1);
        lucrator.add(povar2);
        lucrator.add(sofer);
        lucrator.add(sofer1);
        lucrator.add(sofer2);

        for (Worker lucratori: lucrator) {
            lucratori.voice();
                    }

        ArrayList<Programming> programmings= new ArrayList<>();
        programmings.add(programist);
        programmings.add(programist1);
        programmings.add(programist2);
        for (Programming programer: programmings) {
            programer.Programing();
        }

        ArrayList<cooking> cookings= new ArrayList<>();
        cookings.add(povar);
        cookings.add(povar1);
        cookings.add(povar2);
        for (cooking cooking: cookings) {
            cooking.cooking();
        }

        ArrayList<driving> drivings= new ArrayList<>();
        drivings.add(sofer);
        drivings.add(sofer1);
        drivings.add(sofer2);
        for (driving driving: drivings) {
            driving.driving();
        }
    }
}
