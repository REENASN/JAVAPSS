package practising;

public class AmstrongOrNot {

	public static void main(String[] args) {
		int number=153,remainder,result=0,original_No;
		original_No=number;
		while(number>0)
		{
			remainder=number%10;
			result+=(remainder*remainder*remainder);
			number=number/10;
		}
		if(result==original_No)
		{
			System.out.println("Amstrong number");
			
			
		}
		else
			System.out.println("Not amstrong");
	}

}
