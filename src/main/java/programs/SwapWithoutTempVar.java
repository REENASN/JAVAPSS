package programs;

public class SwapWithoutTempVar {

	public static void main(String[] args) {
		int a=10,b=147,x;
		System.out.println("Before swapping a is:"+a);
		System.out.println("Before swapping b is:"+b);
		x=a*b;
		a=x/a;
		b=x/b;
				
		System.out.println("after swapping a is:"+a);
		System.out.println("after swapping b is:"+b);

	}

}
