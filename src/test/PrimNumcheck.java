package test;

public class PrimNumcheck
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int num =13;
		boolean result=true;

		for( int i=2; i<num/2; i++)
		{
			if (num% i==0)
			{
				//System.out.println("it is not prime number");
				result=false;
				break;
			}

		}
		if( result==true )
		{

			System.out.println("it is  prime number");

		}
		else
		{
			System.out.println("it is not a prime number");
		}
	}
}