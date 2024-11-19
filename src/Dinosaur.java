import java.util.Random;

public class Dinosaur extends Creature{
    Random gen = new Random();

    //Constructor
    public Dinosaur() {
        intelligens = gen.nextInt(0, 10) + 1;      //Attributes between 1-10
        durability = gen.nextInt(0, 10) + 1;
        strength = gen.nextInt(0, 10) + 1;
    }




}
