package test;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] x= {10,20,30};
		System.out.println(x.length);
		
		for ( int i =0; i< x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		String str="clean world is green world";
		String []array=str.split(" ");
		System.out.println(array.length);
				
	}

}
