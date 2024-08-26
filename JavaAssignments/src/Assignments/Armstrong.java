package Assignments;

import java.util.Scanner;

public class Armstrong {

	public void CheckArmstrong(int x) {
		
		int num=0;
		int tempvar=x;
		int sum=0;
		int count=0;
		
		//152->0+2->2
		
		while(tempvar!=0) {
			tempvar=tempvar/10;
			count++;
		}
		
		tempvar=x;
		
		while(tempvar!=0) {
			num=tempvar%10;
			sum=sum+ (int)(Math.pow(num, count));
			tempvar=tempvar/10;
		}
		
		if(x==sum) {
			System.out.println("Provided Number is an Armstrong Number");
		}
		else {
			System.out.println("Provided Number is not an Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
		Armstrong obj=new Armstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x=sc.nextInt();
		obj.CheckArmstrong(x);
	}
	
	
	
}
