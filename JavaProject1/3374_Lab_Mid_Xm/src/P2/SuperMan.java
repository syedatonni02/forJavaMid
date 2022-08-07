package P2;
//Name: Syeda Thamina Tonni
//ID: 04190301430
//Semester: 7
public class SuperMan extends Hero {
    String name;
    int heropoint;
    void methodCaller(String n, int h){
        super.displayHero(n,h);
        name=n;
        heropoint=h;
    }

}



