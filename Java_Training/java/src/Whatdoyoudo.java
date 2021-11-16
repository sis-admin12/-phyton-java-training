public class Whatdoyoudo {
    public static void main(String[] args) {
        int time = 20;
        boolean timpbun = false;
        boolean timptirziu = time >= 22 || time <=5;

        if ( timptirziu)
        {
            System.out.println("La culcare");
        }
        if (!timptirziu && timpbun)
        {
            System.out.println("La plimbare");
        }
        if (!timptirziu && !timpbun)
        {
            System.out.println("Citeste o carte");
        }


    }
}
