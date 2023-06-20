package oopspkg;

class Animal
{
	public void eat()
	{
		System.out.println("eating");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		super.eat();
		System.out.println("barking");
	}
}

class babydog extends Dog
{
	public void weep()
	{
		System.out.println("weeping");
	}
}




public class Multilevelinheritancepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		babydog d=new babydog();
		d.eat();
		//d.bark();
		d.weep();
		
		
	}

}
