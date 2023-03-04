package javaLogic;

public class ReverseNumber {

	public static void main(String[] args) {
		// number=1234;rev=4321;
		int n=123;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
System.out.println(rev);
	}

}
