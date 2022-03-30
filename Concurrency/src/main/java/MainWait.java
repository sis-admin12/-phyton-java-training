public class MainWait {

    private static final Object monitor = new Object();
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static  String nextChar = A;
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextChar.equals(A))
                                monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(A);
                        nextChar = B;
                        monitor.notifyAll();
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextChar.equals(B))
                                monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(B);
                        nextChar = C;
                        monitor.notifyAll();
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextChar.equals(C))
                                monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(C);
                        nextChar = A;
                        monitor.notifyAll();
                    }
                }
            }
        }).start();

    }
}
