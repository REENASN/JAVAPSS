package programs;

public class SwapTwoVariablesUsingTemp {

	public static void main(String[] args) {
		int a=20,b=147,temp;
		System.out.println("Before swapping a is:"+a);
		System.out.println("Before swapping b is:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("afeter swapping a is:"+a);
		System.out.println("afeter swapping b is:"+b);
		
	}

}
