
package javaLogic;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayInDessndingOrder {

	public static void main(String[] args) {
		Integer a[]= {10,34,23,34,65,23};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		System.out.println(" Largest element in array is "+a[0]);

	}

}
