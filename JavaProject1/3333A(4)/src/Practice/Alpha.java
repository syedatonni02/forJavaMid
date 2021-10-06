package Practice;

public class Alpha {
    static int a =10;
    static void display(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println(Alpha.a);
        Alpha.display();
        Alpha obj = new Alpha();
        obj.display();
    }
}
