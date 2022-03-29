import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchR {


    public static void main(String[] args) {


   CountDownLatch countDownLatch = new CountDownLatch(3);
   ExecutorService executorService = Executors.newFixedThreadPool(3);


   Runnable task1 = new Runnable() {
       @Override
       public void run() {
           long sum =0;
            for (int i=0; i<1000000; i++){

            if(i%2 == 0){
                sum = sum + i;
                }
}
           System.out.println("Suma numarelor pare de la 0 pina la un milion este "+sum);
            countDownLatch.countDown();
       }

   };


        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                long sum =0;
                for (int i=0; i<1000000; i++){

                    if(i%7 == 0){
                        sum = sum + i;
                    }
                }
                System.out.println("Suma numarelor care se impart la 7 de la 0 pina la un milion este "+sum);
                countDownLatch.countDown();

            }
        };

        Runnable task3 = new Runnable() {
            @Override
            public void run() {

                List<Integer> list = new ArrayList<>();
                for (int i =0; i<1000; i++){
                    list.add((int)(Math.random()*1000));
                }
                int count = 0;
                for (int number: list) {
                    if( number %2 == 0){
                       count++;
                    }
                }
                System.out.println("Numarul numarelor pare din colectie  este "+count);
                countDownLatch.countDown();
            }
        };

        long before = System.currentTimeMillis();
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long after = System.currentTimeMillis();
        System.out.println("Timpul de executie " + (after-before));

    }}
