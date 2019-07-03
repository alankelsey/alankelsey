//Alan Kelsey
//alankelsey@u.boisestate.edu
//
//Demonstates that the EightBall.num2answer class works correctly

import java.util.Scanner;

public class EightBallTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        EightBall test = new EightBall();
   
        System.out.println("Testing all 20 EightBall answers...\n");
         
        for (int testNum = 1; testNum <= 20; testNum++)
        {    
            System.out.println(testNum + " " + test.num2answer(testNum));
        }
        
        System.out.println(" \nTesting twice for invalid index...\n");

        System.out.println(test.num2answer(0));
        System.out.println(test.num2answer(30));

        System.out.println(" \nEightBallTest Complete");
    }
}
