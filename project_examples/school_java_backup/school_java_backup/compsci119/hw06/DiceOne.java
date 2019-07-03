//Alan Kelsey
//alankelsey@u.boisestate.edu

import java.util.Random;

public class DiceOne
{

    public static void main(String[] args) 
    {


        Random generator = new Random();
        
        //first roll
        int firstRoll = generator.nextInt(6);
        int randomValueOne = firstRoll + 1; // Added 1 to avoid zero
                                            // and include 6
        System.out.printf("Your first roll is: %d", randomValueOne);
        System.out.println();
        
        //second roll
        int secondRoll = generator.nextInt(6);
        int randomValueTwo = secondRoll + 1;
        System.out.printf("Your second roll is: %d", randomValueTwo);
        System.out.println();
        
        //third roll
        int thirdRoll = generator.nextInt(6);
        int randomValueThree = thirdRoll + 1;
        System.out.printf("Your third roll is: %d", randomValueThree);
        System.out.println();
    }
}
