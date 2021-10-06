package constructor;

public class Student {
    String name,dept; int id; double cgpa;
    Student (String name, int id){
        this.name= name;
        this.id= id;
    }

    Student (String dept, double cgpa){
        this.dept= dept;
        this.cgpa= cgpa;
    }

    void method(){
        System.out.println("Name:"+name+" "+"ID:"+id);
    }

    void method2(){
        System.out.println("Dept:"+dept+" "+"CGPA:"+cgpa);
    }
}
