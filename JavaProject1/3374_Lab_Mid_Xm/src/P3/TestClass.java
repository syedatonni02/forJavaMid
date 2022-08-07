package P3;
//Name: Syeda Thamina Tonni
//ID: 04190301430
//Semester: 7
import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print(" Enter Hacker Id: ");
        int hackerId = inp.nextInt();
        System.out.print(" Enter Hacker Name: ");
        inp.nextLine();
        String hackerName= inp.nextLine();

        Hacker o1= new Hacker();
        o1.setHackerId(hackerId);
        o1.setHackerName(hackerName);
        System.out.println(o1.getHackerId()+" "+o1.getHackerName());

    }
}

