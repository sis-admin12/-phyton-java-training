package MultiThreading;

public class Многопоточность {

    static boolean win = false;

    public static void main(String[] args) throws InterruptedException {

        int k= (int)(Math.random()*1000000000);
        System.out.println("Numarul aleatoriu este: "+k);

        //timer
        Thread timer= new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                try {
                    while (!win){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //ghicirea numarului
        Thread ghicit = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win){
                int num_ghicit = (int) (Math.random() * 1000000000);
                if (num_ghicit == k) {
                    win = true;
                    System.out.println("Numarul ghicit este: " + num_ghicit);
                }}
            }
        });

        timer.start();
        ghicit.start();

}}

