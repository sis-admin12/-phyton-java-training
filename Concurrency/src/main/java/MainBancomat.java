public class MainBancomat {
    public static void main(String[] args) {


    Bancomat ATM = new Bancomat(1000);

    
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
           ATM.getoutmoney("Sara", 300);
        }
    });


    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {

            ATM.getoutmoney("Saranush", 600);
        }
    });

    Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {

            ATM.getoutmoney("Rise", 400);
        }
    });

thread1.start();
thread2.start();
thread3.start();

}}


