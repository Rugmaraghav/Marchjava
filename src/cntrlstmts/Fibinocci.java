package cntrlstmts;

public class Fibinocci {

	public static void main(String[] args) {
		
	//	0 1 1 2 3 5 8 
		int n1=0,n2=1,s;
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(n1); //0  //1 //1 //2
			s=n1+n2; //1   //2  //3
			n1=n2; // 1   // 1  //2
			n2=s; //1     //2   //3
		}
		
		
		
	}	
		

}
