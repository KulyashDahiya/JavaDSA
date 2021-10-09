package lec4;

public class DecimalToanyBase {
    public static void main(String[] args) {
        int n =5;
        int bn =0;
        int base = 2;
        int multi =1;
        while(n!=0){
            int r = n%base;
            bn += multi*r;
            multi = multi * 10;
            n /=base;
        }
        System.out.println(bn);
    }
}
