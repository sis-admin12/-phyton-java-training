package Colection;

public class Main_MyColection {
    public static void main(String[] args) {
        MyColection colectiv= new MyColection();
        colectiv.addname("Victor");
        colectiv.addname("Igor");
        colectiv.addname("Vasea");
        colectiv.addname("Mario");

        for (int i=0; i<colectiv.getSize();i++){
            System.out.println(colectiv.get(i));
        }

        int lungime=colectiv.getSize();
        System.out.println("Lungimea masivului inainte este: "+lungime);

        colectiv.deletename("Igor");
        colectiv.deletename("jora");

        for (int i=0; i<colectiv.getSize();i++){
            System.out.println(colectiv.get(i));
        }

        System.out.println("Lungimea masivului dupa stergere: "+colectiv.getSize());
    }
}
