package MethodOverriding_MethodOverloading;

public class Test {
    public static void main(String[] args) {
        Cat o1=new Cat();
        o1.eat();
        o1.Sum(20,20,20);
        o1.Sum(40,40);
        Cat.Sum(23,45,22);
        Cat.Sum(24,45);
    }
}
