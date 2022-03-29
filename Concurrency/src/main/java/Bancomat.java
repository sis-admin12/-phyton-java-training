public class Bancomat {

 private int balanta ;

 public final Object monitor = new Object();//abiect monitor

    public Bancomat(int balanta){
     this.balanta = balanta;
 }


    public void getoutmoney( String name, int sum){
        synchronized (monitor) {

        System.out.println(name + " s-a apropiat de bancomat");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        if(sum<=balanta){
            System.out.println(name+" a scos "+sum);
            this.balanta -= sum;
            System.out.println("in bancomat a ramas "+this.balanta);
        }else {
            System.out.println("In bancomat nu sunt bani deajuns pentru "+name+" , va rugam introduceti o suma mai mica decat "+this.balanta);
        }


    }}
}
