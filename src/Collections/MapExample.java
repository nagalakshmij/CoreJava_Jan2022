package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer, String > map1= new HashMap<Integer, String>();
		map1.put(1, "naga");
		map1.put(10, "lakshmi");
		map1.put(3, "srikar");

		//update 
		map1.put(2, "sivaram");
		System.out.println(map1);

		//delete entry
		map1.remove(2);

		System.out.println(map1);

		
		for(Map.Entry<Integer, String> entry1:map1.entrySet())
		{
			
			
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
			
		}
		
		// for Iterating through  keys
		for( Integer val:map1.keySet())
		{
			System.out.println("key is"+val);
			System.out.println("value  is"+map1.get(val));
		}
		// for Iterating through values
		
		for( String val:map1.values())
		{
			System.out.println("key is"+val);
		}

		//++++++++++++++++++++++++++++++++++++++

		LinkedHashMap<Integer, String > map2= new LinkedHashMap<Integer, String>();
		map2.put(1, "naga");
		map2.put(10, "lakshmi");
		map2.put(3, "srikar");

		System.out.println("map2"+map2);


		//++++++++++++++++++++++++++++++++++++++

		TreeMap<Integer, String > map3= new TreeMap<Integer, String>();
		map3.put(1, "naga");
		map3.put(10, "lakshmi");
		map3.put(3, "srikar");

		//update 
		map3.put(2, "sivaram");
		System.out.println("map3"+map3);

	}

}
