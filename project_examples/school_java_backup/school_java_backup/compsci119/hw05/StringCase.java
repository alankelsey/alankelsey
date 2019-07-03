// Alan Kelsey
// alankelsey@u.boisestate.edu

import java.util.Scanner;

public class StringCase 
{

    public static void main(String[] args) 
    {

        //collect string from user
        System.out.print("Type a word or phrase: ");
        Scanner input = new Scanner(System.in);
        String userText = input.nextLine();
        
        //convert string to upper and lowercase
        String upperCaseText = userText.toLowerCase();
        String lowerCaseText = userText.toUpperCase();

        //print results
        System.out.println(upperCaseText + "\n" + lowerCaseText);
    }//end main

}//end StringCase
