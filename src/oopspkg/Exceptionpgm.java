package oopspkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException  {
		// TODO Auto-generated method stub
		
//		
//		System.out.println("program started");
//		
//		Thread.sleep(3000);
//		
//		System.out.println("program completed");
		
		
//		
		try {
	String s=null;
	System.out.println(s.length());
	
	
		}
	catch(NullPointerException e)
	{
		System.out.println("------------");
		System.out.println("nullpointer exception");
		System.out.println(e.getMessage());
	}
		
   
		
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number");
	 int value=sc.nextInt();
	 System.out.println(value);
	 
	
	 
	 
	// System.out.println("hello");
	 
	 
	//checked exception	
	FileInputStream fi=new FileInputStream("e://book1.xlsx");
		
//		int s=70;
//		System.out.println("program started");
//     try {
//    	 System.out.println(s/0);
//     }
//     catch(Exception e)
//     {
//    	 System.out.println("inside catch");
//    	 
//     }
//		
//		
//		System.out.println("program completed");
}

}
