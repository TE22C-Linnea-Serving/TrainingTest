public class Zombie extends Creature{

    //Constructor
    public Zombie() {
        intelligens = gen.nextInt(0, 5) + 1;                     //Attributes between 1-5
        durability = gen.nextInt(0, 15) + 1;                     //Attributes between 1-15
        strength = gen.nextInt(0, 10) + 1;                       //Attributes between 1-10
    }
}
