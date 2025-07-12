package programs;

public class LinearSearchInArray {
	static int search(int a[], int x)
    {
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }
	public static void main(String[] args) {
		int a[] = { 3, 4, 1, 7, 5 };
        int n = a.length;
        
        int x = 7;

        int index = search(a, x);
        
      	if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at index: " + index);
		
	}

}
