package newPractise;

public class CharacterCount {

	public static void main(String[] args) {
		String str="Hello world now";
		int count=0;
		System.out.println("with space::"+str.length());
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			count++;	
		}
System.out.println("count without space::"+count);
	}

}
