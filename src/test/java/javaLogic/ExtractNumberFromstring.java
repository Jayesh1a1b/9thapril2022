package javaLogic;

public class ExtractNumberFromstring {

	public static void main(String[] args) {
		String s="abc123ABC@$";
		String s1 = s.replaceAll("[^abc]", "");//lower case alphabet print
		System.out.println(s1);
		
		String s2 = s.replaceAll("[^ABC]", "");
		System.out.println(s2);//Extract upper case alphabet
		
		String s3 = s.replaceAll("[^0-9]","");//Extract number 
		System.out.println(s3);
		
	String s4 = s.replaceAll("[a-zA-Z0-9]", "");//print symbol if we not give ^ cap symbol and write pattern then except that print
    System.out.println(s4);
    
    String s5 = s.replaceAll("[1-9]", "");
    System.out.println(s5);
    
	}

}
