package inheritance;

import java.util.Scanner;

public class StarEmployee extends Employee {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        System.out.print(" Enter Id: ");
        int id = inp.nextInt();
        System.out.print(" Enter Name: ");
        inp.nextLine();
        String name= inp.nextLine();
        System.out.print(" Enter Age: ");
        int age= inp.nextInt();

        StarEmployee o1=new StarEmployee();

        o1.id=id;
        o1.name=name;
        o1.age=age;

        o1.display();



        System.out.print(" Enter Id: ");
        id = inp.nextInt();
        System.out.print(" Enter Name: ");
        inp.nextLine();
        name= inp.nextLine();
        System.out.print(" Enter Age: ");
        age= inp.nextInt();

        StarEmployee o2=new StarEmployee();

        o2.id=id;
        o2.name=name;
        o2.age=age;

        o2.display();

    }

}
