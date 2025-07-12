package newPractise;

public class AmstrongOrNot {

	public static void main(String[] args) {
		// committed and push to Git
		int N=371,result=0,rem;
		int number=N;
		while(N>0)
		{
			rem=N%10;
			result+=(rem*rem*rem);
			N=N/10;
			
		}
		System.out.println(result);
		if(result==number)
			System.out.println("Amstrong");
		else
			System.out.println("Not amstrong");
	}

}
