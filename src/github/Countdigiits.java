package github;

public class Countdigiits {
	
	int num1;
	
	Countdigiits(int num1){
		this.num1=num1;
	}
	
	int getcount()
	{
		int count=0;
		while(num1!=0)
		{ 
			num1=num1/10;
			count=count+1;
		}
		return count;
	}

	

}
