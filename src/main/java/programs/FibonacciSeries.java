package programs;

public class FibonacciSeries 
{
	
	static void Fibonacci(int N)
    {
        int n1 = 0, n2 = 1;

        for (int i = 1; i <= N; i++)
        {
            System.out.print(n1 + " ");

            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
	
	public static void main(String args[])
		    {
		        int N =10;

		        // Function Call
		        Fibonacci(N);
		    }
		    

}
