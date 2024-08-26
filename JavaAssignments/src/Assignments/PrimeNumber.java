package Assignments;

import java.util.Scanner;

public class PrimeNumber {
	int flag=0;
	
	public void CheckPrime(int x) {
		
		int y=x/2;
		
		if(x>1) {
			for(int i=2;i<=y;i++) {
				if(x%i==0) {
					System.out.println("The provided number : "+x+" is not Prime number");
					flag=1;	
					break;
				}
			}
		}
		
		if(x<=1 || flag==0) {
			System.out.println("Number is Prime");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		PrimeNumber p=new PrimeNumber();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x=sc.nextInt();
		
		p.CheckPrime(x);
		
	}
	
}
