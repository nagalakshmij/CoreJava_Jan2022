package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) 
	{
		HashSet<String >set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("fir");
		set.add(null);
		System.out.println(set);
		
		LinkedHashSet<String >set1=new LinkedHashSet<String>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add(null);
		System.out.println(set1);
		
		

		TreeSet<String >ts=new TreeSet<String>();
		ts.add("one");
		ts.add("foru");
		ts.add("three");
		//ts.add(null);
		System.out.println(ts);
		
		String str="hello world safe world clean world";
		String [] arr=str.split(" ");
		HashSet<String >hs=new HashSet<String>();
		for (int index=0;index<arr.length;index++)
		{
			hs.add(arr[index]);
		}
		//hs.add(arr[1]);
		System.out.println("hs"+hs);
}
}