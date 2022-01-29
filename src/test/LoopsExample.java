package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=0;
		for ( int i=0;i<10;i++)
		{
			if(i==8)
			{
				break;
			}
			System.out.println("No is"+i );
		}
		
		int t=10;
		for(int t2=10; t2>=1;t2--)
		{
			System.out.println("No is t"+t2 );
		}
		int y=15;
		
		
		int [] array= {10,50,60,80};
		 for(int i=0;i<array.length;i++)
		 {
			 System.out.println(array[i]);
		 }
		 
		 for( int value:array)
		 {
			 System.out.println(value);
		 }
		
		
		while(y<20)
		{
			System.out.println(" yes y is lessh than 20");
			if( y==2)
			{
				y=y+1;
				continue;
			}
			y++;
		}
	}

}
