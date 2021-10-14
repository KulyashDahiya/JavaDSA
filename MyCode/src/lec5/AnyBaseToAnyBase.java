package lec5;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        System.out.println(anyToany(5,10,2));
    }
    public static int anyToany(int n, int base1, int base2){
        int dn = anyToDecimal(n, base1);
        return DecimalToAny(dn, base2);

    }
    public static int DecimalToAny(int n, int base){
        int dn =0;
        int multi =1;
        while(n!=0){
            int r = n%base;
            dn += multi*r;
            multi = multi * 10;
            n /=base;
        }
        return dn;
    }
    public static int anyToDecimal(int n, int base){
        int bn =0;
        int multi =1;
        while(n!=0){
            int r = n%10;
            bn += multi*r;
            multi = multi * base;
            n /=10;
        }
        return bn;
    }
}
