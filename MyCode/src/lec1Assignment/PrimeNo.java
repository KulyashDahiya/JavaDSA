package lec1Assignment;

import java.util.*;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = 2;

		while (n <= N) {
			boolean flag = true;
			int i=2;
			int x = (int)Math.sqrt(n);
			while(i <= x){
				if (n % i == 0) {
					flag = false;
					break;
				}
				i++;
			}
			if (flag) {
				System.out.println(n);
			}
			n++;
		}
		sc.close();
	}
}
