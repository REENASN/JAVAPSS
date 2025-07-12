package newPractise;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count=10;
		int n1=0,n2=1,n3;
		for(int i=1;i<=count;i++)
		{
			System.out.print(" "+n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
