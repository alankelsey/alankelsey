//Alan Kelsey
//alankelsey@u.boisestate.edu
//

public class CoinFlipper
{
    public static void main(String[] args)
    {
        Coin firstCoin = new Coin(1997, .25);
        //newYear.coin(1997, 25);
        firstCoin.toss();
        firstCoin.print();
        

        System.out.println();
        Coin secondCoin = new Coin(2005, .05);
        secondCoin.toss();
        int year = secondCoin.getYear();
        double value = secondCoin.getValue();
        String sideUp = secondCoin.getSideUp();
        
         
        System.out.printf("Year: %d\nValue: %.02f cents" +
        "\n%s is facing up\n", year, value, sideUp);
        
        System.out.println();
        System.out.println("Will I get an A on this? ");
        System.out.println();

        secondCoin.toss();
        if (secondCoin.isHeads())
            System.out.println("No will fail");
        else
            System.out.println("Yes you will");


    }
}

