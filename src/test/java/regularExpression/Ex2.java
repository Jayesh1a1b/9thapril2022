package regularExpression;

import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		
		//boolean matchingResult = Pattern.matches("[^0-9]et","5et");//false
		
		//type17[^my] means start with my after nothing
		//boolean matchingResult = Pattern.matches("^my","my name is jayesh");//false
		//boolean matchingResult = Pattern.matches("^my","my");//true
		
		//type18(^my.*) means start with my and after that anything
		//boolean matchingResult = Pattern.matches("^my.*","my name is jayesh");//true
		//boolean matchingResult = Pattern.matches("^my.*","my &56");//true
		
		//type19(.*jayesh$) means end with jayesh and before that any thing
		//boolean matchingResult = Pattern.matches(".*jayesh$","my name is jayesh");//true
		//boolean matchingResult = Pattern.matches(".*jayesh$","my name is jayesh choudhary");//false because end with jayesh
		
		
		//type20
		//boolean matchingResult = Pattern.matches("jay..h","jayesh");//true because here two (..) so two character 
		//boolean matchingResult = Pattern.matches("jay..h","jayessh");//false 3 character insert
		//boolean matchingResult = Pattern.matches("jay..h","jay__h");//true 
		//boolean matchingResult = Pattern.matches("jay..h","jay&%h");//true
		
		//type21(.* vs .+)
		//boolean matchingResult = Pattern.matches("^my.*jayesh$","myjayesh");//true
		//boolean matchingResult = Pattern.matches("^my.*jayesh$","my name is jayesh");
		//in .* means zero or any number of time repeating
		
		//boolean matchingResult = Pattern.matches("^my.+jayesh$","my name is jayesh");//true
		//boolean matchingResult = Pattern.matches("^my.+jayesh$","myjayesh");//false
		//boolean matchingResult = Pattern.matches("^my.+jayesh$","my jayesh");//true
		//in .+ means minimum one character after that 
		
		//type 22 
		//boolean matchingResult = Pattern.matches("^my.{2}jayesh$","myisjayesh");//true//here after . in {} we write how much character
		//boolean matchingResult = Pattern.matches("^my.{9}jayesh$","my name is jayesh");//true
		//boolean matchingResult = Pattern.matches("^my.{2}jayesh$","my name is jayesh");//false
		//boolean matchingResult = Pattern.matches("^my.{2}jayesh$","my55jayesh");//true
		
		//type23(using | symbol) means or
		//boolean matchingResult = Pattern.matches("java|Java","java");//true
		//boolean matchingResult = Pattern.matches("java|Java","Java");//true
		//boolean matchingResult = Pattern.matches("java|Java","kava");//false
		
		//type24
		//boolean matchingResult = Pattern.matches("[a-d[m-p]]","java");//false accept single character within range
		//boolean matchingResult = Pattern.matches("[a-d[m-p]]","j");//not within the range
		//boolean matchingResult = Pattern.matches("[a-d[m-p]]","a");//true
		//boolean matchingResult = Pattern.matches("[a-d[m-p]]","m");//true
		//boolean matchingResult = Pattern.matches("[a-d[m-p]]","o");//true
		
		//type25
		//boolean matchingResult = Pattern.matches("[a-z&&[def]]","e");//both condition checked //true
		//boolean matchingResult = Pattern.matches("[a-z&&[def]]","f");//true
		//boolean matchingResult = Pattern.matches("[a-z&&[def]]","a");//false
		//boolean matchingResult = Pattern.matches("[a-z&&[def]]","t");//false
		
		//type 26
		//boolean matchingResult = Pattern.matches("b{2,}at","bat");//false minimum two b should be there 
		//boolean matchingResult = Pattern.matches("b{2,}at","bbat");//true
		//boolean matchingResult = Pattern.matches("b{2,2}at","bbat");//true minimum 2 times and maximum 2 times
		//boolean matchingResult = Pattern.matches("b{2,4}at","bbbbat");//true
		boolean matchingResult = Pattern.matches("b{1,1}at","bat");//true
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

	


