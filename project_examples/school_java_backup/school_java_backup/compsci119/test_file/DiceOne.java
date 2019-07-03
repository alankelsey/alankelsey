//Alan Kelsey
//alankelsey@u.boisestate.edu

import java.util.Random;
public class DiceOne
{
    public static void main(String[] args) 
    {
        String starshow = anamation();
        System.out.println(starshow);
    }

    public static String anamation()
    {
        String action1 = ("[_]");
        String action2 = ("[-]");
        System.out.println(action1);

        try
        {
            Thread.sleep(500);
        } 
        catch(InterruptedException e)
        {
        } 

            System.out.println(action2);


       try
       {
            Thread.sleep(500);
       }
       catch(InterruptedException e)
       {       
       }
            System.out.println(action1);

       try
       {
            Thread.sleep(500);
       }
       catch(InterruptedException e)
       {
       }

            System.out.println(action2);
    }    

}   

