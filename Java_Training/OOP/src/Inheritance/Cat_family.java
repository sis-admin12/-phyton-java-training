package Inheritance;

public class Cat_family {
    private int urechi;
    private int picioare;
    private int ochi;
    private int coada;
    private boolean DeMarime;


    public Cat_family(int urechi, int picioare, int ochi, int coada, boolean deMarime) {
        this.urechi = urechi;
        this.picioare = picioare;
        this.ochi = ochi;
        this.coada = coada;
        DeMarime = deMarime;
    }

    public void showinfo(){
        System.out.println("Are "+urechi+" urechi");
        System.out.println("Are "+picioare+" picioare");
        System.out.println("Are "+ochi+" ochi");
        System.out.println("Este de marime mare- "+DeMarime);
    }

    public void setDeMarime(boolean deMarime) {
        DeMarime = deMarime;
    }

    public void eat(){
        System.out.println("Mananca");
    }
}
