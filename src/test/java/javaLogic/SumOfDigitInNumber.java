package javaLogic;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		int n=12345;
		int sumOfDigit=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			sumOfDigit=sumOfDigit+rem;
			n=n/10;
		}
		System.out.println(sumOfDigit);

	}

}
