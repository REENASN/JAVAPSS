package programs;

public class VowelOrNot {

	public static void main(String[] args) {
		//method-1-using switch casse
		char alphabet='u';
		switch(alphabet) 
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println(alphabet+" is a vowel");
			    	break;
		default:System.out.println(alphabet+" is not a vowel");
		}
		//method-2-using if else
		
		char ch='a';
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else
			System.out.println(ch+" is a consonant");
		
		//Method-3-using indexof() method
		char ch1 = 'c';
        
        // Make the list of vowels
        String str = "aeiouAEIOU";
        
        // str is a list of vowels
        if(str.indexOf(ch1) == -1) {
            System.out.print(ch1+" is a consonant");
        }else {
            System.out.print(ch1+" is a vowel");
        }
	}

}
