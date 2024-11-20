import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public Program() {

        ArrayList<Dinosaur> team1= new ArrayList<>();
        ArrayList<Zombie> team2 = new ArrayList<>();

        System.out.println("Staring...");
        System.out.println("\nHow many creatures should each team contain?");
        Scanner sc = new Scanner(System.in);
        int awn = sc.nextInt();   //How many creatures the user put in each team

        for(int i=0; i<awn; i++){
            team1.add(new Dinosaur());
            team2.add(new Zombie());
        }
    }
}
