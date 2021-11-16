public class SwitchCase2 {
    public static void main(String[] args) {
        String Luna = "Februarie";
                switch (Luna)
                {
                    case "Ianuarie" , "Februarie", "Decembrie":
                        System.out.println("Este Iarna");
                        break;

                    case "Martie", "Aprilie", "Mai" :
                        System.out.println("Este Primavara");
                        break;

                    case "Iunie", "Iulie", "August"  :
                        System.out.println("Este Vara");
                        break;

                    case "Septembrie", "Noiembrie", "Octombrie" :
                        System.out.println("Este Toamna");
                        break;

                    default:
                        System.out.println("Nu exista asa luna!!!");
                        break;

                }
    }
}


