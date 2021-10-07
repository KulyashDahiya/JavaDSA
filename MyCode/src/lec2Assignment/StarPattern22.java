package lec2Assignment;

public class StarPattern22 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int nsp = -1;
        int row = 1;
        while (row<=n){
            int cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            cst = 1;
            while(cst<=nst){
                if(!(cst == n)){
                    System.out.print("* ");
                }
                cst++;
            }
            System.out.println();
            nst--;
            nsp += 2;
            row++;
        }
    }
}
