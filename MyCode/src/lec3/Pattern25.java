package lec3;
public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        int val = 1;
        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print(val++ + " ");
                cst++;
            }

            //Updation
            row++;
            System.out.println();
            nsp--;
            nst +=2;
        }
    }
}
