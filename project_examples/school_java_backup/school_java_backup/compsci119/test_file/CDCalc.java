//Alan Kelsey
//alankesey@u.boisestate.edu
//

import java.util.Scanner;

public class CDCalc
{

//    int numOfYearsVested;
//    double amountOfMoneyVested;
//   double interestRate = 0;
//    int setYear = 1;
//    double totalAmount = 1.0;

    public static void main(String[] args)
    {

        int numOfYearsVested;
        double amountOfMoneyVested;
        double interestRate = 0;
        int setYear = 1;
        double totalAmount;
    
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Investing: ");
        amountOfMoneyVested = input.nextDouble();
        System.out.println();

        System.out.print("Term: ");
        numOfYearsVested = input.nextInt();
        System.out.println();
    

        //Select which interest rate to apply
        int year = numOfYearsVested;
        if ((year) == (1))
            interestRate = .30;
        else if ((year) == (2))
            interestRate = .45;
        else if ((year) == (3))
            interestRate = .95;
        else if ((year) == (4))
            interestRate = 1.50;
        else if ((year) == (5))
            interestRate = 1.80;
        else
            System.out.print("incorrect intrestRate");

        //System.out.println(numOfYearsVested + "test");
        
        //System.out.println(amountOfMoneyVested);
        //System.out.println(interestRate);
           
        //loops through years and prints results    
        double value = amountOfMoneyVested;

        while (setYear <= numOfYearsVested)
        {
        //    double value = amountOfMoneyVested;
            double rate = interestRate;
            double totalInterest = (value + value * (rate / 100.00)) ;
            totalAmount = amountOfMoneyVested + value;

            System.out.printf("value after year %d: ", setYear);
            System.out.printf("$%.2f", totalAmount);
            System.out.println();
            
            setYear++;
            //value = totalAmount - amountOfMoneyVested;

        }

    }
}
     


