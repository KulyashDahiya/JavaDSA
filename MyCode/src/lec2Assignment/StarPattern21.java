package lec2Assignment;
//USE ANOTHER METHOD
public class StarPattern21 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        int nsp = 2*n-3;
        while (row<=n){
            int cst = 1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            int csp = 1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            cst = 1;
            while (cst<=nst){
                System.out.print("* ");
                if(row==n && cst==n-1){
                    break;
                }
                cst++;
            }
            System.out.println();
            nst++;
            row++;
            nsp -= 2;
        }
    }
}
