package lec5Assignment;

public class InverseOfNumber {
    public static void main(String[] args) {
        System.out.print(inverse(32145));
    }
    public static int inverse(int n){
        int place = 1;
        int inv = 0;
        while(n!=0){
            int rem = n%10;
            inv += place*(int)Math.pow(10, rem-1);
            n /= 10;
            place++;
        }
        return inv;
    }
}
