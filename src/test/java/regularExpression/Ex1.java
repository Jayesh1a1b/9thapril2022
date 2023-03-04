package regularExpression;

import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		
		// pattern:.*jayesh.*
		//String:my name is jayesh choudhary;
		
		//type1
		//boolean matchingResult = Pattern.matches(".*jayesh.*","my name is jayesh choudhary ");//matched
		
		//type2
		//boolean matchingResult = Pattern.matches("[Jj]ava","java");//first character pattern matched //true
		//boolean matchingResult = Pattern.matches("[Jj]ava","Java");//true
		//boolean matchingResult = Pattern.matches("[Jj]ava","Java ");//false space in string
		//boolean matchingResult = Pattern.matches("[Jj]ava","kava");//false
		
		//type3
		//boolean matchingResult = Pattern.matches("ye[sp]","yes");//true last character pattern
		//boolean matchingResult = Pattern.matches("ye[sp]","yep");//true
		//boolean matchingResult = Pattern.matches("ye[sp]","pes");//false
		
		//type4
		//boolean matchingResult = Pattern.matches("[skf]it","sit");//true
		//boolean matchingResult = Pattern.matches("[skf]it","kit");//true
		//boolean matchingResult = Pattern.matches("[skf]it","fit");//true
		//boolean matchingResult = Pattern.matches("[skf]it","git");//false
		
		//type5
		//boolean matchingResult = Pattern.matches(".ava","java");//true//here single . so accept single character
		//boolean matchingResult = Pattern.matches(".ava","Java");//true
		//boolean matchingResult = Pattern.matches(".ava","$ava");//true
		//boolean matchingResult = Pattern.matches(".ava","9ava");//true
		//boolean matchingResult = Pattern.matches(".ava","9java");//false because here single(.) in pattern so accept single character
		
		//type6
		//boolean matchingResult = Pattern.matches("[0-9]am","java");//false
		//boolean matchingResult = Pattern.matches("[0-9]am","8am");//true
		//boolean matchingResult = Pattern.matches("[0-9]am","8pm");//false
		//boolean matchingResult = Pattern.matches("[0-9]am","8Pm");//false
		//boolean matchingResult = Pattern.matches("[0-9]am","#am");
		
		//type7
		//boolean matchingResult = Pattern.matches("[a-z]et","zet");//true
		//boolean matchingResult = Pattern.matches("[a-z]et","pet");//true
		//boolean matchingResult = Pattern.matches("[a-z]et","6et");//false
		//boolean matchingResult = Pattern.matches("[a-z]et","Set");//false
		
		//type8
		//boolean matchingResult = Pattern.matches("[A-Z]et","pet");//false
		//boolean matchingResult = Pattern.matches("[A-Z]et","%et");//false
		//boolean matchingResult = Pattern.matches("[A-Z]et","Bet");//true
		
		//type9 (shortcut \\w)
		//boolean matchingResult = Pattern.matches("[A-Za-z0-9]et","pet");//true
		//boolean matchingResult = Pattern.matches("[A-Za-z0-9]et","Jet");//true
		//boolean matchingResult = Pattern.matches("[A-Za-z0-9]et","&et");//false
		//boolean matchingResult = Pattern.matches("[A-Za-z0-9]et","0et");//true
		//boolean matchingResult = Pattern.matches("[\\w]et","set");//true
		//boolean matchingResult = Pattern.matches("[\\w]et","$et");//false
		//boolean matchingResult = Pattern.matches("[\\w]et","Ret");//true
		
		
		//type10 shortcut \\D means [^0-9]
		//boolean matchingResult = Pattern.matches("[^0-9]et","Jet");//true//here ^ means not and it is known as cap
		//boolean matchingResult = Pattern.matches("[^0-9]et","5et");//false
		//boolean matchingResult = Pattern.matches("[\\D]et","Aet");//true
		//boolean matchingResult = Pattern.matches("\\Det","&et");//true
		
		//type11
		//boolean matchingResult = Pattern.matches("[^a-z]et","Jet");//true capital J
		//boolean matchingResult = Pattern.matches("[^a-z]et","6et");//true
		//boolean matchingResult = Pattern.matches("[^a-z]et","ret");//false
		
		//type12
		//boolean matchingResult = Pattern.matches("[^A-Z]et","Jet");//false because J
		//boolean matchingResult = Pattern.matches("[^A-Z]et","cet");//true
		
		//type13
		//boolean matchingResult = Pattern.matches("[^A-Za-z0-9]et","Jet");//false
		//boolean matchingResult = Pattern.matches("[^A-Za-z0-9]et","8et");//false
		//boolean matchingResult = Pattern.matches("[^A-Za-z0-9]et","&et");//true
		
		//type14
		//boolean matchingResult = Pattern.matches("s[a-z]t","Jet");//false
		//boolean matchingResult = Pattern.matches("s[a-z]t","set");//true
		
		//type15
		//boolean matchingResult = Pattern.matches("s[^aeiou]t","Jet");//false
		//boolean matchingResult = Pattern.matches("s[^aeiou]t","smt");//true
		
		//type 16
		//\\d(double backward slace d )  it means 0-9
		//boolean matchingResult = Pattern.matches("\\dam","8am");//true
		boolean matchingResult = Pattern.matches("\\dam","tam");//false
		
		
		if(matchingResult)
		{
			System.out.println(" matched ");
		}
		else
		{
			System.out.println(" not matched ");
		}

	}

}
