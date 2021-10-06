package Scanner;

import java.util.Scanner;

public class Something {

        /*static int count=0;
        static String city = "Dhaka";
        Something(){
            count++;
            System.out.println(count);
        }
        static  int area(int x, int y){
            return  x*y;
        }*/

        public static void main(String[] args) {

            //city = "Chittagong";
            Scanner inp = new Scanner(System.in);
            System.out.println("Input the first number");
            int a = inp.nextInt();
            System.out.println(a);
            System.out.println("Input a word");
            inp.nextLine();
            String str = inp.nextLine();
            System.out.println("Your word is : " +str);

        }
    }



