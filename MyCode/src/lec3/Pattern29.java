package lec3;
//Do again on your own
public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        int val = 1;
        int cval = 0;
        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                if(cst ==1 || cst == nst){
                    System.out.print(val + " ");
                }
                else
                    System.out.print(cval + " ");

                cst++;
            }

            //Updation
            row++;
            val = row;
            System.out.println();
            nsp--;
            nst +=2;
        }
    }
}
