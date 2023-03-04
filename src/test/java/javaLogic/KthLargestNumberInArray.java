package javaLogic;

public class KthLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {10,26,243,3,24,34,33};
	int k=3;int i;
		for( i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			if( i==k-1)
			{
				System.out.println(k+" largest element in decrement order "+a[i]);
			}
		}
		
		

	}

}
