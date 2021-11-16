package Interface;

public class Finante implements Counter{

    @Override
    public String raport(int month) {

        return "Bine fac raportul pentru "+month+" luni.";
    }
}
