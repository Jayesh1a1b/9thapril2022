package javaLogic;

public class MinValueWithinLoop {

	public static void main(String[] args) {
		int a[] = { 18, 15, 34, 32, 12 };
		int min = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < min) {
				min = a[i];
				System.out.println(min);// print all min value from given index=>15,12
			}
		}
		System.out.println(min);// print single min value from the loop=>12
	}

}
