//alan kelsey
//alankelsey@u.boisestate.edu
//will load one year of monthly precipitation data from a file. The class will 
//store this information in an array and provide several methods to analyze the
// data.
//

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class RainFall
{
    //instance variables
    private String fileName;
    private final int lines = 12;
    private double[] fromFileArray = new double[lines];
    private double totalRainFall;

    //reads from file and creats an array.
    public void readFromFile(String fileNameString) throws IOException
    {

        File fileToRead = new File(fileNameString);
        Scanner fromFile = new Scanner(fileToRead);

        for (int i = 0; i < lines; i++)
        {
            fromFileArray[i] = fromFile.nextDouble();
            
            System.out.print(i + 1 + " ");
            System.out.println( fromFileArray[i]);
        }

    }

    //returns annual rain fall
    public double getTotal()
    {
        double totalSum = 0.0;
        
        for (int i = 0; i < lines; i++)
        {
            totalSum = fromFileArray[i] + totalSum;
        }
        
        totalRainFall = totalSum;        

        return totalRainFall;
    }

    //returns monthly rain fall
    public double getAverage()
    {
        double totalAvg;

        totalAvg = totalRainFall / lines;

        return totalAvg;
    }

    //returns max rain fall i any month
    public double getMax()
    {
        double max = fromFileArray[0];

        for (int i = 0; i < lines; i++)
        {
            if (fromFileArray[i] > max)
                {
                    max = fromFileArray[i];
                }
        }
        return max;
    }

    //returns month number of max rain fall
    public int getMaxMonth()
    {
        int indexOfLargestMonth = 11;
        
        for (int index = 0 ; index < indexOfLargestMonth; index++)
        {
            if (fromFileArray[index] > fromFileArray[indexOfLargestMonth])
            indexOfLargestMonth = index + 1;
        }
        return indexOfLargestMonth;
    }

    //returns minimum rainfall in any month
    public double getMin()
    {
        double min = 1.02;
        
        for (int i = 0; i < lines; i++)
        {
            if (fromFileArray[i] < min)
                {
                    min = fromFileArray[i];
                }
        }

        return min;
    }

    //returns the month number for min rain fall
    public int getMinMonth()
    {
        int indexOfSmallestMonth = 0;

        for (int index = 1; index < lines; index++)
        {
            if (fromFileArray[index] < fromFileArray[indexOfSmallestMonth])
                indexOfSmallestMonth = index ;
        }

        return indexOfSmallestMonth + 1;
    }

}

