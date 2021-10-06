package ClassObject2;

public class Switch {
    public static void main(String[] args) {
        //char ch='e';
        char ch='o';
        //int ah=10;
        //int ah=5;
        int ah=2;
        switch (ch){
            case 'a':
                System.out.println("a found");
                break;
            case 'e':
                switch (ah){
                    case 2:
                        int k=1;
                        do {
                            System.out.println(2*k);
                            k++;
                        }while (k<=10);
                        break;
                    case 5:
                        int j=1;
                        while (j<=10){
                            System.out.println(5*j);
                            j++;
                        }
                        System.out.println("5 found");
                        break;
                    case 10:
                        for(int i=1; i<=10; i++){
                            System.out.println(10*i);
                        }
                        //System.out.println("10 found");
                        break;
                }
                System.out.println("e found");
                break;
            case 'i':
                System.out.println("i found");
                break;
            case 'o':
                String s1="Northern";
               //s1=s1.concat(" University");
                s1=s1.concat(" University").concat(" Bangladesh");
                //System.out.println(s1);
                System.out.println(s1.toUpperCase());
                char cc=s1.charAt(5);
                System.out.println(cc);
                //System.out.println("o found");
                break;
            case 'u':
                System.out.println("u found");
                break;
            default:
                System.out.println("consonant foumd");

        }
    }
}
