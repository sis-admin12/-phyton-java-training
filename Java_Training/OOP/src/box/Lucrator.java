package box;

public class Lucrator {

    String Nume;
    String Functie;
    Double Sal;

    public Lucrator(String nume, String functie, Double sal) {
        Nume = nume;
        Functie = functie;
        Sal = sal;
    }

    public String descriere(int i){
        return Nume+" - "+Functie+" are salariul pe intervalul de "+i+" luni: "+Sal*i;
    }
}
