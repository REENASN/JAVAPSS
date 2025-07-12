package practising;

public class ReverseAString {

	public static void main(String[] args) {
		/*String str="Hello world";
		String reversedstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversedstr=reversedstr+str.charAt(i);
		}
		System.out.println("Reversed String is::"+reversedstr);
		*/
		
		String str="Hello world";
		String reversedStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversedStr=reversedStr+str.charAt(i);
			
		}
		System.out.println("Revered String::  "+reversedStr);
	}

}
