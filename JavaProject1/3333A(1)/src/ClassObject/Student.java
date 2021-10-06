package ClassObject;
public class Student {
    int id;
    String name;
    float cgpa;
    String dept;

    public static void main(String[] args) {
        Student mahfuzur = new Student();
        Student asif = new Student();

        mahfuzur.id=1245; mahfuzur.name="Mahfuzur Rahman"; mahfuzur.cgpa=3.96f; mahfuzur.dept="CSE";
        asif.id=2563; asif.name="Asif Rahman"; asif.cgpa=3.95f; asif.dept="CSE";

        System.out.println("1st object information: " +" "+mahfuzur.id+" "+mahfuzur.name+" "+mahfuzur.cgpa+" "+mahfuzur.dept);
        System.out.println("2nd object information: " +" "+asif.id+" "+asif.name+" "+asif.cgpa+" "+asif.dept);
    }
}
