package classObjectConstructor;

public class Test {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" prod_id"+" \t | "+"prod_name"+" \t | "+"prod_price"+" \t | "+"quantity");
        System.out.println("-----------------------------------------------------------------------");

        Agora a = new Agora(101,"Lays",50,20);
        a.display1();
        Agora b = new Agora(102,"Kitkat",60,10);
        b.display1();
        Agora c = new Agora(103,"Juice",20,10);
        c.display1();
        Agora d = new Agora(104,"Body Spray",300,5);
        d.display1();


        System.out.print("\n");

        a.display2();
        b.display2();
        c.display2();
        d.display2();

        System.out.print("\n");

        a.discount();
        b.discount();
        c.discount();
        d.discount();

    }
}
