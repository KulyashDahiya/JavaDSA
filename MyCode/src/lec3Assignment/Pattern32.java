package lec3Assignment;

public class Pattern32 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=1;
        int val=1;
        while (row<=2*n-1){
            //work
            int cst=1;
            val = row;
            while (cst<=nst){
                if (cst%2==0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(val + "  ");
                }
                cst++;
            }

            //update
            if (row<=n-1){
                nst+=2;
            }
            else {
                nst-=2;
            }
            row++;
            System.out.println();
            val++;
        }
    }
}
