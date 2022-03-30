import java.util.concurrent.*;

public class ThreadFactoryM {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });//face runable demon

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.print(".");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "John";
            }
        });//executorul nu poate intoarce ceva si cu ajutorul la Future putem returna ce avem nevoie

        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(4000);
                return 29;
            }
        });

        try {
            String name = futureName.get();//folosim get pentru a obtine datele necesare
            int age = futureAge.get();
            System.out.println("\nNumele este: " + name+"." + "\nAre: " + age+" ani.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
