package lec3;
//Do again on your own
public class Pattern28 {
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
            int cval = val;
            while (cst <= nst) {
                System.out.print(cval + " ");
                if(cst<=nst/2)
                    cval++;
                else
                    cval--;
                cst++;
            }

            //Updation
            row++;
            val++;
            System.out.println();
            nsp--;
            nst +=2;
        }
    }
}
