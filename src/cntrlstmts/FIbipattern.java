package cntrlstmts;

public class FIbipattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,s;
		for( i=0;i<5;i++)
		{
			for( j=1;j<=i;j++)
			{
				
			//System.out.println(n1);
			s=i+j;
			i=j;
			j=s;
			System.out.print(i+j);
			
		}
			System.out.println();

	}

}
}
