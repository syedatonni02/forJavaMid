package First;

public class JavaLab
{
    int id; String name; int age;
    static int count=0;

    JavaLab(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    JavaLab(){
        count++;
        System.out.println(" Student-"+count);
        System.out.println("-----------");
    }
    void objInfo(){
        System.out.println(" Id:"+id+"\tName:"+name+"\t\tAge:"+age);
    }
    static void pl(){
        System.out.println(" successfully done");
    }


}
