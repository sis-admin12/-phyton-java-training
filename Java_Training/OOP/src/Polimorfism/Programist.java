package Polimorfism;

public class Programist extends Worker implements Programming{
    public Programist(String name) {
        super(name);
    }

    @Override
    public void Programing() {
        System.out.println("Scriu cod!");
    }
}
