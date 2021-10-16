package lec6;
import java.util.Scanner;
//USING nCr
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        while(row<n){
            int ncr = 1;
            int cst = 0;
            while (cst<=nst){
                if (cst==0 || cst == nst){
                    System.out.print("1\t");
                }
                else {
                    ncr = ((row - cst + 1)*ncr/cst);
                    System.out.print(ncr+ "\t");
                }
                cst++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
