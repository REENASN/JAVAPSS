package practising;

public class PallindromeOrNot {

	public static void main(String[] args) {
		int num=13321,rev=0,rem;
		int originalnum=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(originalnum==rev)
			System.out.println("Pallindrome");
		else
			System.out.println("not pallindrome");
	}

}
