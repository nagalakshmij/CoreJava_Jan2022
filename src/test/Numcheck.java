package test;

import java.util.Scanner;

public class Numcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter age");
		int no= scanner.nextInt();
	if (no%2==0)
	{
		System.out.println("no is even");
	}
	else
	{
		System.out.println("no is odd");
	}
			

	}

}
