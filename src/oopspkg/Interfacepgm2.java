package oopspkg;


interface BasicAnimal{
	public void eat();
	public void sleep();
}

class Monkey{
	public void jump()
	{
		System.out.println("jump");
	}
}

public class Interfacepgm2 extends Monkey implements BasicAnimal{
	public static void main(String[] args) {
   Interfacepgm2 ob=new Interfacepgm2();
   BasicAnimal b=new Interfacepgm2();
   
   ob.eat();
   ob.jump();
   b.eat();
   b.sleep();
	}

	@Override
	public void eat() {
		System.out.println("eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("jump");
		
	}

}
