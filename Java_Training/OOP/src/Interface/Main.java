package Interface;

public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        Finante finante= new Finante();
        director.force(12,finante);
//                (12, new Finante(){
//            @Override
//            public String raport(int i) {
//                return "Bine calculez pentru "+i+" luni.";
//            }
//        });

    }
}
