package lec2;

public class StarPattern77 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = n;
        while(row<=n){
            int cst = 1;
            while(cst<=nst){
                if(row == 1 || row == n || cst == 1 || cst == nst) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                cst++;
            }
            //Updation
            row++;
            System.out.println();
        }
    }
}
