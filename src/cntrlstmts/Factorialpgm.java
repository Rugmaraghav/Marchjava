package cntrlstmts;

import java.util.Scanner;

public class Factorialpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			int no=5;
			int f=1;
			//5*4*3*2*1-5!
			while(no>0)
			{
			 f=f*no;
			 no--;
			}
			System.out.println(f);
	}

}
