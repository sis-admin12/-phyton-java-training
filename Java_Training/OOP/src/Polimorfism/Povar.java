package Polimorfism;

public class Povar extends Worker implements cooking{
    public Povar(String name) {
        super(name);
    }

    @Override
    public void cooking() {
        System.out.println("Eu gatesc mancare!");
    }
}
