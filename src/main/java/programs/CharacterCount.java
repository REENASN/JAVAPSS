package programs;

public class CharacterCount {

	public static void main(String[] args) {
		    String str = "This is a sample string";
	        int count = 0;
	        System.out.println("Original string: " + str);
	        System.out.println("Total character including space:"+str.length());

	        // Iterate through each character of the string
	        for (int i = 0; i < str.length(); i++) 
	        {
	            // Check if the current character is not a space
	            if (str.charAt(i) != ' ') 
	            {
	                count++; // Increment the count if it's not a space
	            }
	        }

	        
	        System.out.println("Total characters (excluding spaces): " + count);

	}
}
