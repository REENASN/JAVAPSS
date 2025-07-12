package programs;

public class LargestInAnArray {
	// Java Program to find the largest element in  array using iterative approach

	    // Method to find maximum in arr[] 
	
	    static int largest() 
	    {   
	    	
	    	int arr[] = {20, 10, 20, 4, 100}; 
	        // Initialize maximum element 
	        int max = arr[0]; 
	        
	      	// Traversing and comparing max element
	        for (int i = 0; i < arr.length; i++)
	        
	         // If current element is greater than max
	            if (arr[i] > max) 
	            
	                // Then update max element
	                max = arr[i]; 
	        
	        return max; 
	    } 
	    
	    public static void main(String[] args) 
	    {    
	      
	        System.out.println("Largest element in the Array:: "+largest()); 
	    } 	
}
