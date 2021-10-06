package First;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        JavaLab s1 = new JavaLab();
        System.out.print(" Enter Id: ");
        int id = inp.nextInt();
        //System.out.println("Id:"+id);
        System.out.print(" Enter Name: ");
        inp.nextLine();
        String name= inp.nextLine();
        //System.out.println("Name:"+name);
        System.out.print(" Enter Age: ");
        int age= inp.nextInt();
        //System.out.println("Age:"+age);

        s1.id=id;
        s1.name=name;
        s1.age=age;

        System.out.print("\n");

        JavaLab s2=new JavaLab();
        System.out.print(" Enter Id: ");
        id= inp.nextInt();
        //System.out.println("Id:"+id);
        System.out.print(" Enter Name: ");
        inp.nextLine();
        name= inp.nextLine();
        //System.out.println("Name:"+name);
        System.out.print(" Enter Age: ");
        age= inp.nextInt();
        //System.out.println("Age:"+age);

        s2.id=id;
        s2.name=name;
        s2.age=age;

        System.out.print("\n");

        JavaLab s3=new JavaLab();
        System.out.print(" Enter Id: ");
        id= inp.nextInt();
        //System.out.println("Id:"+id);
        System.out.print(" Enter Name: ");
        inp.nextLine();
        name= inp.nextLine();
        //System.out.println("Name:"+name);
        System.out.print(" Enter Age: ");
        age= inp.nextInt();
        //System.out.println("Age:"+age);

        s3.id=id;
        s3.name=name;
        s3.age=age;

        System.out.print("\n");

        System.out.print(" Enter Integer Input for Switch Case: ");
        int ah= inp.nextInt();
        switch (ah){
            case 1:
                System.out.println(" Student-1 Information: ");
                System.out.println("------------------------");
                s1.objInfo();
                System.out.print("\n");

                System.out.println(" Student-2 Information:n");
                System.out.println("------------------------");
                s2.objInfo();
                System.out.print("\n");

                System.out.println(" Student-3 Information: ");
                System.out.println("------------------------");
                s3.objInfo();
                break;

            case 2:
                JavaLab.pl();
                break;
        }

    }

}
