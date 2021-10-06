package encapsulation;

public class Student {
    private int id;
    private String name;
    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
