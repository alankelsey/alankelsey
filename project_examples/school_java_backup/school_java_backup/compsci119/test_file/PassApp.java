// Alan Kelsey
// alankelsey@u.boisestate.edu

import java.util.Scanner;

public class PassApp {

        public static void main(String[] args) {

            //collect string from user
            System.out.print("Enter a string to mutate\n");
            Scanner input = new Scanner(System.in);
            String userString = input.nextLine();
       
            // convert string to upper and lowercase
            String upperCaseString = userString.toLowerCase();
            String lowerCaseString = userString.toUpperCase();
   
            //mix strings
            String firstString = upperCaseString.substring(2);
            String secondString = lowerCaseString.substring(3);
            System.out.println("your new pass is: " + firstString + secondString);
            
       
        }
}

