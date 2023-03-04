package javaLogic;

public class OccuranceOfCharecterInString {

	public static void main(String[] args) {
		String s="my name is jayesh choudhary";
		int orgLength = s.length();
		
		String AfterRemoveCharecterInString = s.replaceAll("a", "");
		int newLength = AfterRemoveCharecterInString.length();
		int occurance = orgLength-newLength;
		System.out.println("Repitive character in string of a is "+occurance);

	}

}
