package newPractise;

public class LargestInAnArry {

	public static void main(String[] args) {
		int arr[]= {1,23,76,12,254,789,0};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
				if(arr[i]>max)
					max=arr[i];
		}
		System.out.println(max);
	}

}
