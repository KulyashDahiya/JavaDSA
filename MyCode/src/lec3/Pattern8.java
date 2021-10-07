package lec3;
//Watch video and learn
public class Pattern8 {
    public static void main(String[] args) {
        int n = 7;
        int nst = n;
        int row = 1;
        while (row<=n){
            int cst = 1;
            while (cst<=nst){
                if(row==cst  || row+cst==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                cst++;
            }
            //Updation
            row++;
            System.out.println();
        }
    }
}
