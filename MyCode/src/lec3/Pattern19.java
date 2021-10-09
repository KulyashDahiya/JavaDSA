package lec3;

import java.util.Scanner;

//Do it
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(!(n<10 && n>0 && n%2==1)){
            return;
        }
        int row = 1;
        int nst = (n+1)/2;
        int nst1 = (n+1)/2;
        int nsp = -1;
        while (row<=n){
            int cst = 1;
            while (cst<=nst){
                System.out.print("*\t");
                cst++;
            }
            int csp = 1;
            while (csp<=nsp){
                System.out.print("\t");
                csp++;
            }
            cst = 1;
            while (cst<=nst1){
                if(!((row==1 || row==n) && (cst==nst))) {
                    System.out.print("*\t");
                }
                cst++;
                }
            System.out.println();
            //Updation
            if(row<=n/2){
                nst1--;
                nst--;
                nsp +=2;
            }
            else {
                nst1++;
                nst++;
                nsp -=2;
            }
            row++;
        }

    }
}
