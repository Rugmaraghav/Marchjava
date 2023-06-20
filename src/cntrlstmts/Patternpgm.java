package cntrlstmts;

import java.util.Scanner;

public class Patternpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner star=new Scanner(System.in);
		System.out.println("enter the rows");
		int r=star.nextInt();
		System.out.println("enter the columns");
		int c=star.nextInt();
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)

		{

		            if(i==0 || i==r-2 ||j==0 || j==r-1 )
		            {
		            System.out.print("*   " );
		            }
		           
		           

		}
		System.out.println();
		}

	}

}
