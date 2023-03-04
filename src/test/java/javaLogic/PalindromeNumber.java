package javaLogic;

public class PalindromeNumber {

	public static void main(String[] args) {
	//121
		int n=121;
		int rev = 0;
		int orgNum=n;
		while(n!=0)
		{
		
			rev=rev*10+n%10;
			n=n/10;
		}
     System.out.println(rev);
     if(orgNum==rev)
     {
    	 System.out.println("Number is palindrome number");
     }
     else
     {
    	 System.out.println("Number is not palindrome number");
     }
	}

}
