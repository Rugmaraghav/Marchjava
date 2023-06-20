package oopspkg;


 class B1{
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	private String stname;
	private String  sal;
	
	
}

public class Encap {
	

	public static void main(String[] args) {
		
		B1 ob=new B1();
		ob.setStname("arun");
		System.out.println(ob.getStname());
		
		
		

	}

}
