package Assignments;

import java.util.Scanner;

public class Palindrome {
	
	public void CheckPalindrome(int x) {
		
		int num=0;
		int tempvar=x;
		
		while(tempvar!=0) {
			num=(num*10)+(tempvar%10);
			tempvar=tempvar/10;
		}
		
		if(x==num) {
			System.out.println("Given Number is Plaindrome");
		}
		else {
			System.out.println("Given Number is Not a Palindrome");
		}
	}

	
	public static void main(String[] args) {
		
		Palindrome obj=new Palindrome();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int x=sc.nextInt();
		
		obj.CheckPalindrome(x);
		
		
	}
	
}
