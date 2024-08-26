package Assignments;

import java.util.Scanner;

public class PrintTable {

	public void Print(int x) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(x+"*"+i+"="+(x*i));
		}
	}
	
	
	public static void main(String[] args) {
		
		PrintTable obj=new PrintTable();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number for which table needs to be printed : ");
		int x=sc.nextInt();
		
		obj.Print(x);
	}
	
	
}
