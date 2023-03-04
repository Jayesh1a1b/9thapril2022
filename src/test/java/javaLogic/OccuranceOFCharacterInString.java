package javaLogic;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOFCharacterInString {

	public static void main(String[] args) {
		String s="abcabca";
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0;i<=s.length()-1;i++)
        {
        	char charKey = s.charAt(i);
        	if(hm.containsKey(charKey))
        	{
        		hm.put(charKey, hm.get(charKey)+1);
        	}
        	else
        	{
        		hm.put(charKey, 1);
        	}
        }
        System.out.println(hm);
        Set<Character> AllChar = hm.keySet();
        for(Character i:AllChar)
        {
        	System.out.println(i+":"+hm.get(i));
        }
	}

}
