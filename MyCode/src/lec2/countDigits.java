package lec2;

public class countDigits {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0 ;
        while(n!=0){
            count++;
            n /=10;
        }
        System.out.println(count);
    }
}
