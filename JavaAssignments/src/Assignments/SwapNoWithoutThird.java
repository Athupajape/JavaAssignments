package Assignments;

import java.util.Scanner;

public class SwapNoWithoutThird {

	int a,b;
	
	public void Swap(int a, int b) {
		
		this.a=(a+b)-a;
		this.b=(a+b)-b;
	}
	
	
	
	public static void main(String[] args) {
		
		SwapNoWithoutThird obj=new SwapNoWithoutThird();
		
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
