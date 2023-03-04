package javaLogic;

public class WhiteSpaceInString {

	public static void main(String[] args) {
		String s="My name is jayesh choudhary";
		int count = 0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char Blank = s.charAt(i);
			if(Blank==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
