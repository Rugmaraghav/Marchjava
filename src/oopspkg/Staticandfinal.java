package oopspkg;

public class Staticandfinal {

	static int interestrate=6;
	final double limit=1000;
	String name;
	
	
	public static void main(String[] args) {
		Staticandfinal s=new Staticandfinal();
		//s.limit=4000;
		System.out.println(Staticandfinal.interestrate);
		s.name="hari";
		System.out.println(s.name);
		System.out.println(s.limit);
		Staticandfinal s1=new Staticandfinal();
		s1.name="ashi";
		System.out.println(Staticandfinal.interestrate);
		System.out.println(s1.name);
		System.out.println(s1.limit);

	}

}
