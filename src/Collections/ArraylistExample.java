package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args)
	{	
		// TODO Auto-generated method stub
		ArrayList <String> arr= new ArrayList<String>();
		arr.add("lakshmi");//0 index
		arr.add("naga");//1 index
		arr.add("srikar");//2 index
		arr.add("shiva");//3 index
		System.out.println(arr);
		System.out.println(arr.size());
		//arr.remove(0);
		System.out.println(arr.get(0));
		System.out.println(arr);
		arr.set(2, "ram");
		for( int i=0; i<arr.size();i++)
		{
			if (arr.get(i).equalsIgnoreCase("naga"))
			{
				System.out.println("element found");
			}
		}
	
	
	for( String name: arr)
	{
		System.out.println("name"+name);
	}

	Iterator<String> itr=arr.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//sorting arraylist
	Collections.sort(arr);
	System.out.println(arr);
	// sorting in reverese order
	Collections.sort(arr, Collections.reverseOrder());
	System.out.println(arr);
}
	
}