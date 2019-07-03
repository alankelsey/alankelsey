//Alan Kelsey
//alankelsey@u.boisestate.edu
//

import java.util.Random;

public class Coin
{
    int mintYear;
    double centsValue;
    boolean sideUp;
    String sideResult;
//    boolean heads = true;
//    boolean tails = false;
    
    // Constructor Method, sets class variables
    public Coin(int m_year, double  m_cents)
    {
        mintYear = m_year;
        centsValue = m_cents;   
    }
    
    // toss will flip the coin by calling a rondom boolean
    public void toss()
    {
        Random newRoll = new Random();
       
       sideUp = newRoll.nextBoolean();
        
    }
    
    public void print()
    {
        System.out.println("Year: " + mintYear);
        System.out.println("Value: " + centsValue + " cents");
        if (sideUp)
            System.out.println("Heads is facing up"); 
        else
            System.out.println("Tails is facing up");
    }
    
    public String getSideUp()
    {
        String answer;
        
        if (sideUp)
        {
          return ("Heads");
        }
        else
        {
            return ("Tails");
        }
    }
    
    public boolean isHeads()
    {
        if (sideUp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getYear()
    {
        return mintYear; 
    }

    public double getValue()
    {
        return centsValue;
    }
    

}
