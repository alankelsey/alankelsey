//Alan Kelsey
//alankelsey@u.boisestate.edu
//

import java.util.random;

public class Coin
{
    int mintYear;
    int centsValue;
    boolean sideUp;
    String sideResult;
//    boolean heads = true;
//    boolean tails = false;
    
    public void Coin(int m_year, int m_cents)
    {
        mintYear = m_year;
        centsValue = m_cents;   
    }
    
    public void toss()
    {
        Random newRoll = new Random();
        flipValue = newRoll.nextBoolean();
        sideUp = flipValue;
    }
    
    public String print()
    {
        System.out.println("Year: " + mintYear);
        System.out.println("Value: " + sideResult + " cents");
        System.out.println(sideUp + " is facing up"); 

    }
    
    public String getSidesUp()
    {
       
        if (sideUp) == (true)
        {
            return "Heads";
        }
        else
            return "Tails";

    }
    
    public boolean isHeads()
    {
        if (sideUp
        return true;
    }

    public int getYear()
    {
        return mintYear; 
    }

    public int getValue()
    {
        return centsValue;
    }
    
}
