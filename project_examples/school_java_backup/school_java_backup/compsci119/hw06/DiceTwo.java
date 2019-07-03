//Alan Kelsey  
//alankelsey@u.boisestate.edu

import java.util.Random;

public class DiceTwo 
{
    public static void main(String[] args)
    {
    
        int resultOne = roll();
        System.out.println("First roll: " + resultOne);

        int resultTwo = roll();
        System.out.println("Second roll: " + resultTwo);


        int resultThree = roll();
        System.out.println("Third roll: " + resultThree);
    
    }
    
    //random roll method - picks random integer from 1 to 6
    public static int roll()
    {
        Random generator = new Random();

        int diceRoll = generator.nextInt(6);
        int randomValue = diceRoll + 1; // Added 1 to avoid zero and include 6
        return randomValue;


    }    

}
