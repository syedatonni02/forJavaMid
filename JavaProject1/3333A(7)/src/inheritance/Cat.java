package inheritance;

public class Cat extends Animal{
    Cat(){
        //super();
        System.out.println("Cat constructor");
    }
    void eat(){
        System.out.println("Cat Eating");
        //super.eat();
    }
}
