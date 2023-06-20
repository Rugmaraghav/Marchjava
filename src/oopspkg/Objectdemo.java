package oopspkg;

import cntrlstmts.Arraypgm;
import pkg.A1;

class Employee{
	int empid;
	String empname;
	int empsalary;
//	Employee(int id,String name,int sal)
//	{
//	empid=id;
//	empname=name;
//	empsalary=sal;
//		
//	}
	void setvalues(int empid,String name,int sal)
	{
	this.empid=empid;
	empname=name;
	empsalary=sal;
	
	}
	
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
	}
	
}




public class Objectdemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.setvalues(102,"ammu",40000);
		e.display();
		
		
		
	
		
		//Employee e=new Employee(101,"ashi",40000);
		//e.display();
		
//		e.empid=100;
//		e.empname="arun";
//		e.empsalary=50000;
//		e.display();
//		Employee e1=new Employee();
//		e.empid=101;
//		e.empname="arushi";
//		e.empsalary=50000;
//		e.display();
		
		
		
		

	}

}
