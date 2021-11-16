package box;

public class Box {
    private double H;
    private double L;
   private double l;
//cutie la care introducem fiecare parametru
   public Box(double H, double L, double l) {
        this.H = H;
        this.L = L;
        this.l = l;
    }
//cutie cu laturile egale
  public   Box(double size) {
        H = size;
        L = size;
        l = size;
    }
// cutie cu laturile nule
   public Box() {
        H = 0;
        L = 0;
        l = 0;
    }
//folosim ca parametru alta metoda
  public   Box(Box box) {
        this.H = box.H;
        this.L = box.L;
        this.l = box.l;
    }
//Tema box1+box2
//folosim ca parametri alte cutii
   public Box(Box box1, Box box2) {
        this.H = box1.H + box2.H;
        this.L = box1.L+ box2.L;
        this.l = box1.l + box2.l;
    }
//metoda setare dimensiuni
  public   void setDimens(double H, double L, double l) {
        this.H = H;
        this.L = L;
        this.l = l;
    }
//fiecare marime se inmulteste cu parametrul i
   public Box marire(int i) {
        return new Box(H*i, L * i, l * i);
    }
//suma a doua boxe
   public Box sumBox(Box box) {
        return new Box(this.H + box.H, this.L + box.L, this.l + box.l);
    }
//returneaza volumul
   public double volum() {
        return H * L * l;
    }
//afiseaza volumul
   public void showVolum() {
        System.out.println(volum());
    }

   public int comparare(Box box) {
        double thisVolum = volum();
        double boxVolum = box.volum();
        int result;
        if (thisVolum > boxVolum) {
            result = 1;
        } else if (thisVolum < boxVolum) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
