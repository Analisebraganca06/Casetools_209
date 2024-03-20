package github;

public class Fibonacci {
	int num;
	int first_num;
	int second_num;
	int number;
	
	Fibonacci(int num)
	{
		this.num=num;
		
	}
	
	String series()
	{
		StringBuilder values = new StringBuilder(""); 
		int first_num=0,second_num=1,number=0;
		values.append(Integer.toString(first_num)+" "+Integer.toString(second_num));
		for(int i=3;i<=num;i++)
		{
			
			number=first_num+second_num;
			values.append(" "+Integer.toString(number));
			first_num=second_num;
			second_num=number;
			
		}
		return values.toString();
		
	}
	


}
