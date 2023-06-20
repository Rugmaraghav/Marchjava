package oopspkg;

class parent
{
	public void display()
	{
		System.out.println("parentclass");
	}
}

class child extends parent
{
	public void show()
	{
		System.out.println("child class");
	}
}
class child2 extends child
{
	public void print()
	{
		System.out.println("child2 class");
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	child c=new child();
	c.display();
	c.show();
	child c2=new child2();
	c2.display();
	c2.show();
	
		
		

	}

}
