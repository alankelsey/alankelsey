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
        char d = 'd';
        char D = 'D';
        char e = 'e';
        char E = 'E';
        char f = 'f';
        char F = 'F';
        
        String groupAWinter = "Monday";
        String groupAFallSpring = "Monday, Wednesday, Friday";
        String groupBWinter = "Tuesday";
        String groupBFallSpring = "Tuesday, Thursday, Saturday";
        String groupCWinter = "Wednesday";
        String groupCFallSpring = "Monday, Wednesday, Friday";
        String groupDWinter = "Thursday";
        String groupDFallSpring = "Tuesday, Thursday, Saturday";
        String groupEWinter = "Friday";
        String groupEFallSpring = "Monday, Wednesday, Friday";
        String groupFWinter = "Saturday";
        String groupFFallSpring = "Tuesday, Thursday, Saturday";
        String summer = "Any day"; 
        //Calendar month;
        char group;



        //Get String from user and convert to char
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your group letter: A,B,C,D,E,F");
        String userGroupString = userInput.nextLine();
        char userGroupChar = userGroupString.charAt(0);

        //Set Calander
        Calendar newCal = Calendar.getInstance();
       // int month = newCal;
        
        //if winter per group
        if (((newCal.get(Calendar.MONTH) + 1) >= 11) || ((newCal.get(Calendar.MONTH) + 1) <= 3))
        {
            System.out.println("The Winter Schedule is: ");

            //display per group
            if ((userGroupChar == A ) || (userGroupChar == a ))
                System.out.println(groupAWinter);
            else if ((userGroupChar == B ) || (userGroupChar == b ))
                System.out.println(groupBWinter);
            else if ((userGroupChar == C ) || (userGroupChar == c ))
                System.out.println(groupCWinter);
            else if ((userGroupChar == D ) || (userGroupChar == d ))
                System.out.println(groupDWinter);
            else if ((userGroupChar == E ) || (userGroupChar == e ))
                System.out.println(groupEWinter);
            else if ((userGroupChar == F ) || (userGroupChar == f ))
                System.out.println(groupFWinter);
    
        }// end winter if
        
        //if Spring        
        else if (((newCal.get(Calendar.MONTH) + 1) == 3) || ((newCal.get(Calendar.MONTH) + 1) == 4))
        {
            System.out.println("The Spring Schedule is: ");
       
            if ((userGroupChar == A ) || (userGroupChar == a ))
                System.out.println(groupAFallSpring);
            else if ((userGroupChar == B ) || (userGroupChar == b ))
                System.out.println(groupBFallSpring);
            else if ((userGroupChar == C ) || (userGroupChar == c ))
                System.out.println(groupCFallSpring);
            else if ((userGroupChar == D ) || (userGroupChar == d ))
                System.out.println(groupDFallSpring);
            else if ((userGroupChar == E ) || (userGroupChar == e ))
                System.out.println(groupEFallSpring);
            else if ((userGroupChar == F ) || (userGroupChar == f ))
                System.out.println(groupFFallSpring);
        }//end spring if

        // if fall        
        else if (((newCal.get(Calendar.MONTH) + 1) == 9) || ((newCal.get(Calendar.MONTH) + 1) == 10))
        {
            System.out.println("The Fall Schedule is: ");
    
            if ((userGroupChar == A ) || (userGroupChar == a ))
                System.out.println(groupAFallSpring);
            else if ((userGroupChar == B ) || (userGroupChar == b ))
                System.out.println(groupBFallSpring);
            else if ((userGroupChar == C ) || (userGroupChar == c ))
                System.out.println(groupCFallSpring);
            else if ((userGroupChar == D ) || (userGroupChar == d ))
                System.out.println(groupDFallSpring);
            else if ((userGroupChar == E ) || (userGroupChar == e ))
                System.out.println(groupEFallSpring);
            else if ((userGroupChar == F ) || (userGroupChar == f ))
                System.out.println(groupFFallSpring);
        }//end fall if

        //if summer
        else if (((newCal.get(Calendar.MONTH) + 1) >= 5) || ((newCal.get(Calendar.MONTH) + 1) <= 8)) 
        {
            System.out.println("The Summer Schedule is: ");
            System.out.println(summer);
        }

      //for testing
//      System.out.println("testing... ");
//      System.out.println("your group is " + userGroupChar);
      System.out.println("The month is " + (newCal.get(Calendar.MONTH) + 1));    
//        
    }// END MAIN   
    
    //Set CAL - needed to create setter class once other classes are in place
//    public int setCal()
//    {
//        Calendar newCal = Calendar.getInstance();
//        month = newCal;
//    }//END OF SET CAL
                                            
}// END Class 

