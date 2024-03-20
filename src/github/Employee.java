package github;

public class Employee {
	
	
	String name,jobtitle;
	int HRA,salary;
	int DA,total_salary;
	
	Employee(String name,String jobtitle,int salary)
	{
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
		
		
	}
	public int calculate()
	{
		HRA=5000;
		DA=(salary*10)/100;
		total_salary=salary+DA+HRA;
		return DA;
	}
	public int getDA()
	{
		
		DA=(salary*10)/100;
		return DA;
	}
	
	public void display()
	{
	System.out.println("Name: "+name+ "Job title: "+jobtitle +"Total Salary: "+total_salary);
	}
}
class employee_main {
	public static void main(String[] args) {
		Employee e=new Employee("Analise"," Human Resource Manager",15000);
		e.calculate();
		e.display();
	}
}

	


