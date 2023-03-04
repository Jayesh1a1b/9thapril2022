package javaLogic;

import java.util.HashMap;
import java.util.Set;

public class CountRepatitativeString {

	public static void main(String[] args) {
		String s="abc abc xyz pqr xyz";
		String[] a = s.split(" ");
		//System.out.println(a[2]);//xyz 
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		for(int i=0;i<=a.length-1;i++)
		{
			String StringKey = a[i];
			if(hm.containsKey(StringKey))
			{
				hm.put(StringKey, hm.get(StringKey)+1);
			}
			else
			{
				hm.put(StringKey, 1);
			}
		}
     System.out.println(hm);
     Set<String> AllString = hm.keySet();
     for(String as:AllString)
     {
    	 System.out.println(as+":"+hm.get(as));
     }
	}

}
