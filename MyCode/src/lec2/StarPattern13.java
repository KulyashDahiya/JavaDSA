package lec2;

public class StarPattern13 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        while(row<=2*n-1){
            int cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            //Updation
            if(row<=n-1)
                nst++;
            else
                nst--;
            row++;
            System.out.println();
        }
    }
}
