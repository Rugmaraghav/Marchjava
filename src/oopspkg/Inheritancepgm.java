package oopspkg;

class baseclass
{
	public void add()
	{
		System.out.println("baseclassmethod");
	}
}


class childclass extends baseclass
{
	public void sub()
	{
		System.out.println("childclassmethod");
	}
	
	public void add()
	{
		System.out.println("classmethod");
	}
	
}

public class Inheritancepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//baseclass b=new baseclass();
		//b.add();
	
		childclass n=new childclass();
		//n.add();
		//n.sub();
		
		baseclass b=new childclass();
		b.add();
		//b.sub();
		
		baseclass b1=new baseclass();
		//b1.add();
		
	//	childclass c1=new baseclass();
		
		
	}

}
