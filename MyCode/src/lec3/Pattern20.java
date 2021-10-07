package lec3;
public class Pattern20 {
    public static void main(String[] args) {
        int n = 7;
        int nsp = n/2;
        int nsp1 = -1;
        int row = 1;
        while (row<=n){
            int csp = 1;
            while (csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            System.out.print("* ");
            int csp1 = 1;
            while (csp1<=nsp1){
                System.out.print("  ");
                csp1++;
            }
            if(!(row == 1 || row == n))
                System.out.print("* ");

            //Updation
            System.out.println();
            if(row<=n/2){
                nsp--;
                nsp1 += 2;
            }
            else {
                nsp++;
                nsp1 -= 2;
            }
            row ++;
        }

    }
}
