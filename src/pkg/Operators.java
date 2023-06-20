package pkg;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//airthmatic operators
		int a=40,b=20;
		
//		System.out.println("a+b =" + (a+b));
//		System.out.println("a-b =" + (a-b));
//		System.out.println("a*b =" + (a*b));
//		System.out.println("a/b =" + (a/b));//-quotient
//		System.out.println("a%b =" + (a%b));//reminder
		
		//assignment operators
		
	    // a=b;
	     System.out.println("value of a "+a);//20
	     //a+=b; //a=a+b
	     System.out.println(a+=b);//a=a+b -50
	     System.out.println(a-=b);//a=a-b -50-30=20
	     System.out.println(a*=b);//a=a*b -30*20=600
	     System.out.println(a/=b);//a=a/b -600/30=20
	     System.out.println(a%=b);//a=a%b -20
	     
	    //unary operator
	     
	     //postfix and prefix
//	     ++-increment by 1
//	     --  decrement by 1
	     
	    int p=20;
	    System.out.println(p++);//20
	    System.out.println(p);//21
	     
	     //prefix
	    System.out.println(++p);//22
	    
	    //relational operator-o/p always true or false
	    String s="abc";
	    int age=23;
	    
	    System.out.println(s=="fgg");//false
	    System.out.println(s!="abC");
	    System.out.println(age<18);
	    System.out.println(age>18);
	    System.out.println(age<=18);
	    System.out.println(age>=18);
	    
	     
	  //logical operator
	    
	    String username="abcd";
	    String password="123";
	    System.out.println(username=="abcd" && password=="123");//checks 2 conditions both are true then return true
	    System.out.println(username=="abcd" && password=="123" || age<18);//true||false then it will return true
	                            //true          //true             //false\
	     
	     
	     
   
		
		
		//&&,|| 
		
		//unary operator
//		postfix
/*System.out.println(a++);
System.out.println(a);
//prefix
System.out.println(++a);*/
		

	}

}
