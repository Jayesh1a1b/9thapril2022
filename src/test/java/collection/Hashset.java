package collection;

import java.util.HashMap;

public class Hashset {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(100, "jayesh");
		hm.put(200, "pawan");
		hm.put(300,"Nikita");
		hm.put("city", "pune");
		hm.put("country","india" );
		System.out.println(hm);//{country=india, 100=jayesh, city=pune, 200=pawan, 300=Nikita}
        System.out.println(hm.get(300));//Nikita
        System.out.println(hm.remove(200));
        System.out.println(hm);//{country=india, 100=jayesh, city=pune, 300=Nikita}
        System.out.println(hm.containsKey(100));//true
        System.out.println(hm.containsKey("praveen"));//false
        System.out.println(hm.containsValue("pune"));//true
        System.out.println(hm.containsValue("Nashik"));//false
        System.out.println(hm.isEmpty());//false
        System.out.println(hm.keySet());//return all the keys as set and not allowed duplicate
        //[country, 100, city, 300] //return all the values but we want read each individual value so we use for each loop
        
        for( Object i:hm.keySet())//because we create object of HashMap if we create obj of specific type like Integer then in for each loop return type is int
        {
        	System.out.println(i);//we want read each individual value so we use for each loop
            
        }
//        country
//        100
//        city
//        300
        System.out.println(hm.values());//return all the values as collection (allowed duplicate value)
        //[india, jayesh, pune, Nikita]
        
        //we want read each individual value so we use for each loop
        
         for(Object i:hm.values())
         {
        	 System.out.println(i);
         }
//         india
//         jayesh
//         pune
//         Nikita
        
        
        System.out.println(hm.entrySet());//returns all the entries as set(keys and value combination)
        //[country=india, 100=jayesh, city=pune, 300=Nikita]
        for(Object i:hm.keySet())
        {
       	 System.out.println(i+" "+hm.get(i));
        }
//        country india
//        100 jayesh
//        city pune
//        300 Nikita
        
               
        
        
	}

}
