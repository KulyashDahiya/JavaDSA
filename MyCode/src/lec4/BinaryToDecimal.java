package lec4;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n =101;
        int dn =0;
        int multi =1;
        while(n!=0){
            int r = n%10;
            dn += multi*r;
            multi = multi * 2;
            n /= 10;
        }
        System.out.println(dn);
    }
}
