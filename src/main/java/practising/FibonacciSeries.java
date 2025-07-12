package practising;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count=10;
		int n1=0,n2=1,n3;
		if(count>=1)
			System.out.print(n1+" ");
		if(count>=2)
			System.out.print(n2+" ");
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
