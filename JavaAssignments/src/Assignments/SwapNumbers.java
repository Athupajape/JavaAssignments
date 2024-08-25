package Assignments;

import java.util.Scanner;

public class SwapNumbers {

	//Swapping of two number using third variable
	
	int a,b,c;
	
	public void Swap(int a,int b) {
		this.c=a;
		this.a=b;
		this.b=this.c;
	}
	
	
	
	public static void main(String[] args) {
		SwapNumbers obj=new SwapNumbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter First Number : ");
		obj.a=sc.nextInt();
		System.out.println("Please enter Second Number : ");
		obj.b=sc.nextInt();
		
		System.out.println("Numbers before swapping are : a="+obj.a+" b="+obj.b);
		
		obj.Swap(obj.a,obj.b);
		
		System.out.println("Numbers After swapping are : a="+obj.a+" b="+obj.b);
	}
}
