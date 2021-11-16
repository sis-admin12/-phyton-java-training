package Interface;

public class Director {
    public void force(int month, Finante finante) {
        String rap = finante.raport(month);
        System.out.println(rap);

    }
}
