package box;

public class Dog {
    public String Clicika;
    public String Poroda;
    public int viteza;

    public void run() {//metoda care afiseaza ceva
        {
            String result = "";
            for (int i = 0; i < viteza; i++) {
                result += "Alerg";

                //Проверяем последнее ли это слово "alerg" - если последнее, то ставим !, если нет, то ставим запятую и пробел
                if (i == viteza - 1) {
                    result += "!!!";
                } else {
                    result += ", ";
                }
            }
            System.out.println(result);
        }
    }
    public String info()// motoda care nu afiseaza nimic ci doar returneaza ceva
        {
            return "Clicica este: "+Clicika+"\n"+"Poroda este: "+Poroda+"\n"+"Viteza este: "+viteza;
        }




}

