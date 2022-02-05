package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PriorityQueue<String > pq1= new PriorityQueue<>();
		pq1.add("nikitha");
		pq1.add("hello");
		pq1.add("c");
		pq1.add("d");
		pq1.add("e");
		pq1.add("f");
		
		System.out.println(pq1);
		System.out.println("first element"+pq1.peek());
		
		System.out.println("first element"+pq1.poll());
		
		System.out.println(pq1);
		
		
		
		ArrayDeque<String > dq1= new ArrayDeque<>();
		dq1.add("1");
		dq1.add("b");
		dq1.add("c");
		dq1.add("d");
		dq1.add("e");
		dq1.add("f");
		System.out.println("dq1"+dq1);
		System.out.println("dq1"+dq1.peek());
		System.out.println("dq1"+dq1.peekFirst());
		System.out.println("dq1"+dq1.peekLast());
		
		System.out.println("dq1"+dq1.pollFirst());
		System.out.println("dq1"+dq1.pollLast());
	}

}
