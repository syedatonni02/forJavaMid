package inheritance;

public class Employee extends Person {
    int id; double salary; String name;
    Employee(){

    }
    Employee(int i, String n, double s ){
        super(i,n);
        id=i;
        name=n;
        salary=s;
    }
    void dis_emp(){
        System.out.println(id+" "+name+" "+salary);
    }
}
