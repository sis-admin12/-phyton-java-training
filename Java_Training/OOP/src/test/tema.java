package test;

public class tema {
    private String name;
    private String functie;
    private int age;
    private double inaltimea;

    public tema(String name, String functie, int age, double inaltimea) {
        this.name = name;
        this.functie = functie;
        this.age = age;
        this.inaltimea = inaltimea;
    }

    public String getName() {
        return name;
    }

    public String getFunctie() {
        return functie;
    }

    public int getAge() {
        return age;
    }

    public double getInaltimea() {
        return inaltimea;
    }
}
