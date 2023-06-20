package oopspkg;

import java.util.Scanner;


interface Animaldetails
{
	public void catdetails(String catname,String catage,String catprice);
	public void dogdetails(String dogname,String dogage,String dogprice,String dogbreed);
	public void fishdetails(String fishname,String fishage,String fishprice);
}

class petshop implements Animaldetails{
	Scanner sc=new Scanner(System.in);

	@Override
	public void catdetails(String catname, String catage, String catprice) {
		System.out.println("cat name is"+catname);
		System.out.println("cat age is"+catage);
		System.out.println("cat price is"+catprice);
		
	}

	@Override
	public void dogdetails(String dogname, String dogage, String dogprice, String dogbreed) {
		System.out.println("dog name is"+dogname);
		System.out.println("dog age is"+dogage);
		System.out.println("dog price is"+dogprice);
		System.out.println("dog breed is"+dogbreed);
		
	}

	@Override
	public void fishdetails(String fishname, String fishage, String fishprice) {
		
		System.out.println("fish name is"+fishname);
		System.out.println("fish age is"+fishage);
		System.out.println("fish price is"+fishprice);
		
	}
	
	
}


public class Petdetails {

	public static void main(String[] args) {
		petshop ob=new petshop();
		ob.catdetails("chakki", "2", "5000");
		ob.dogdetails("rocky", "3","25000", "lab");
		ob.fishdetails("fighter","1","2000");

	}

}
