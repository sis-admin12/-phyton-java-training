public class Array3 {
    public static void main(String[] args) {
        String[] lunile = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
        //System.out.println("Lunile anului sunt: "+lunile[0]+","+lunile[1]+","+lunile[2]+","+lunile[3]+","+lunile[4]+","+lunile[5]+","+lunile[6]+","+lunile[7]+","+lunile[8]+","+lunile[9]+","+lunile[10]+","+lunile[11]+".");


        String[] months = {
                "Ianuarie",
                "Februarie",
                "Martie",
                "Aprilie",
                "Mai",
                "Iunie",
                "Iulie",
                "August",
                "Septembrie",
                "Octombrie",
                "Noiembrie",
                "Decembrie"
        };
        String result = "";

        for (int i=0; i<months.length; i++)
        {
            result += months[i];
            if (i==months.length-1)
            {
                result += ".";
            }
            else
            {
                result += ", ";
            }

        }
        System.out.println(result);
    }
}
