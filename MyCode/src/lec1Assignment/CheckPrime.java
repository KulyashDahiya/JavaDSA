package lec1Assignment;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<=(int)Math.sqrt(N); i++){
            if(N%i==0){
                System.out.println("Non Prime");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime");
        }
    }
}
