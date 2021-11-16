package Polimorfism;

public abstract class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
    public void voice(){
        System.out.println(name);
    }
}
