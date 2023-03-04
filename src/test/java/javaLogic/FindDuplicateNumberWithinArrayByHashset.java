package javaLogic;

import java.util.HashSet;

public class FindDuplicateNumberWithinArrayByHashset {

	public static void main(String[] args) {
		int a[]= {19,24,19,25,24,25};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<=a.length-1;i++)
		{
			if(hs.add(a[i])==false)
			{
				System.out.println(a[i]);
			}
		}

	}

}
