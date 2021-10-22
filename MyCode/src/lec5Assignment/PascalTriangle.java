package lec5Assignment;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n;
        int nst = 1;
        while (row<=n)
        {
            int csp = 1;
            while (csp<=nsp)
            {
                System.out.print(" ");
                csp++;
            }
            int cst = 2;
            int ncr = 1;
            System.out.print(ncr + " ");
            while (cst<=nst){
                ncr = (ncr * ((row-1)-(cst-1)+1))/(cst-1);
                System.out.print(ncr + " ");
                cst++;
            }
            System.out.println();
            nsp--;
            nst++;
            row++;
        }
    }
}
