package lec3;

public class FibonacciPattern {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int val = 0;
        int val1 = 1, val2 = 0;
        int row = 1;
        while (row<=n){
            int cst = 1;
            while (cst<=nst){
                System.out.print(val+ " ");
                val2 = val + val1;
                val = val1;
                val1 = val2;
                cst++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}
