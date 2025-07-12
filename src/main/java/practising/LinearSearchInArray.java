package practising;

public class LinearSearchInArray {
	static int search(int a[],int N,int x)
	{
		for(int i=0;i<N;i++)
		{
			if(a[i]==x)
				return i;	
		}
		return(-1);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int N=a.length;
		int x=5;
		int index=search(a,N,x);
		if(index==-1)
		{
			System.out.println("Number Not found in the array");	
		}
		else
			System.out.println("Number found at index "+index);

	}

}
