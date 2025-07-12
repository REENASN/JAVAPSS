package practising;

public class FactorialOfANumber 
{
	
	static int factorial(int num)
    {
        int result = 1, i;
        for (i = 1; i <= num; i++)
        {
            result=result * i;
        }
        return result;
    }

	public static void main(String[] args) 
	    {
	        int num = 5;
	        System.out.println("Factorial of " + num + " is " + factorial(num));
	                           
	    }

}


