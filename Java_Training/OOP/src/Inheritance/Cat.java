package Inheritance;

public class Cat extends Cat_family{

    public Cat() {
        super(2,4,2,1,false);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("viscas!");
    }
}
