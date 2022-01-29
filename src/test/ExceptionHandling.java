package test;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num=10;
		int num1;
		int []array= {10,20,30};
		try
		{
			//num=num/0;
			System.out.println(array[5]);
		}
		catch( ArithmeticException e)
		{
			System.out.print("in atithmetic releation");
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.print("in atiArrayIndexOutOfBoundsExceptiont releation");
		}
		/*catch( Exception e)
		{
			System.out.println("in exceptione");
		}*/
		
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("after try catch block");
	}

}
