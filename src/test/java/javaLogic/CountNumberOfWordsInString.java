package javaLogic;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		String s="my name is mahesh";
		String[] str = s.split(" ");
		int noOfWords = str.length;
		System.out.println(noOfWords);

	}

}
