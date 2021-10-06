package Array;

public class A {
    public static void main(String[] args) {
        int sumR;
        int sumC;
        String s = "madam";
        int a[][]={
                {6,9,2},{3,5,7},{2,8,6}
        };
        for(int i=0; i<3; i++){
            sumR=0;
            for(int j=0; j<3; j++){
                sumR = sumR + a[i][j];
            }
            System.out.println(sumR);
        }

        for(int i=0; i<3; i++){
            sumC = 0;
            for(int j=0;j<3;j++){
                sumC = sumC + a[j][i];
            }
            System.out.println(sumC);
        }
        System.out.println(s.length());


    }
}
