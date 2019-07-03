//this is to test csv reading in java

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReaderTest
{
	public static void main (String[] args) throws IOException
	{
		File csv = new File("test.csv");
		Scanner readCsv = new Scanner(csv);
		double[] csvData = new double[5];

		for (int i = 0; i < 5; i++)
		{
			double amount = readCsv.nextDouble();
			csvData[i] = amount;
			System.out.println("amount " + amount + " count " + i);
		}
		
	}
}
