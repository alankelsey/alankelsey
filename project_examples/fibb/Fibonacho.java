// alan kelsey

public class Fibonacho
{
	public static void main(String[] args)
	{
		int firstTerm = 1;
		int secondTerm = 2;
		int fibTerm = 3;
		int sum = 0;
		for (int i = 0; i < fibTerm; i++)
			{
			if ((fibTerm % 2 == 0) && (fibTerm <= 4000000))
                                {
                                sum = sum + fibTerm;
				System.out.println(i + " " + sum);
                                }
                        else if (fibTerm < 0 )
                                {
				System.out.print("ERROR ");
				System.out.print("Step " + i );
				System.out.print(" First " + firstTerm);
				System.out.print(" Second " + secondTerm);
				System.out.print(" fib " + fibTerm);
				i = 5000000;
                                }
			fibTerm = firstTerm + secondTerm;

			firstTerm = secondTerm;
			secondTerm = fibTerm;	
			}
			System.out.println(sum);
			
	}
}
