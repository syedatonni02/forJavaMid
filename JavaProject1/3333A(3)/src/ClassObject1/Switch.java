package ClassObject1;

public class Switch {
    public static void main(String[] args) {
        int month = 1;
        String ch = "";
        switch (month){
            case 1: ch = "1:January Month";
            break;
            case 2: ch = "2:February Month";
            break;
            default:
                System.out.println("Invalid");
        }
        System.out.println(ch);
    }
}
