package lec6;
import java.util.Scanner;
public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n;
        for(int i = 1; i <=n; i++)
        {
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int ncr = 1;
            System.out.print(ncr + " ");
            for (int r = 2; r <=i ; r++) {
                ncr = (ncr * ((i-1)-(r-1)+1))/(r-1);
                System.out.print(ncr + " ");
            }
            System.out.println();
            nsp--;
        }
    }
}
