package oopspkg;

interface I
{
	public void add();
	void sub();
	public void mul();
}

interface scientifc extends I
{
	public void percentage();
	void mod();

}

class calc implements scientifc
{

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sub() {
		
		System.out.println("sub");
	}

	@Override
	public void mul() {
		
		System.out.println("mul");
	}

	@Override
	public void percentage() {
		System.out.println("percentage");
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
	}

	
}


public class Interfacepgm {	
	public static void main(String[] args) {
		

	}

}
