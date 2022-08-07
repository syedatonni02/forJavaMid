package P2;

import java.util.Scanner;

//Name: Syeda Thamina Tonni
//ID: 04190301430
//Semester: 7
public class Test {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.print(" Enter Name: ");
        String name = inp.nextLine();
        System.out.print(" Enter Hero Point: ");
        int heropoint = inp.nextInt();

        System.out.println();
        SuperMan o1 = new SuperMan();
        o1.methodCaller(name,heropoint);
    }
}


