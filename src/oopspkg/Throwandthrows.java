package oopspkg;

public class Throwandthrows {

	public static void main(String[] args) {
		try {
		int age=17;
		if(age>18)
		{
			System.out.println("major");
		}
		else
		{
			throw new ArithmeticException("error");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("must print");
		}
System.out.println("hello");
	}

}
