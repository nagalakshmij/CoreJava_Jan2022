package OOPS;

public class Employee {

	String Name;
	int EmployeeId;
	public static int Salary=5000;
	public static String companyname ="my company";
	
	public void employeeprintname()
	{
		System.out.println("printname"+Name);
	}
	
	public void employeesalary()
	{
		System.out.println("printname"+Salary);
	}
	public Employee( String Name, int EmployeeId,int salary)
	{
		this.Name=Name;
		this.EmployeeId=EmployeeId;
		this.Salary=Salary;
				
	}
	

	public Employee( String Name, int EmployeeId)
	{
		this.Name=Name;
		this.EmployeeId=EmployeeId;
						
	}
	
	public static void changecompanyname()
	{
		Employee.companyname="This is my company";
	}
}
