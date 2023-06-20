package oopspkg;

class mthd
{ 
	int a=10,b=20,c=30,d;
	public void add()
	{
	 d=	a+b;
		System.out.println(d);
	}	
	public void add(int a,int c)
	{
		d=a+c;
		System.out.println(d);
	}
}

public class Methdoverloading extends mthd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	mthd s=new Methdoverloading();
		s.add();
		s.add(20, 20);	
		
	}
	
	public void add()
	{
		super.add();
		System.out.println("haii");
	}

}
