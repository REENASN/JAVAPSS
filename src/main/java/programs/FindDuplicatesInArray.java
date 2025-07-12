package programs;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		 int[] arr = {1,3, 4, 2, 5, 6,1,2,};

	        System.out.println("Duplicate elements are:");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = i + 1; j < arr.length; j++)
	            {
	                if (arr[i] == arr[j])
	                {
	                    System.out.println(arr[i]);
	                }
	            }
	        }

	}

}
