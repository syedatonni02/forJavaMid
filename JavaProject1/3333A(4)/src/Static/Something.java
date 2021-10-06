package Static;

public class Something {
//int count=0;
    static int count=0;
    static String city = "Dhaka";
Something(){
    count++;
    System.out.println(count);
}
static  int area(int x, int y){
    return  x*y;
}
// Static Block
/*static {
    int ans = Something.area(10,5);
    System.out.println(ans);
}*/

    public static void main(String[] args) {
        Something o1 = new Something();
        Something o2 = new Something();
        Something o3 = new Something();
        System.out.println(Something.city);
        city = "Chittagong";
        System.out.println(Something.city);
        int ans = Something.area(10,5);
        System.out.println(ans);


    }
}
