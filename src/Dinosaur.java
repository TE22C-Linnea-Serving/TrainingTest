public class Dinosaur extends Creature{

    //Constructor
    public Dinosaur() {
        intelligens = gen.nextInt(0, 10) + 1;      //Attributes between 1-10
        durability = gen.nextInt(0, 10) + 1;
        strength = gen.nextInt(0, 10) + 1;
    }
}
