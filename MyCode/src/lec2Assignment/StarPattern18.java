package lec2Assignment;

public class StarPattern18 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int nst = 1;
        int nsp = n-1;
        while (row<=n){
            int csp = 1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            //Updation
            row++;
            if(row<=n/2+1){
                nst +=2;
                nsp--;
            }
            else {
                nst -=2;
                nsp++;
            }
        }
    }
}
