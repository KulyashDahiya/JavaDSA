package Lec2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int row = 1;
		int nst = n;
		int nsp = 0;
		while(row <= n)
		{
			//Work
			
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print(" \t");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("*\t");
				cst++;
			}
			
			
			//Update
			System.out.println();
			row++;
			nst--;
			nsp++;
		}


	}

}