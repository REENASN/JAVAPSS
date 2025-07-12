package practising;

public class CapitalizeFirstLetter 
{
	

	    public static String capitalizeFirstLetter(String str) 
	    {
	        if (str == null || str.isEmpty()) 
	        {
	            return str; // Return as is for null or empty strings
	        }
	        return str.substring(0, 1).toUpperCase()+ str.substring(1);
	    }

	    public static void main(String[] args) 
	    {
	        String originalString = "hello world";
	        String capitalizedString = capitalizeFirstLetter(originalString);
	        System.out.println(capitalizedString); // Output: Hello world

	        String emptyString = "";
	        String capitalizedEmpty = capitalizeFirstLetter(emptyString);
	        System.out.println("Empty string: '" + capitalizedEmpty + "'"); // Output: Empty string: ''

	        String nullString = null;
	        String capitalizedNull = capitalizeFirstLetter(nullString);
	        System.out.println("Null string: " + capitalizedNull); // Output: Null string: null
	    }
}


