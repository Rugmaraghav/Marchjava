package oopspkg;

interface A
{
	int a=30;
	void method1();
	void methd2();
	
}




public class Interfaceconcept implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfaceconcept ob=new Interfaceconcept();
		ob.method1();
		ob.methd2();
		
		A ob1=new Interfaceconcept();
		ob1.methd2();
		ob1.methd2();

	}

	@Override
 public  void method1() {
		System.out.println(a);
		
	}

	@Override
	public void methd2() {
		System.out.println("method2");
		
	}

}
