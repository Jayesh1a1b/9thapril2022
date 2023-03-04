package javaLogic;

public class FindAllSmallestNumberInArrayCompareToIndexBasis {

	public static void main(String[] args) {
		int [] a= {10,30,12,10,35,03};
		int min=a[1];
		for(int i=0;i<=a.length-1;i++)
		{
			
				if(min>a[i])
				{
					System.out.println(a[i]);
				}
			
		}
	}

}
