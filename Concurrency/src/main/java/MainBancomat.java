public class MainBancomat {
    public static void main(String[] args) {


    Bancomat ATM = new Bancomat(100000);


    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
           ATM.getoutmoney("Sara", 3000);
        }
    });


    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {

            ATM.getoutmoney("Saranush", 6000);
        }
    });

    Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {

            ATM.getoutmoney("Rise", 400000);
        }
    });

thread1.start();
thread2.start();
thread3.start();

}}


