package javaLogic;

public class PrimeNumber {

	public static void main(String[] args) {
		// a Number which is divisible by own and 1 is called prime number
		int num=11;
		int count = 0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			count++;
			break;
			}
			
		}
		if(count==1)
		{
			System.out.println("number is not prime number");
		}
		else
		{
			System.out.println(" number is  prime number");
		}

	}

}
