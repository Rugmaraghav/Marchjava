package oopspkg;

import java.util.Scanner;

interface bank
{
	public void show(String name);
	public void withdraw();
	public void deposit();
	public void bankbalance();
	
}
class Sbi implements bank
{
	final String bankname="sbi";
	int accountno;
	int balance=1000;
	Scanner sc=new Scanner(System.in);
	@Override
	public void show(String name) {
		System.out.println("Bank name"+bankname);
		System.out.println("enter your acountno=");
		accountno=sc.nextInt();
		System.out.println("your account is: " +accountno + "your name is "+name);
		
	}
	
	@Override
	public void withdraw() {
		System.out.println("withdrawal amount:");
		int withdrawlamount=sc.nextInt();
		balance=balance-withdrawlamount;
		System.out.println("balance is: "+balance);
	}

	@Override
	public void deposit() {
		System.out.println("deposit amount= ");
		int depositamount=sc.nextInt();
	 	balance=balance+depositamount;
	   System.out.println("Your balance = "+balance);
	   
	   
		
	}

	@Override
	public void bankbalance() {
		System.out.println("your balance is"+balance);
		
	}
		
}
 
public class Bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Sbi s=new Sbi();
  s.show("ashi");
  s.bankbalance();
  s.deposit();
  s.withdraw();
  
	}

}
