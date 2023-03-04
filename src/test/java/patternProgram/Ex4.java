package patternProgram;

public class Ex4 {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		//star->5;row->5;column->5
		int star=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			star--;
		}

	}

}
