//Alan Kelsey
//alankelsey@u.boisestate.edu

import java.util.Scanner;

public class Mutator 
{
    public static void main(String[] args)
    {
        //Collect string form user
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter some text: ");
        String userText = userInput.nextLine(); 
        
        //convert String to lower case
        String newText = userText.toLowerCase();
             
        //replace letters *mutate*
        String ninjaTurtleText = newText.replace('a','@')
            .replace('e', '3')
            .replace('i', '!')
            .replace('o', '0')
            .replace('b', '8')
            .replace(' ', '_');//space to underscore
        
       //display lowercase and mutated string
        System.out.print(newText + "\n" + ninjaTurtleText + "\n"); 
        

    }//end Main
}//end Mutator

