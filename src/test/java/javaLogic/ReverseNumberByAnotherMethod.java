package javaLogic;

public class ReverseNumberByAnotherMethod {

	public static void main(String[] args) {
		int n = 123;
		String orgNum = Integer.toString(n);// convert number to string
		String rev = "";
		for (int i = orgNum.length() - 1; i >= 0; i--) {
			rev = rev + orgNum.charAt(i);
		}
		int revNum = Integer.parseInt(rev);// convert string to Integer
		System.out.println(revNum);
	}

}
