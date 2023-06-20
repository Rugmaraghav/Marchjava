package oopspkg;

class car{
	String colour="Blue";
	car()
	{
		System.out.println("car constructor");
	}
	
	public void start()
	{
		System.out.println("car started");
		
	}
	public void stop() {
		System.out.println("car stop");
	}
	
}

class Bmw extends car
{
	Bmw()
	{
		super();
	}
	@Override
	public void start()
	{
		
		super.start();
		System.out.println("bmw started");
		System.out.println("car colour is"+super.colour);//print parent class colour
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
}

 class Audi extends car
{
	@Override
	public void start()
	{
		super.start();
		System.out.println("audi started");
	}
}


public class Methodoverridingpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car b=new Bmw();
		b.start();
		car b1 =new Audi();
		b1.start();
		
		

	}

}
