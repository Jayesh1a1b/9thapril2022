package patternProgram;

public class Ex6 {

	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//*****
//space=4;star=1;row--=5;column=5
		
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++)//for row
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
			space--;
			star++;
			
		}
	
	}

}
