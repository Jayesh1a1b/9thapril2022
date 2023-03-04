package javaLogic;

import java.util.Scanner;

public class PrintNaturalNumber {

	public static void main(String[] args) {
		//Natural number starts from 1 to----
 Scanner sc = new Scanner(System.in);
 System.out.println(" Please enter any number ");
 int num = sc.nextInt();
 for(int i=1;i<=num;i++)
 {
	 System.out.println(i);
 }
 
	}

}
