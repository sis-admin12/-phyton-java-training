public class ElseIF {
    public static void main(String[] args) {
        String Luna = "Ianuarie";

        if(Luna.equals("Decembrie") || Luna.equals("Ianuarie") || Luna.equals("Februarie"))
            //se foloseste .equals pentru a ferifica daca stringurile sunt identice
        {
            System.out.println("Este Iarna");
        }
        else if(Luna.equals("Martie") || Luna.equals("Aprilie") || Luna.equals("Mai"))
        {
            System.out.println("Este Primavara");
        }
        else if(Luna.equals("Iunie") || Luna.equals("Iulie") || Luna.equals("August"))
        {
            System.out.println("Este Vara");
        }
        else if(Luna.equals("Septembrie")|| Luna.equals("Octombrie") || Luna.equals("Decembrie"))
        {
            System.out.println("Este Toamna");
        }
        else
        {
            System.out.println("Nu exista asa luna in anotimuri");
        }
    }
}
