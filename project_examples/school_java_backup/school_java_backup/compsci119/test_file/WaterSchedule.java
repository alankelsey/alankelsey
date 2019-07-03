//Alan Kelsey
//alankelsey@u.boisestate.edu
//

import java.util.Scanner;

public class WaterSchedule
{
    public static void main(String [] args)
    {
        char userGroupchar;
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your group letter: A,B,C,D");
        String userGroupString = userInput.nextLine();


        public char getGroup(String stringFromUser)
        {
       // char userGroupChar;

       // Scanner userInput = new Scanner(System.in);
       // System.out.println("Enter your group letter: A,B,C,D");
       // String userGroupString = userInput.nextLine();
        
        
        userGroupChar = stringFromUser.charAt(0);
        return userGroupChar;
        }
        
        
        System.out.println();
        System.out.println("your group is" + userGroupChar);
    
    }
}
