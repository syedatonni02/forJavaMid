package Super;

public class Monster {
    int monster_id; String monster_name;int monster_power;
    Monster(){

    }
    Monster(String monster_name, int monster_power ){
        this.monster_name=monster_name;
        this.monster_power=monster_power;
    }
    void dis_mon(){
        System.out.println(" "+monster_name+" "+monster_power);
    }

    void eat(){
        System.out.println(" Monster is eating");
    }

}

