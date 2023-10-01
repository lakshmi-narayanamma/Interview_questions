package interview;

public class FibonacciSeries {
	public static void main(String[] args) {
		int numTerms = 10;
		printFibonacciSeries(numTerms);
		
	}
	private static void printFibonacciSeries(int numTerms)
	{
		int first = 0; int second = 1;
		System.out.println("Fibonacci Series: "+first +", "+second);
		for(int i =0;i<numTerms;i++)
		{
			int next = first+second;
			System.out.print("  "+ next);
			first = second;
			second = next;
		}
	}

}
