package oopspkg;

class Fruits
{
	public void colour()
	{
		System.out.println("colour of fruit");
	}
	
	protected void  taste() {
		System.out.println("taste of fruit");
	}
}

class Apple extends Fruits
{
	@Override
	public void colour()
	{
		System.out.println("colour of Apple");
	}

	@Override
	protected void taste() {
		System.out.println("taste of Apple444444");
		super.taste();
	}
}

public class Accessmodifierspgm {

	public static void main(String[] args) {
		

	}

}
