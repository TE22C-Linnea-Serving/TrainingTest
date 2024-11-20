import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Creature {
    //Attributes
    int intelligens;
    int durability;
    int strength;
    int n;
    Random gen = new Random();
    int number = gen.nextInt(0,10) +1;         //Number can be a number between 0-10

    //Methods
    public int playChess(){
        int n1 = intelligens + number;
        if(n1>20){                                      //If the sum is bigger than 20, the method still returns 20
            n1 = 20;
        }
        return n1;
    }

    public int wrestle(){
        int n2 = durability + strength + number;
        if(n2>20){                                      //If the sum is bigger than 20, the method still returns 20
            n2 = 20;
        }
        return n2;
    }

    public int armWrestle(){
        int n3 = strength + number;
        if(n3>20){                                      //If the sum is bigger than 20, the method still returns 20
            n3 = 20;
        }
        return n3;
    }

    public int askPlayer(){
        System.out.println("\nHow many creatures should each team contain?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //How many creatures the user put in each team
        return n;
    }
}
