package javaLogic;

public class GivenInputAndOutPutAndWriteLogic {

	public static void main(String[] args) {
		int n=1010101011;
		//String a = String.valueOf(n);//convert integer to string
		String a = Integer.toString(n);
		String output1="";
		String output0="";
		String output="";
		for(int i=0;i<=a.length()-1;i++)
		{
			char c = a.charAt(i);
			if(c=='1')
			{
				output1=output1+1;
			}
			else
			{
				output0=output0+0;
			}
			output=output1+output0;
			
		}
		System.out.println(output);
	}

}
