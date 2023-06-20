package oopspkg;
class Bike{  
	  void run(){System.out.println("running");}  
	}  
public class Splendor extends Bike{
	
		
		  void run()
		  {
			  System.out.println("running safely with 60km");
		  }  
		  
		  public static void main(String args[]){  
		    Bike b = new Splendor();//upcasting  
		    b.run();  
		    
		    Bike b1 = new Bike();
		    b1.run();
		    Splendor b2=new Splendor();
		    b2.run();
		  }  

}
