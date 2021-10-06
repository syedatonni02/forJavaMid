package Encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print(" Enter Name: ");
        String name= inp.nextLine();
        System.out.print(" Enter Id: ");
        int id = inp.nextInt();
        System.out.print(" Enter Age: ");
        int age= inp.nextInt();


        Admin o1= new Admin();
        o1.setName(name);
        o1.setId(id);
        o1.setAge(age);
        System.out.println(o1.getName()+" "+o1.getName()+" "+ o1.getAge());


        System.out.print(" Enter Name: ");
        inp.nextLine();
        name= inp.nextLine();
        System.out.print(" Enter Id: ");
        id = inp.nextInt();
        System.out.print(" Enter Age: ");
        age= inp.nextInt();


        Admin o2= new Admin();
        o2.setName(name);
        o2.setId(id);
        o2.setAge(age);
        System.out.println(o2.getName()+" "+o2.getName()+" "+ o2.getAge());



    }
}
