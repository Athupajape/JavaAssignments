package Assignments;

import java.util.Scanner;

public class FibnocciSeries {

	int n1=0,n2=1;
	int sum;
	
	public int CalculateFibnocci(int x) {
		
		
		for(int i=2;i<x;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		FibnocciSeries obj=new FibnocciSeries();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find FibnocciSerires : ");
		int x=sc.nextInt();
		System.out.println("The FibocciSeries for provided number is ");
		System.out.print(obj.n1+" "+obj.n2);
		obj.CalculateFibnocci(x);
		
	}
	
}
