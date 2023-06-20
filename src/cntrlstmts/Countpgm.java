package cntrlstmts;

import java.util.Scanner;

public class Countpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number:");
	int no=sc.nextInt();
	int count=0,r;
	while(no>0) {
		r=no%10; //
		count=count+1;
		no=no/10;
		
	}
	
	System.out.println("count ="+count);
	}

}
