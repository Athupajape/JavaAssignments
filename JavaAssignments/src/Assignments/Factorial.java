package Assignments;

import java.util.Scanner;

public class Factorial {

	public int CalculateFactorial(int x) {
		if(x==0) {
			return 1;
		}
		return x* (CalculateFactorial(x-1));
	}
	
	
	public static void main(String[] args) {
		
		Factorial obj=new Factorial();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial : ");
		int x=sc.nextInt();
		
		int fact= obj.CalculateFactorial(x);
		System.out.println("The Factorial of number "+x+" is : "+fact);
			
		
	}
	
}
