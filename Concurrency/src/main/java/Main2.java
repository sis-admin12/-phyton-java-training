import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        Thread thread1 = new Thread(new MyThread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list1.add(i);
                }
            }
        });

        Thread thread2 = new Thread(new MyThread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list2.add(i);
                }
            }
        });

        Thread thread3 = new Thread(new MyThread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list3.add(i);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());
    }
}
