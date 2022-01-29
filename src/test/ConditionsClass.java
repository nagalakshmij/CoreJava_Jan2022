package test;

import java.util.Scanner;

public class ConditionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter age");
		int age= scanner.nextInt();
		if( age >=18)
			
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("you are noteligible for voting");
		}
		scanner.close();
		
		
		if( age%2==0)
		{
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}
	}
	
	
	

}
