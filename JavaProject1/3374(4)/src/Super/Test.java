package Super;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        System.out.print(" Enter Id: ");
        int id = inp.nextInt();
        System.out.print(" Enter Name: ");
        inp.nextLine();
        String name = inp.nextLine();
        System.out.print(" Enter Power: ");
        int power = inp.nextInt();

        System.out.print("\n");
        Dinosaur d1 = new Dinosaur(id, name, power);
        d1.dis_din();
        d1.dis_mon();
        System.out.print("\n");
        d1.eat();
        System.out.print("\n");
        d1.calculate_power(power);
        d1.calculate_power(name,power);
    }
    }
