package box;

public class Om {
    private String Name;
    private int age;

    public Om(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }
    public void show_info(){
        System.out.println("Numele este: "+Name+".");
        System.out.println("Virsta este de: "+age+" de ani.");
    }
    public void setage(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Anii nu pot fi mai mici decit zero!");
        }

    }

    public int getage(){
        return age;
    }
    public String getName(){
        return Name;
    }
}
