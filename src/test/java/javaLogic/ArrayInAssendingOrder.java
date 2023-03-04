package javaLogic;

import java.util.Arrays;

public class ArrayInAssendingOrder {

	public static void main(String[] args) {
		int a[]= {16,14,13,36,35};
		Arrays.sort(a);//sorting array in assending order
		System.out.println(Arrays.toString(a));
		System.out.println(" 3rd lowest element is "+a[2]);

	}

}
