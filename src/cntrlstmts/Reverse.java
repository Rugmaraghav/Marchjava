package cntrlstmts;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number:");
//		int no=sc.nextInt();
		int no=123;   
		int r,rev = 0;
		while(no>0)
		{
			r=no%10;     //1. r=123%10=3 r=3    2.3=12%10  r=2         3. 1
			rev=rev*10+r;//0=0*10+3= 3          2. 3=3*10+2=32 rev=32   2. 32*10+1=321
			no=no/10; // 12                     2.1
		}

		System.out.println("reversed no= "+rev);
	}

}
