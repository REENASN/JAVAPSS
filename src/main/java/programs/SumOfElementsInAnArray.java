package programs;

public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		int Array[] = {1,2,3,4,5,10,10},sum=0;
		for(int i=0;i<Array.length;i++)
		{
			sum=sum+Array[i];
		}
		System.out.print("The Sum of Numbers in array is: " + sum );

	}

}
