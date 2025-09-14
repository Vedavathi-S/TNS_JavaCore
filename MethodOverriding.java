
//Runtime Polymorphism 

class Company{
	String Name;
	int No_of_emp;
	String Department;
	
	Company()
	{
		Name="Infosys";
		No_of_emp=84;
		Department="Finance";
		System.out.println("Hi I am Superclass ");
	}
	void display_info()
	{
		System.out.format("Name: "+Name+"\nNumber Of Employees: "+No_of_emp+"\nDepartment in General: "+Department+"\n\n");
	}
}
class Employee1 extends Company{
	String Name;
	String Role;
	int age;
	int Salary;
	Employee1()
	{
//		super.display_info();
		this.Name="Bhavana";
		this.Role="Intern";
		this.age=20;
		this.Salary=20000;
	}
	Employee1(String Name,String Role,int age,int Salary)
	{
		
		this.Name=Name;
		this.Role=Role;
		this.age=age;
		this.Salary=Salary;
		
	}
	
	//overriding a super class method(if this method is not created the super class method will be displayed by run time polymorphism)
	@Override
	void display_info()
	{
//		super.display_info();
		System.out.format("Name:%s\nRole: %s\nage: %d\nSalary: %d\nCompany Name: %s\n\n ",Name,Role,age,Salary,super.Name);
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
	Employee1(String Name,int age)
	{
		this.Name=Name;
		this.Role="Manager";
		this.age=age;
		this.Salary=200000;
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company  c1=new Employee1();//References super class but object is created for Employee class
		c1.display_info();//displays the employee class method(example of runtime polymorphism)
		Employee1 e1=new Employee1();
		e1.display_info();
		System.out.print(e1);

	}

}
