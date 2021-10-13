package Super;

public class Dinosaur extends Monster{
    int dinosaur_id; String dinosaur_name; int dinosaur_power;
    Dinosaur(){

    }
    Dinosaur(int i,String n,int p){
        super(n,p);
        dinosaur_id=i;
        dinosaur_name=n;
        dinosaur_power=p;
    }
    void dis_din(){
        System.out.println(" "+dinosaur_id+" "+dinosaur_name+" "+dinosaur_power);
    }

    void eat(){
        System.out.println(" Dinosaur is eating");
    }

    void calculate_power(int monster_power){
        int mul=monster_power*10;
        System.out.println(" "+mul);
    }

    void calculate_power(String monster_name, int monster_power){
        System.out.println(" "+monster_name+" "+monster_power);
    }

}
