package practising;

public class LargestInAnArray {

	static int largest()
	{
		int arr[]= {21,45,35,85,100,784};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		return max;
	}
	public static void main(String[] args) {

		System.out.println("Largest element in the array:: "+largest());

	}

}
