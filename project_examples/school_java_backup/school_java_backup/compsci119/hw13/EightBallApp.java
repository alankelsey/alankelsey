//Alan Kelsey
//alankelsey@u.boisestate.edu
//
//Prompts user for question and displays result useing EightBall class
//

import java.util.Scanner;

public class EightBallApp
{
    public static void main(String[] args)
    {
        runApp();
            
        System.out.println("Good Bye!");
    }
    //main part of app - calls eight ball  
    public static void runApp()
    {
        Scanner prompt = new Scanner(System.in);
        EightBall answer = new EightBall();

        String reply;
        int replyLength;

        System.out.println("Please type a question and press enter: ");     
        reply = prompt.nextLine();
        replyLength = reply.length();

        answer.shake();
        answer.printAnswer();
        System.out.println();
        askAgain();
    }
    
    //to ask user if they want another go round.
    public static void askAgain()
    {

        Scanner response = new Scanner(System.in);

        System.out.println("Would you Like to ask another question?");
        System.out.print("Type Y for yes or N for no: ");

        String yesOrNo = response.next();
       
        String yes = "Y";
        String no = "N";
        boolean yesAns = yes.equalsIgnoreCase(yesOrNo);
        boolean noAns = no.equalsIgnoreCase(yesOrNo);
       
        if (yesAns)
        {
            runApp();
        }

    }

}
