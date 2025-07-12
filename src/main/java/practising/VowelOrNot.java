package practising;

public class VowelOrNot {

	public static void main(String[] args) {
		char ch='a';
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");

		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println("vowel");
				 break;
		default: System.out.println("consonant");
		}
	}

}
