package Inheritance;

public class Lion extends Cat_family{

    public Lion() {
            super(2,4,2,1,true);
    }
   /* @Override
    public void eat(){
        System.out.println("Papa antilopa!");
    }*/

    @Override
    public void eat() {
        super.eat();
        System.out.println("antilopa!");
    }
}
