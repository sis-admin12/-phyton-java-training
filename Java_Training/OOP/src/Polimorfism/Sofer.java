package Polimorfism;

public class Sofer extends Worker implements driving{
    public Sofer(String name) {
        super(name);
    }

    @Override
    public void driving() {
        System.out.println("Eu conduc masina!");
    }
}
