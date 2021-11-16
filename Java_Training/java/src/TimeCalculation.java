public class TimeCalculation {
    public static void main(String[] args) {
        int time = 2678401;
        int secinmin = 60;
        int secinhour = secinmin*60;
        int secinday = secinhour*24;
        int secinmounth = secinday*30;
        int secinyear = secinday*365;
// % ne da restul la impartire
        int years = time / secinyear;
        int months = (time % secinyear)/secinmounth;
        int days = ((time % secinyear)%secinmounth)/secinday;
        int hours = (((time % secinyear)%secinmounth)%secinday)/secinhour;
        int min = ((((time % secinyear)%secinmounth)%secinday)%secinhour)/secinmin;
        int secleft = ((((time % secinyear)%secinmounth)%secinday)%secinhour)%secinmin;




        System.out.println("Secunde intr-o minuta "  + secinmin);
        System.out.println("Secunde intr-o ora " + secinhour);
        System.out.println("Secunde intr-o zi " + secinday);
        System.out.println("Secunde intr-un an " + secinyear);
        System.out.println("numarul contine " +years + " ani");
        System.out.println("numarul contine " +months + " luni");
        System.out.println("numarul contine " +days + " zile");
        System.out.println("numarul contine " +hours + " ore");
        System.out.println("numarul contine " +min + " minute");
        System.out.println("Au ramas " +secleft + " secunde");
    }
}
