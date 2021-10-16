package lec6;
import lec5.ArmstrongNo;
public class RotateK {
    public static void main(String[] args) {
        System.out.println(rotate(12345, -2));
    }
    public static int rotate(int n, int k){
        int num = n;
        int nod = ArmstrongNo.nod(n);
        //+1 rotation
        k %= nod;
        if(k<0)
        {
            k += nod;
        }
        for (int i = 1; i < k; i++) {
            int rem = num%10;
            num = rem* (int)Math.pow(10, nod-1) + num/10;
        }

        return num;
    }
}
