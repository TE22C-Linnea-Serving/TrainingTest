import java.util.ArrayList;
import java.util.Random;

public class Zombie extends Creature{
    Random gen = new Random();

    public ArrayList<Zombie> team2 = new ArrayList<>();


    //Constructor
    public Zombie() {
        intelligens = gen.nextInt(0, 5) + 1;                     //Attributes between 1-5
        durability = gen.nextInt(0, 15) + 1;                     //Attributes between 1-15
        strength = gen.nextInt(0, 10) + 1;                       //Attributes between 1-10
    }

    // Methods
    public void contain2(){
        for(int i = 0; i<n; i++){
            team2.add(new Zombie());
        }
    }
}
