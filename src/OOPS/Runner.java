package OOPS;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee emp1=new Employee();
		emp1.Name="lakshmi";
		emp1.EmployeeId=123;
		emp1.Salary=12500;
		
		
		Employee emp2=new Employee();
		emp2.Name="Shiva";
		emp2.EmployeeId=456;
		emp2.Salary=2500;*/
		
		//System.out.println("Employee name"+emp1.Name);
		//System.out.println("Employee name"+emp2.Name);
		
		Employee emp1= new  Employee("naga",123,50000);
		Employee emp2= new  Employee("lajshmi",456,50000);
		emp2.employeeprintname();
		emp1.employeeprintname();
		
		Employee emp3= new  Employee("krishna",333);
		emp3.employeeprintname();
		
		System.out.println("employee salary"+Employee.Salary);
		Employee.changecompanyname();
		System.out.println("Company name"+Employee.companyname);
		
		Person obj= new Person();
		child ch=new child();
		ch.display();
		ch.print();
		MethodOverloadingExample obj1=new MethodOverloadingExample();
		obj1.sum(5,6);
		obj1.sum(5,6,8);
		
		ICICI b=new ICICI();
		b.checkbalance();
		EncapsulationExample ex=new EncapsulationExample();
	     ex.setName("erer");
		System.out.println(ex.getName());
		
		
				
		
	}

}
