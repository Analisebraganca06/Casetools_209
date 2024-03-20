package github;

import java.util.Scanner;

public class Teachers {
	String type;
	Teachers(String type)
	{
		this.type=type;
	}
	public void teaches()
	{
		System.out.println("The teacher is teaching");
	}
}
	
class teacherTeaches extends Teachers{
		
	String name;
	
	teacherTeaches(String type,String name)
	{
		super(type);
		this.name=name;
	}
	public void subjects()
	{
		System.out.println("The teacher is teaching "+type);
	}
}
class Teacher_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String type;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the subject the teacher teaches:");
		type=scan.next();
		teacherTeaches t1=new teacherTeaches(type,"Sandra");
		t1.subjects();
		}
}
