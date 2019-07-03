//Alan Kelsey
//alankelsey@u.boisestate.edu


import java.util.Scanner;

public class Recipe
{
    public static void main(String[] args)
    {
        
        //Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Collect amount of dishwashing liquid
        System.out.print("How  many cups of dishwashing liquid (in decimal" 
            + "format): ");
        double  amountUserHas = keyboard.nextDouble();
        System.out.println();
        
        //Calculate amount of water and sugar needed
        double amountOfWater = 4 * amountUserHas;
        double amountOfSugar = 4 * amountUserHas;
       
        //Print amount needed results
        System.out.printf("%f cups of dishwashing liquid \n",amountUserHas);
        System.out.printf("%f cups of water\n",amountOfWater);
        System.out.printf("%f teaspoons of sugar\n",amountOfSugar);
        System.out.println();

    }//End main


}//End Recipe
