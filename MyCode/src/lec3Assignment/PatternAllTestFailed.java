package lec3Assignment;

import java.util.Scanner;

public class PatternAllTestFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1){
            int nst = 1;
            int nsp1 = n;
            int nsp2 = -1;
            int row = 1;
            int i = 1;
            while (row<=n){
                int csp = 1;
                while(csp<=nsp1){
                    System.out.print("  ");
                    csp++;
                }
                int cst = 1;
                int cval;
                if(row<=(n/2)+1){
                    cval = row;
                }
                else{
                    cval = row-i;
                }
                while(cst<=nst){
                    System.out.print(cval + " ");
                    cst++;
                    cval--;
                }
                csp = 1;
                while(csp<=nsp2){
                    System.out.print("  ");
                    csp++;
                }
                cst = 1;
                int cval1 = 1;
                while(cst<=nst){
                    if(!(row==1 || row==n)){
                        System.out.print(cval1 + " ");
                    }
                    cst++;
                    cval1++;
                }
                System.out.println();
                //Updation
                if(row<=n/2){
                    nsp1-=2;
                    nsp2 +=2 ;
                    nst++;
                }
                else{
                    nsp1+=2;
                    nsp2 -= 2;
                    nst--;
                    if(row==n/2+1){
                        i++;
                    }
                    else{
                        i+=2;
                    }
                }
                row++;
            }
        }
    }
}
