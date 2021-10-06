package Array;

import java.util.Locale;

public class C {
    public static void main(String[] args) {
        String s1="Northern University Bangladesh";
        s1=s1.toUpperCase();
        System.out.println(s1);
        String word[]=s1.split(" ");
        for(int i=0;i<word.length;i++){
            //System.out.println(word[i]);
            System.out.print(word[i]+" ");
        }
    }
}
