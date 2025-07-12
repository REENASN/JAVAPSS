package programs;

public class NoOfOccurenceOfSpecificCharacter {

	public static int countOccurrences(String text, char targetChar) {
        int count = 0; // Initialize a counter for occurrences
        for (int i = 0; i < text.length(); i++) { // Iterate through each character in the string
            if (text.charAt(i) == targetChar) { // Check if the current character matches the target
                count++; // Increment the counter if a match is found
            }
        }
        return count; // Return the total count of occurrences
    }

   public static void main(String[] args) {
        String myString = "programming";
        char charToFind = 'g';
        int occurrences = countOccurrences(myString, charToFind);
        System.out.println("The character '" + charToFind + "' appears " + occurrences + " times in \"" + myString + "\".");
    }

}
