package github;

import java.util.Scanner;

public class Armstrongs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		number=scan.nextInt();
					
		int remainder;
		int result = 0;
		int origionalnum;
		origionalnum=number;

        while (number>0)
        {
           remainder=number%10;
           result=(( remainder* remainder* remainder)+result);
           number=number/10;
           
        }
        if(origionalnum==result )
            System.out.println("is an Armstrong number.");
        else
            System.out.println("is not an Armstrong number.");
    }
}


