//Alan Kelsey
//alankelsey@u.boisestate.edu
//

import java.util.Scanner;
import java.util.Calendar;

public class WaterSchedule
{
    public static void main(String [] args)
    {

   
        //instance variable for final group letter
        char a = 'a';
        char A = 'A';
        char b = 'b';
        char B = 'B';
        char c = 'c';
        char C = 'C';
       String groupAWinter = "Monday";
        String groupASpringFall = "Monday, Wednesday, Friday";
        String groupBWinter = "Tuesday";
        String groupBSpringFall = "Tuesday, Thursday, Saturday";
        String groupCWinter = "Monday";
        String groupCSpringFall = "Monday, Wednesday, Friday";
        String groupDWinter = "Monday";
        String groupDSpringFall = "Monday, Wednesday, Friday";
        String groupEWinter = "Monday";
        String groupESpringFall = "Monday, Wednesday, Friday";
        String groupFWinter = "Monday";
        String groupFSpringFall = "Monday, Wednesday, Friday";
        String summer = "Any day"; 
        int month;
        char group;

        //get date to see which month ti display
        Calendar newCal = Calendar.getInstance();
        int currentMonth = newCal;

               //Get String from user and convert to char
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your group letter: A,B,C,D");
        String userGroupString = userInput.nextLine();
        char userGroupChar = userGroupString.charAt(0);
        
    }//end of main

        public void  setSchedule(int month, char group)
        {
    if ((newCal.get(Calendar.MONTH) >= 11) || (newCal.get(Calendar.MONTH) <= 3))
        monthResponse = winter;
    else if ((newCal.get(Calendar.MONTH) == 3) || (newCal.get(Calendar.MONTH) == 4))
        {
             monthResponse = spring;
        }
    else if ((newCal.get(Calendar.MONTH) == 9) || (newCal.get(Calendar.MONTH) == 10))
    {
   
        monthResponse = Fall;
    }
    else if ((newCal.get(Calendar.MONTH) >= 5) || (newCal.get(Calendar.MONTH) <= 8))
    {
        monthResponse = summer;
    }
    else
        System.out.println("error with month");
        }//end get month
       
       
       public char setGroup(char group)
       { 
        //conditional logic
        if ((userGroupChar == A ) || (userGroupChar == a ))
        {
                System.out.println("Group A: Winter schedule is: Monday ");
        }
        else if ((userGroupChar == B) || (userGroupChar == b))
            System.out.println("Group B | Winter | Spring/fall | Summer");
        else if ((userGroupChar == C) || (userGroupChar == c))
            System.out.println("Group B | Winter | Spring/fall | Summer");
        else 
            System.out.println("Error not a group");    
        
        

        }//end set group

        public String finalResponse()
        {
        //for testing displays char
        System.out.println();
        System.out.println("your group is " + userGroupChar);
        System.out.println("The month is " + newCal.get(Calendar.MONTH));    
        }
    
}
