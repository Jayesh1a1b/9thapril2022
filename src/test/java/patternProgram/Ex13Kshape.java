package patternProgram;

public class Ex13Kshape {

	public static void main(String[] args) {
		//******
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		//******
		//row->11;column-6;star-6;
		int star=6;
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			//print combine assending and dessending pattern
			if(i<6)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
	}

}
