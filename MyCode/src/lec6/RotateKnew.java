package lec6;
import lec5.ArmstrongNo;

public class RotateKnew {
    public static void main(String[] args) {
        System.out.println(rotate1(12345, -2));
    }
    public static int rotate1(int n, int k) {
        int num = n;
        int nod = ArmstrongNo.nod(n);
        //+1 rotation
        k %= nod;
        if (k < 0) {
            k += nod;
        }
        int r = n % (int)Math.pow(10,k);
        int q = n / (int)Math.pow(10,k);
        return r* (int)Math.pow(10, nod-k)+q;
    }
}
