package lec6;

public class PascalBySir {
    public static void main(String[] args) {
        pt(6);
    }
    public static void pt(int N){
        for (int n = 0; n < N; n++) {
            int ncr = 1;
            System.out.print(ncr + " ");
            for (int r = 1; r < n; r++) {
                ncr = (n-r+1)*ncr/r;
                System.out.print(ncr + " ");
            }
            System.out.println();
        }
    }
}
