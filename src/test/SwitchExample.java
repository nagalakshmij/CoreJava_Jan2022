package test;

import java.util.Scanner;

public class SwitchExample 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="HEllo";
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter the string to count vowels");
		String str=scanner.nextLine();
		int vowelcount=0;

		for( int i=0; i<str.length(); i++)
		{
			String s=str.toUpperCase();
			System.out.println("Converted to uppercase"+s);
			char  c=s.charAt(i);

			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelcount=vowelcount+1;
				break;

			}

		}
		System.out.println("Vowel count is "+vowelcount);
		scanner.close();

	}
}
