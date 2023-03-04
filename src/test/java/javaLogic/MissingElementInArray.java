package javaLogic;

public class MissingElementInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
		//sum without miss
		int sumwithoutmiss=0;
		for(int i=1;i<=6;i++)
		{
			sumwithoutmiss=sumwithoutmiss+i;
			
		}
		System.out.println(sumwithoutmiss);
		//sum with miss
		int sumwithmiss=0;
		for(int a1:a)
		{
			sumwithmiss=sumwithmiss+a1;
		}
		System.out.println(sumwithmiss);
		System.out.println(" missing element in array is "+(sumwithoutmiss-sumwithmiss));

	}

}
