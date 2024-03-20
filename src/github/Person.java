package github;

public class Person {
	
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	String getname()
	{
		return name;
		
	}
	int getage()
	{
		return age;
		
	}
	void setname(String name)
	{
		this.name=name;
	
		
	}
	void setage(int age)
	{
		this.age=age;
	}
	public void display_values(){
		System.out.println("Name:"+name+" Age:"+age);
	}
	
}
class person_main {
	public static void main(String[] args) {
		Person p1=new Person("Symone",20);
		Person p2=new Person("Nazia",25);
		p1.display_values();
		p2.display_values();
	}
}
	
