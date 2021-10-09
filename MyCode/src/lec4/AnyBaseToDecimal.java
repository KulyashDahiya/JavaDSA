package lec4;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int n =101;
        int base = 2;
        int bn =0;
        int multi =1;
        while(n!=0){
            int r = n%10;
            bn += multi*r;
            multi = multi * base;
            n /=10;
        }
        System.out.println(bn);
    }

}
