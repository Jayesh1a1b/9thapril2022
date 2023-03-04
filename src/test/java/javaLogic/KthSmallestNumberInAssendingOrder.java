package javaLogic;

public class KthSmallestNumberInAssendingOrder {

	public static void main(String[] args) {
		int a[]= {26,34,2,45,49,65};
		int k=3;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+" largest number in assending order is "+a[i]);
			}
		}

	}

}
