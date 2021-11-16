public class Array2 {
    public static void main(String[] args) {
        int[] array1 = new int[90];
        for (int i = 0; i < array1.length; i++)
        {
            array1[i]=i+10;
        }

        int[] array2= new int[array1.length];
        for (int i = 0, j= array1.length-1; i < array1.length; i++, j--)
        {
           array2[j] = array1[i];//primul element din array2 va fi egal cu ultimul din array1 si asa mai departe
        }
        for (int k : array2) {
            System.out.println(k);
        }
    }
}
