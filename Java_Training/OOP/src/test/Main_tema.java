package test;

public class Main_tema {
    public static void main(String[] args) {
        final String  fraza="Acesta este Ion, are 34 de ani, inaltimea de 170 cm. El este inginer.";
        String name=fraza.substring(12,15);
        String functie=fraza.substring(61,68);
        String h=fraza.substring(45,48);
        double inaltime=Double.parseDouble(h);
        String a=fraza.substring(21,23);
        int age=Integer.parseInt(a);



      tema tema1=new tema(name,functie,age,inaltime);
        System.out.println(tema1.getName());
        System.out.println(tema1.getAge());
        System.out.println(tema1.getInaltimea());
        System.out.println(tema1.getFunctie());

    }
}
