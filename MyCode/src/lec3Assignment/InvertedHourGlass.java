package lec3Assignment;
//n=5
//        5                   5
//        5 4               4 5
//        5 4 3           3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2 1 0 1 2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3           3 4 5
//        5 4               4 5
//        5                   5

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = 2*n-1;
        int nst = 1;
        int i = 0;
        while(row<=2*n+1){
            int cst = 1;
            int val = n;
            while(cst<=nst){
                System.out.print(val + " ");
                cst++;
                val--;
            }
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            cst = 1;
            val = n-i;
            while(cst<=nst){
                if(!(cst==n+1)) {
                    System.out.print(val + " ");
                }
                cst++;
                val++;
            }
            //Updation
            if(row<n){
                i++;
            }
            else if(row>n+1){
                i--;
            }
            if(row<=n) {
                nst++;
                nsp -= 2;
            }
            else {
                nst--;
                nsp += 2;
            }
            row++;
            System.out.println();
        }
    }
}
