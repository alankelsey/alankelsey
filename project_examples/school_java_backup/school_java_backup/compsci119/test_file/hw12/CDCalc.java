//Alan Kelsey
//alankesey@u.boisestate.edu
//

import java.util.Scanner;

public class CDCalc
{

      public static int numOfYearsVested;
      public static double amountOfMoneyVested;
      public static double interestRate = 0;
      public static Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println();
	System.out.println(" <--- CD CALC ---> \n ");
	setAmount();
	setTerm();
	System.out.println();
	setInterest(numOfYearsVested);
	setTotal();
	System.out.println();
     
    }

        //Calculates number of amount of money earned
        //loops through and prints the value
        public static void setTotal()
	{
            int setYear = 1;
            double value = (amountOfMoneyVested);
	    double newValue;
	    double rate = interestRate;
            double totalAmount;

	    while (setYear <= numOfYearsVested)
            {
               
  
	        value = (value + value * (rate / 100.00)) ;
                
	        System.out.printf("value after year %d: ", setYear);
            	System.out.printf("$%.2f", value);
            	System.out.println();
            	
//		value = (value + value * (rate / 100.00));
            	setYear++;
            }            
        }
    
    
    public static void setTerm()
    {
//        Scanner input = new Scanner(System.in);
        System.out.print("Term: ");
        numOfYearsVested = input.nextInt();
    }

    //Sets the amount to invest
    public static void setAmount()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Investing: ");
        amountOfMoneyVested = input.nextDouble();
        System.out.println();

    }

    //sets the interest rate depending on term
    public static void setInterest(int year)
    {
            //Select which interest rate to apply
       // int year = numOfYearsVested;
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
            System.out.print("incorrect number of years 1-5 ");
    }
}
     


