package javaLogic;

public class FindAllMaxValueInArrayOnTheBasisOfIndex {

	public static void main(String[] args) {
		int a[]= {12,10,28,26,26};
		int max=a[1];//compare max value in array on index basis (user given index value compare to other value and show max value within that array)
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				System.out.println(a[i]);//within loop printing then all value print 
			}
			
		}
		
	}

}
