package programs;

public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		 // number N for which we have to print the multiplication table.
        int N = 12;
        for (int i = 1; i <= 12; i++) 
        {
            System.out.println(i + " * " + N + " = "+ N * i);
        }
    }

}


