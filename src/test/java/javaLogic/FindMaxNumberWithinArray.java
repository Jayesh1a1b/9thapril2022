package javaLogic;

public class FindMaxNumberWithinArray {

	public static void main(String[] args) {
		int []a= {10,25,9,26,34};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				System.out.println(max);//when print within loop then more than given index value print
			}
			
		}
		System.out.println(max);//when single max value required then print after the loop
	}

}
