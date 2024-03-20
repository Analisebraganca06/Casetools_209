package github;

public class Dog {
	
	String name;
	String breed;
	
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	String display()
	{
		System.out.println("Name:"+name);
		return name;
		
	}
	String display2()
	{
		System.out.println("Breed:"+breed);
		return breed;
		
	}
	String setter( String name)
	{
		this.name=name;
		return name;

	}
	String setter2(String breed)
	{
		this.breed=breed;
		return breed;

	}
class Dog_main {
	public static void main(String[] args) {
		Dog d=new Dog("Bingo","Sausage Dog");
		Dog d1=new Dog("Lessie","Pug");
		d.display();
		d1.display();
		d.setter("Mill");
		d.display();
		}	


}
}
