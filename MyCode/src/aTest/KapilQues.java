package aTest;
import java.util.Scanner;
public class KapilQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst1 = n;
        int nst2 = -1;
        while (row <= n) {
            int cst = 1;
            int val = 1;
            while (cst <= nst1) {
                System.out.print(val + " ");
                val++;
                cst++;
            }
            cst = 1;
            while (cst <= nst2) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nst1--;
            nst2 +=2;
            row++;
        }
    }
}
