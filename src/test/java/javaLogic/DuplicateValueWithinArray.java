package javaLogic;

public class DuplicateValueWithinArray {

	public static void main(String[] args) {
		int a[]= {18,36,18,10,25,10,25};
	int dup = 0 ;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					dup=a[i];
					//System.out.println(dup);
				}
		
			}
			
		}
		System.out.println(dup);
	}

}
