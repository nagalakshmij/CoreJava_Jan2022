package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// reverse string variable

		String str="hello";
		String reverse="";
		for( int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse +str.charAt(i);
			if( str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='0' ||str.charAt(i)=='0')
			{
				System.out.println("reverse contains vowels");

			}

		}
		System.out.println(reverse);

		// reverse of array
		int []array= {10,30,40,50};
		int []array2=new int[5];// declaration
		for(int index=array.length-1;index>=0;index--)
		{

			System.out.println(array[index]);
		}

		
		// reverse of number
		int num=452346;
		int number = 987654, reverse1 = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse1 = reverse1 * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse1);  
		}  
		  
		
	}


