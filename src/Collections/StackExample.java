package Collections;

import java.util.Stack;

public class StackExample 
{

	public static void main(String[] args)
	{
		Stack<Integer> stack1 =new Stack<Integer>();

		stack1.push(4);
		stack1.push(5);
		stack1.push(6);
		stack1.pop();
		stack1.push(7);
		System.out.println(stack1);
		
		// to show the last element
		System.out.println(stack1.peek());
		
		
		
	}

}
