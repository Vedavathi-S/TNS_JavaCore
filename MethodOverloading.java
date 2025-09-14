class Employee{
	String Name;
	String Role;
	int age;
	int Salary;
	Employee()
	{
		this.Name="Bhavana";
		this.Role="Intern";
		this.age=20;
		this.Salary=20000;
	}
	Employee(String Name,String Role,int age,int Salary)
	{
		this.Name=Name;
		this.Role=Role;
		this.age=age;
		this.Salary=Salary;
		
	}
	
	void display_info()
	{
		System.out.format("Name: "+Name+"\nRole: "+Role+"\nage: "+age+"\nSalary: "+Salary+"\n\n");
	}
	void display_info(boolean isbasic)
	{
		if(isbasic)
		{
			System.out.format("Name: "+Name+"\nage: "+age+"\n\n");
		}
		else {
			System.out.format("Name: "+Name+"\nRole: "+Role+"\nage: "+age+"\nSalary: "+Salary+"\n\n");
		}
	}
	
	public String toString()
	{
		return "Name: "+Name+"\nRole: "+Role+"\nage: "+age+"\nSalary: "+Salary+"\n\n";
	}
	Employee(String Name,int age)
	{
		this.Name=Name;
		this.Role="Manager";
		this.age=age;
		this.Salary=200000;
	}
	
}
class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Veda","Software Developer",22,50000);
		e1.display_info();
		Employee e2=new Employee();
		e2.display_info();
		Employee e3=new Employee("Srinivas",40);
		e3.display_info();
		System.out.print(e1);
		e3.display_info(true);

	}

}
