package inheritance;

public class Dog extends Cat{
    Dog(){
        super();
        System.out.println("Dog constructor");
    }
    void eat(){
        super.eat();
        //super.super.eat();
        System.out.println("Dog eating");

    }
}
