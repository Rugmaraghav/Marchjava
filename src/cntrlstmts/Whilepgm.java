package cntrlstmts;

import java.util.Scanner;

public class Whilepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0;
System.out.println("enter the no: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=n;

while(n>0)
{
	//234---2^3 +3^3 +4^3
	 int a=n%10; // 234/10=4 quotient =23  2nd--3
	 System.out.println(a);
	 n=n/10; //---23 2nd-2
	 System.out.println(n);
	  c=c+(a*a*a);// 0=0+4*4*4 2nd 64=64+3*3*3 
	  System.out.println(c);
	
}
if(t==c)
{
	System.out.println("armstrong number");
}
else
{
	System.out.println("not armstrong");
}
}

	
}
