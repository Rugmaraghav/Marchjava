package oopspkg;

class RBI
{
	double interest_rate=8.5;
	double interest;
	double amount=500000;
	int year=5;
	public void bank_name()
	{
		System.out.println("RBI");	
	}
	public void interest()
	{
	
	interest=(amount*year*(interest_rate/100));
	System.out.println("RBI interest for 5 yesr is :"+interest);
	}
	public void display()
	{
		System.out.println("RBI have very less interest rate for loan amount");
	}
}
class SBI extends RBI
{
	public void bank_name()
	{
		System.out.println("SBI BANK");
	}
	public void interest()
	{
	double interest_rate=9.5;
	double interest;
	double amount=1000000;
	int year=5;
	interest=(amount*year*(interest_rate/100));
	System.out.println("SBI bank interest for 5 year is :"+interest);
}
	public void show()
	{
		System.out.println("SBI have very less interest rate for housing loan ");
	}
}
class Union_Bank extends RBI
{
	public void bank_name()
	{
		System.out.println("UNION BANK OF INDIA");
	}
	public void interest()
	{
	double interest_rate=10;
	double interest;
	double amount=7500000;
	int year=5;
	interest=(amount*year*(interest_rate/100));
	System.out.println("Union_Bank  interest for 5 year is :"+interest);
}
	public void list()
	{
		System.out.println("Union_Bank have very less interest rate for vehicle loan ");
	}
}





public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Union_Bank uc=new Union_Bank();
				uc.bank_name();
				uc.interest();
				uc.list();
				SBI sbi=new SBI();
				sbi.bank_name();
				sbi.interest();
				sbi.show();
				RBI rb= new RBI();
				rb.bank_name();
				rb.interest();
				rb.display();
				//uc.display();
				
				
				
			}
			


	

}
