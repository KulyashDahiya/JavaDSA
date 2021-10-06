package lec2Assignment;

import java.util.Scanner;

public class StarPattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        int row = 1;
        while(row<=n){
            int csp = 1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst<=nst){
                if(cst%2==0)
                    System.out.print("! ");
                else
                    System.out.print("* ");

                cst++;
            }
            //Updation
            System.out.println();
            row++;
            nst +=2;
            nsp--;
        }
    }
}
