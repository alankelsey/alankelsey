//alan kelsey
//alankelsey@u.boisestate.edu
//
//Program to convert standard english (read string)  into pig latin
//

import java.util.Scanner;

public class PigLatin 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type in your word and press enter: ");
        String firstWord = input.next();
        System.out.println();
        
        //create pig latin from word
        String lowerCaseString = firstWord.toLowerCase(); //first letter of word
        char lowerCaseLetter = lowerCaseString.charAt(0);
        String secondPart = firstWord.substring(1); //string minus first letter
        String ending = "ay";
        String pigEquiv = secondPart + lowerCaseLetter + ending; //glue it

        System.out.println("translation: " + pigEquiv);
        System.out.println();
    }
}

        
