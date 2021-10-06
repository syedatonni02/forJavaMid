package encapsulation;

public class Test {
    public static void main(String[] args) {
        Student o1= new Student();
        o1.setId(5);
        o1.setName("Tonni");
        System.out.println(o1.getId()+" "+o1.getName());
    }
}
