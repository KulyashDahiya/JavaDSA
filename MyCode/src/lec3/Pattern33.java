package lec3;
//Do again on your own
public class Pattern33 {
    public static void main(String[] args) {
        int n = 10;
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        int val = n;
        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            int cval = val;
            while (cst <= nst) {
                if(cval == n){
                    System.out.print("0 ");
                }
                else {
                    System.out.print(cval + " ");
                }
                if(cst<=nst/2)
                    cval++;
                else
                    cval--;
                cst++;
            }

            //Updation
            row++;
            val--;
            System.out.println();
            nsp--;
            nst +=2;
        }
    }
}
