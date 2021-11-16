package test;

public class random {
    public static void main(String[] args) {
        double c=Math.random();
        c*=6;
        int d= (int) c;//arata doar partea intreaga
        d++;

        //sau se poate si asa de facut (Math.randomn()*(max-min)+min)
        int e= (int)(Math.random()*90+10);

        String result = String.format("Numarul aleatoriul este %s, mai incercati.",e);
        System.out.println(result);
    }
}
