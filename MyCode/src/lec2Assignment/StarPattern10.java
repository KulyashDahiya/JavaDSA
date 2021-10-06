package lec2Assignment;

import java.util.Scanner;

public class StarPattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 2*n - 1;
        int nsp = 1;

        while(row<=n){
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            //Updation
            row++;
            System.out.println();
            nst -=2;
            nsp++;
        }

    }
}
