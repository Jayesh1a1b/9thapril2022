package javaLogic;
import java.util.Scanner;
public class SearchingElementIndexWithyinArray {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70,80,90,100};
	 Scanner sc =new Scanner(System.in);
	 System.out.println(" please enter any number for searching in the arrray ");
 int num=sc.nextInt();
 for(int i=0;i<=a.length-1;i++)
 {
	 if(num==a[i])
	 {
		 System.out.println("given number "+num+" is available at the index "+i+" of the array ");
	 }
 }



	}

}
