package HW1;
public class Test {
    public static void main(String[] args) {
        A object1 = new A();
        A object2 = new A();
        B object3 = new B();
        B object4 = new B();
        C object5 = new C();
        C object6 = new C();

        object1.restaurant_name = "The Fat Duck";
        object2.restaurant_name = "Eleven Madison Park";
        object3.owner = "Heston Blumenthal";
        object4.owner = "Daniel Humm";
        object5.food_type = "British/French Cuisine";
        object6.food_type = "Contemporary American";

        System.out.println("Restaurant Name: "+object1.restaurant_name);
        System.out.println("Owner: "+object3.owner);
        System.out.println("Food Type: "+object5.food_type);
        System.out.print("\n");
        System.out.println("Restaurant Name: "+object2.restaurant_name);
        System.out.println("Owner: "+object4.owner);
        System.out.println("Food Type: "+object6.food_type);

    }
}
