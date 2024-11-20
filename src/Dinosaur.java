import java.util.ArrayList;
import java.util.Random;

public class Dinosaur extends Creature{
    Random gen = new Random();

    public ArrayList<Dinosaur> team1= new ArrayList<>();



    //Constructor
    public Dinosaur() {
        intelligens = gen.nextInt(0, 10) + 1;      //Attributes between 1-10
        durability = gen.nextInt(0, 10) + 1;
        strength = gen.nextInt(0, 10) + 1;
    }

    //Methods

    public void contain(){
        for(int i = 0; i<n; i++){
            team1.add(new Dinosaur());
        }
    }
}
