package cntrlstmts;

import java.util.Scanner;

public class Onedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
	 int size=sc.nextInt();
		String []names=new String[size];
		System.out.println("enter names:");
		for(int i=0;i<size;i++)
		{
			names[i]=sc.next();
		}
		System.out.println("entered names:");

//		for(int i=0;i<size;i++)
//		{
//			System.out.println(names[i]);
//		}
		for(String s:names)
		{
			System.out.println(s);
		}
		
		
	}

}
