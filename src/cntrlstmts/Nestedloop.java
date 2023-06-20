package cntrlstmts;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(i + " " +j);//-- 0 0
				                               //-- 0 1
				                               //-- 1 0
				                               // --1 1
				                               //-- 2 0
				                                //    2 1
				                                //    3 0
				                                //    3 1
			}
		}
		

	}

}
