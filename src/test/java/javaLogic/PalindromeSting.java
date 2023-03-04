package javaLogic;

public class PalindromeSting {

	public static void main(String[] args) {
		// mom 
		String s="mom";
		String rev="";
		String org=s;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
     System.out.println(rev);
     if(org.equals(rev))
     {
    	 System.out.println("string is palindrome string");
     }
     else
     {
    	 System.out.println("not palindrome string");
     }
	}

}
