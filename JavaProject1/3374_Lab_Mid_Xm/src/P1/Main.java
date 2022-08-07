package P1;
//Name: Syeda Thamina Tonni
//ID: 04190301430
//Semester: 7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print(" Enter Employee Id: ");
        int employeeId = inp.nextInt();
        System.out.print(" Enter Salary: ");
        double salary  = inp.nextInt();

        Salary s1=new Salary();
        s1.setSalary(salary);
        s1.discount_amt(salary);

    }
}




