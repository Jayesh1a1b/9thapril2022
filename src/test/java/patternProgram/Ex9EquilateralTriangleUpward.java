package patternProgram;

public class Ex9EquilateralTriangleUpward {

	public static void main(String[] args) {
		//   *
		//  ***
		// *****
		//*******

		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)//for row
		{
			for(int j=1;j<=space;j++)//for space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)//for column
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
			
		}

	}

}
