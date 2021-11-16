public class While {
    public static void main(String[] args) {
        int a = 10;
        int sum =0;
        int count = 0;
        while (a>=0)
        {

            if (a%2==0)
            {
                System.out.println(a);

                sum = sum +a;
                count = count+1;
            }
            a--;


        }
        System.out.println("Numarul numerelor pare " + count);
        System.out.println("Suma numereleor pare este " + sum);
        System.out.println("Media aritmetica este " + sum/count);

    }
}
