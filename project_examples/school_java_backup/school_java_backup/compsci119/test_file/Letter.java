// A program to translate a single word to Pig Latin (doesn't work with
// words that begin with a vowel)
// by Michael Stuart <michaelstuart@boisestate.edu>

import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        char firstLetter;
        String startingWord;

        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your word? ");
        startingWord = input.next();

        // Get the first character; make sure it is lower case
        String lowercaseStartingWord = startingWord.toLowerCase();
        firstLetter = lowercaseStartingWord.charAt(0);

        // Get the word without its first character
        String shortenedWord = startingWord.substring(1);

        // Create the final translated word
        String finalWord = shortenedWord + firstLetter + "ay";

        System.out.println("Translated Word: " + finalWord);
    }
}

