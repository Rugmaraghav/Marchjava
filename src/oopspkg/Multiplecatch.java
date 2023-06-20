package oopspkg;

public class Multiplecatch {

	public static void main(String[] args) {
	try
	{
		int a[]=new int[5];
		a[3]=10/0;
		System.out.println("inside try");
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("arithmetic");
	}
	catch()

	}

}
