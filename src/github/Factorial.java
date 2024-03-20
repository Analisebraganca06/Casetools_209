package github;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number: ");
		num1=scan.nextInt();
		
		int fact=1;
	
		
		for(int i=1;i<=num1;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is: "+fact);
		
	}

}
