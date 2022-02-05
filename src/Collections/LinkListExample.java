package Collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<String >list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.addFirst("adding");
		for( int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
