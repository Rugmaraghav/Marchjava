package pkg;

public class Variabless {
	
	String name;
	long phoneno;
	static String institute="luminar";
	
	public void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variabless ob=new Variabless();
		ob.add();

		System.out.println(ob.name="abc");
		
		Variabless ob1=new Variabless();
		System.out.println(ob.name="bcd");
		
		System.out.println(ob.name);
		System.out.println(institute="google");
		System.out.println(institute="luminar");
		
	}

}
