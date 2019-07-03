//Find the sum of all the multiples of 3 or 5 below 1000.

public class NaturalNum
{
	public static void main(String[] args)
	{
		int end = 1000;
		int sum= 0;
		
		for (int i = 1; i < end; i++)
			{
				if ((i % 3 == 0) && (i % 5 == 0))
					{
				//	System.out.println("Multiple " + i);
					sum = sum + i;
					//System.out.println("sum " + sum);
					}
				else if ((i % 3 == 0))
					{
				//	System.out.println("Multiple " + i);
					sum = sum + i;
					//System.out.println("sum " + sum);
					}
				else if ((i % 5 == 0))
                                        {
                                       // System.out.println("multiple " + i);
                                        sum = sum + i;
                                        //System.out.println("sum " + sum);
                                        }
			}	
			System.out.println("sum " + sum);
	}
}
