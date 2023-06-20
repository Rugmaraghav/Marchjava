package oopspkg;
abstract class Bike
{
	abstract void speed();
	abstract void engine();
	public void bodyparts()
	{
		System.out.println("bodyparts");
	}
}

class Hero extends Bike
{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void engine() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void bodyparts() {
		// TODO Auto-generated method stub
		super.bodyparts();
	}
	
}

public class Abstractclasspgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
