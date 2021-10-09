package lec3Assignment;

//Take N (number of rows), print the following pattern (for N = 4).
//
//        1           1
//        1 2       2 1
//        1 2 3   3 2 1
//        1 2 3 4 3 2 1

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int nst = 1;
        int nsp = 2*n-3;
        while (row<=n){
            int cst = 1;
            int cval = 1;
            while (cst<=nst){
                System.out.print(cval + " ");
                cst++;
                cval++;
            }
            int csp = 1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            cst = 1;
            if(row==n){
                cval=row-1;
            }
            else {
                cval = row;
            }
            while (cst<=nst){
                if(!(cst == n)) {
                    System.out.print(cval + " ");
                }
                cst++;
                cval--;
            }
            System.out.println();
            nst++;
            row++;
            nsp -= 2;
        }
    }
}
