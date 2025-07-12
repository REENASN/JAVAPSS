package newPractise;

public class CapitalizeFirstLetter {

	static String capitalString(String str)
	{
		 
		if(str==null || str.isEmpty())
		{
			return str;
		}
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	public static void main(String[] args) {

		String str="hello welcome";
		String capitalizedString=capitalString(str);
		System.out.println(capitalizedString);

	}

}
