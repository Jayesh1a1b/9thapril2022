package javaLogic;

public class ArmstringNumber {

	public static void main(String[] args) {
		// 153->1^3+5^3+3^3=153
		int n=153;
		int arm=0;int rem;
		int orgNum=n;
		//for(int i=1;i<=n;i++)
		while(n!=0)
		{
			rem=n%10;
			arm=arm+rem*rem*rem;
			n=n/10;
		}
			System.out.println(arm);
			if(orgNum==arm)
			{
				System.out.println("armstrong number");
			}
			else
			{
				System.out.println("not armstrong number");
			}
		

	}

}
