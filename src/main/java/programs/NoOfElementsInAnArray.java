package programs;

public class NoOfElementsInAnArray {

	public static void main(String[] args)
	{
		int Array[] = {1,2,3,4,5,10,15,20,25,30};
		int ArraySize = Array.length;
		System.out.println("This array size is: " + ArraySize );
		
		int count=0;
		for(int i=0;i<ArraySize;i++)
		{	count=count+1;}
		System.out.println("This array size is: " +count);

	}

}
