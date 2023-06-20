package cntrlstmts;

import java.util.Scanner;
public class Arraypgm {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size :");
		int size=s.nextInt();
		String str[]=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter names:");
			str[i]=s.next();
		}
		System.out.println("entered name are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(str[i]);
		}
		
		
		
		

	}
	
	private void setvalues()
	{
		System.out.println("hello");
	}

}
