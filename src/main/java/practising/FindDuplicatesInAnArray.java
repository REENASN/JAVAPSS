package practising;

public class FindDuplicatesInAnArray {

	public static void main(String[] args) {
		int a[]= {1,3,2,3,4,5,6,7,4};
		System.out.println("Duplicate Elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}	
			}
		}

	}

}
