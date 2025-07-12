package practising;

public class Charactercount {

	public static void main(String[] args) {
		String str="Automation & Manual";
		
		int count=0;
		System.out.println("length is::"+str.length());
		
		for(int i=0;i<str.length();i++)
		{
			count+=1;
		}
		System.out.println("No of Characters in string including space is:"+count);
		
		//without space
		int count1=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			   count1+=1;
		}
		System.out.println("No of Characters in string is:"+count1);
				
	}

}
