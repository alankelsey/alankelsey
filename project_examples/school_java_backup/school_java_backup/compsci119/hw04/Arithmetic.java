//Alan Kelsey
//alankelsey@u.boisestate.edu

import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        
        //Create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //ask for and store user's numbers
        System.out.print("Enter your first number and press enter: "); 
        int userFirstNumber = keyboard.nextInt();
        System.out.println();
        System.out.print("Enter your second number and press enter: ");
        int userSecondNumber = keyboard.nextInt();
        System.out.println();

        //Initialize variables
        int sumResult = userFirstNumber + userSecondNumber;
        int differenceResult = userFirstNumber - userSecondNumber;
        int productResult = userFirstNumber * userSecondNumber;
        double quotientResult = userFirstNumber / (double)userSecondNumber;
        
        //Print sum results
        System.out.printf("The sum of %d " ,userFirstNumber);
        System.out.printf("and %d " ,userSecondNumber);
        System.out.printf("is %d.",sumResult); 
        System.out.println();
        System.out.println();

        //Print difference results
        System.out.printf("The difference of %d " ,userFirstNumber);
        System.out.printf("and %d " ,userSecondNumber);
        System.out.printf("is %d.",differenceResult);   
        System.out.println();
        System.out.println();

        //Print product result
        System.out.printf("The product of %d " ,userFirstNumber);
        System.out.printf("and %d " ,userSecondNumber);
        System.out.printf("is %d.",productResult);
        System.out.println();
        System.out.println();

        //Print quotient result
        System.out.printf("The quotient of %d " ,userFirstNumber);
        System.out.printf("and %d " ,userSecondNumber);
        System.out.printf("is " + quotientResult);    
        System.out.println();
    
    }//End main
}//End Arithmetic


