package lec4;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n =5;
        int bn =0;
        int multi =1;
        while(n!=0){
            int r = n%2;
            bn += multi*r;
            multi = multi * 10;
            n /= 2;
        }
        System.out.println(bn);
    }

}
