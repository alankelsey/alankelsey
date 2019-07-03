//Alan Kelsey
//alankelsey@u.boisestate.edu
//

import java.util.Random;

public class CountCoinFlips
{

    public static void main(String[] args)
    {
        
//        System.out.println("    Start...");
//        System.out.println();
        Coin newFlip = new Coin(2012, .5);

        //Begin if
        int tossCount = 1;
        int numberOfTries = 10;
        int numberOfFlips = 0;
        int headsCount = 0;
        int tailsCount = 0;
        
        

        while ((tossCount) <= (numberOfTries))
        {

            newFlip.toss();

            if (newFlip.isHeads())
            {
                //----- used for visually feedback 
                //System.out.print(tossCount + " ");
                //System.out.println(" Heads");
                headsCount++;
            }
            else
            {
               //----- used for visually feedback 
               // System.out.print(tossCount + " ");
               // System.out.println("  Tails");
                tailsCount++;
            }

            
            
            tossCount++;
            numberOfFlips++;
           
        }
//        System.out.println(newFlip.isHeads());
            System.out.println();
//            System.out.println("    <-- End  -->  ");
            System.out.println("Number of heads up: " + headsCount );
            System.out.println("Number of tails up: " + tailsCount );
            int total = headsCount + tailsCount;
//            System.out.println("total " + total);
            double percent = (headsCount / (double)total) * 100;
            System.out.printf("Percentage of Heads up: %.1f ", percent);
            //System.out.println( (headsCount) / (percent) );
            System.out.println("\n");


    }

}
