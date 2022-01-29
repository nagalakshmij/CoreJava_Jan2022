package OOPS;

public class Person
{
	String Name;
	int age;
	public Person()
	{

	}

	public void display()
	{
		System.out.println("i am parent");
	}
	public Person( String Name, int age)
	{
		this.Name=Name;
		this.age=age;
	}

}
