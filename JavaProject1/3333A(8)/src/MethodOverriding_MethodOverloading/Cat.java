package MethodOverriding_MethodOverloading;

public class Cat extends Animal {
    void eat(){
        System.out.println("The cat is eating");
    }
    static void Sum(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    static void Sum(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);
    }
}
