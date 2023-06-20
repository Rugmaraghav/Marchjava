package cntrlstmts;

import java.util.Scanner;

public class Twodarray  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rowsize:");
		r=sc.nextInt();
		System.out.println("enter column size:");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter numbers:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("entered nos are:");
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<2;j++) {
//				
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//			
//		}
		
		for(int[] b:a)
		{
			for(int d:b)
			{
				System.out.print(d+" ");
			}
			System.out.println();
		}
		
		

	}

}
