package Array;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s1 = inp.nextLine();
        boolean flag = true;
        for(int i=0; i<s1.length()/2; i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
