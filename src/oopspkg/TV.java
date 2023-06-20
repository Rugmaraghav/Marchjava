package oopspkg;


interface Tvremote{

	public void on();
	public void off();
	public void volume();
	
	
}
interface Smarttvremote
{
	public void playvideo();
	public void voicesearch();
}
class Tv1 implements Tvremote
{

	@Override
	public void on() {
		System.out.println("tv1 on");
		
	}

	@Override
	public void off() {
		System.out.println("tv1 off");
		
	}

	@Override
	public void volume() {
		
		System.out.println("tv1 volume");
	}
	
}
public class TV implements Tvremote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tvremote ob=new TV();
ob.off();
ob.on();
ob.volume();
	}
	@Override
	public void on() {
		System.out.println("tv on");
		
	}

	@Override
	public void off() {
		System.out.println("tv off");
		
	}

	@Override
	public void volume() {
		System.out.println("volumeup");
		
	}

}
