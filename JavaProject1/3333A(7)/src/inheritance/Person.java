package inheritance;

public class Person {
    int id; String name;
    Person(){

    }
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    void dis_per(){
        System.out.println(id+" "+name);
    }
}
