
public class Methodpgm {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Methodpgm m=new Methodpgm();
		m.sum();
		int v=m.mul();
		System.out.println(v);
		int d=20,e=30;
		 m.sub(d,e);
		
	}
	
	
	public void sub(int d, int e) {
		// TODO Auto-generated method stub
		int subt;
		subt=d-e;
		System.out.println(subt);
		
	}


	public void sum()
	{
		int a=10,b=20,sum;
		sum=a+b;
	
		System.out.println(sum);
		
	}
	
	public int mul()
	{
		int a=30,b=20,c;
		c=a*b;
		return c;
	}
	
	
	

}
