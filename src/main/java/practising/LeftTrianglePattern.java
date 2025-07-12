package practising;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		
		int row,column,NumberOfRows=6;
		for(row=0;row<NumberOfRows;row++)
		{
			for(column=2*(NumberOfRows-row);column>2;column--)
			{
				System.out.print(" ");
			}
			
			for(column=0;column<=row;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}

}
