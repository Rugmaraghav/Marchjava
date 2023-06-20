package cntrlstmts;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean p=true;
		
		
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					p=false;
					break;
				}
			}
			
		if(p) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
