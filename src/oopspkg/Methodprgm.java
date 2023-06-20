package oopspkg;

public class Methodprgm {
	int a;
	int b;
	int c;
	int g;
	//no parameters
	void sum()
	{
		c=a+b;
		System.out.println(c);
	}
	
	//with parametrs
	public void sub(int e,int f)
	{
		g=e-f;
		System.out.println(g);
		
	}
	
	public int mul()
	{
	  c=a*b;
	  return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Methodprgm ob=new Methodprgm();
		ob.a=5;
		ob.b=14;
		ob.sum();
		ob.sub(20, 10);
		int m=ob.mul();
		System.out.println(m);
		
	}

}
