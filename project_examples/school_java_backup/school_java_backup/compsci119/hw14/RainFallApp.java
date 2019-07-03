// Application that calculates annual rainfall statistics
// // by Michael Stuart <michaelstuart@boisestate.edu>
//


import java.io.IOException;

public class RainFallApp
{
    public static void main(String[] args) throws IOException
    {
        RainFall rain = new RainFall();
        rain.readFromFile("rain.txt");
    
        System.out.println("---------- RAINFALL REPORT ----------");
        System.out.println();
    
        System.out.printf("  Total: %.2f\n", rain.getTotal());
        System.out.printf("Average: %.2f\n", rain.getAverage());
    
        String maxMonth = toMonthName( rain.getMaxMonth() );
        System.out.printf("Maximum: %.2f (in %s)\n", rain.getMax(), maxMonth);

        String minMonth = toMonthName( rain.getMinMonth() );    
        System.out.printf("Minimum: %.2f (in %s)\n", rain.getMin(), minMonth);
    
    }

    /**
    * Returns the month name (as a String) corresponding to the provided
    * month number. Assumes that January is month "1" and December is "12".
    */
    public static String toMonthName(int monthNumber)
    {
        final String[] months = {"",
                                 "January", "February", "March",
                                 "April",   "May",      "June",
                                 "July",    "August",   "September",
                                 "October", "November", "December" };
                             
        return months[monthNumber];        
    }

}
