package Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int a=0;
        int[] f=new int[3];

        try {
            int b=8/a;
            String c= "12fdfhkdf";
            int d = Integer.parseInt(c);

                System.out.println(f[5]);



        }catch (ArithmeticException e)
        {
            System.out.println("impartirea la zero este imposibil");
        }catch (NumberFormatException e1){
            System.out.println("format conversion error");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("nu exista element cu asa index");
        }
        System.out.println("Buna");

    }
}
