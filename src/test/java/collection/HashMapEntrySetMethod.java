package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntrySetMethod {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();//create specific Integer type of object
		 hm.put(100, "Ashmita");
		 hm.put(100, "Pankaj");
		 hm.put(100, "Shweta");
		 hm.put(100, "Niteen");
		 hm.put(100, "Arnold");
		 System.out.println(hm);//{100=Arnold} print only latest value not allowed key as duplicate
		 hm.put(100, "Ashmita");
		 hm.put(200, "Pankaj");
		 hm.put(300, "Shweta");
		 hm.put(400, "Niteen");
		 hm.put(500, "Arnold");
		 System.out.println(hm);//print all entry {400=Niteen, 100=Ashmita, 500=Arnold, 200=Pankaj, 300=Shweta}

        //Entry methods
        //********************
        for(Entry<Integer, String> entry:hm.entrySet())
        //return type is object type declare so here object if we declare specific then return type is <Integer, String>
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
//        400 Niteen
//        100 Ashmita
//        500 Arnold
//        200 Pankaj
//        300 Shweta
        
        // same working as keySet() in HashMap interface
      
		
		for( Integer i:hm.keySet())//return type is Integer
        {
       	 System.out.println(i+" "+hm.get(i));
        }
//		400 Niteen
//		100 Ashmita
//		500 Arnold
//		200 Pankaj
//		300 Shweta
		System.out.println("--------------------------------------------");
		
		//By using Iterater()
		
		Set<Entry<Integer, String>> s = hm.entrySet();
		Iterator<Entry<Integer, String>> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
//		400=Niteen
//		100=Ashmita
//		500=Arnold
//		200=Pankaj
//		300=Shweta
	}

}
