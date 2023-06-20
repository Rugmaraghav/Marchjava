package oopspkg;

class p
{
	public void pmethod()
	{
		System.out.println("p class");
	}
}
class ch extends p
{
	
	public void chmethd()
	{
		System.out.println("ch class");
	}
}
class ch2 extends p
{
	public void ch2method()
	{
		System.out.println("ch2 class");
	}
}




public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch c=new ch();
		c.chmethd();
		c.pmethod();
		ch2 c2=new ch2();
		c2.ch2method();
		c2.pmethod();
	

	}

}
