package lec2Assignment;
//Use Another Method
public class StarPattern22 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int nsp = 0;
        int row = 1;
        while (row<=n){
            int cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            int csp = 1;
            while(csp<=nsp){
                if(row == 1 && csp == 0){
                    break;
                }
                System.out.print("  ");
                csp++;
            }
            cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                if(row == 1 && cst == n-1) {
                    break;
                }
                cst++;
            }
            System.out.println();
            nst--;
            if(row==1){
                nsp++;
            }
            else {
                nsp += 2;
            }
            row++;
        }
    }
}
