package javaLogic;

public class GreatestNumberBetweenThreeNumbers {

	public static void main(String[] args) {
	int a=101;int b=30;int c=200;
	if(a>b)
	{
		
		if(a>c)
		{
			System.out.println("a is greater number and value is "+a);
		}
		else
		{
			System.out.println("greater number is c and value is "+c);
		}
		
	}
	else 
	{
		if(b>c)
		{
			System.out.println(" greater number is b nd value is "+b);
		}
		else
		{
			System.out.println("greater number is c and value is "+c);
		}
	}
	}

}
