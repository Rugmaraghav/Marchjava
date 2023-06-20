package oopspkg;

class employee
{
	private String name;
	private int sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}



public class Encapsulationpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 employee e=new employee();
// e.name="arun";
// e.sal=10000;
 e.setName("ashi");
 System.out.println("name is "+ e.getName());
 e.setSal(10000);
 System.out.println("salary is "+e.getSal());
		
		
	}

}
