package javaLogic;

public class DigitCountByanotherMethod {

	public static void main(String[] args) {
		int n=12345;
		//Approach 1
		/*String str = Integer.toString(n);//convert integer to String
		int digit = str.length();
		System.out.println(digit);*/
		
       // Approach2 
		int count = 0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
