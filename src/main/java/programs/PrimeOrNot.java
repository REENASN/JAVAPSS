package programs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=num/2;
		int flag=0;
		for(int i=2;i<=n;i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not prime");
		}
	}

}


