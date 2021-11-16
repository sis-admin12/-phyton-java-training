import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

//        Set<Cars> cars = new TreeSet<>(new Comparator<Cars>() {
//            @Override
//            public int compare(Cars o1, Cars o2) {
//                return o1.getBrand().compareTo(o2.getBrand());
//            }
//        });

        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }

        });

//        for (int i=0; i<100; i++){
//            //cars.add(new Cars("BMW"+i,i));
//        }
//        for (Cars cars1:cars) {
//            System.out.println(cars1.getBrand()+" "+cars1.getNumber());
//        }

        for (int i=0; i<100; i++){
            numbers.add((int)(Math.random()*10));
        }
        for (int number: numbers) {
            System.out.println(number);
        }


    }
}
