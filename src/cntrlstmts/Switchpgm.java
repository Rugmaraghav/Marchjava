package cntrlstmts;

import java.util.Scanner;

public class Switchpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter day: ");
		Scanner sc=new Scanner(System.in);
		String day=sc.nextLine();	
		switch(day)
		{
		case "monday":
			System.out.println("monday");
			break;
			
		case "tuesday":
		     System.out.println("tuesday");
		 	break;
		case "wednesday":
		     System.out.println("wednesday");
		 	break;
		case "thursday":
		     System.out.println("thursday");
		 	break;
		     
		case "friday":
		     System.out.println("friday");
		 	break;
		 default:System.out.println("invalid day");
		     
		
		
		
		}
		
		
	}

}
