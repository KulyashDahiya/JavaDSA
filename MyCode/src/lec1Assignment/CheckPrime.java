package lec1Assignment;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean flag = true;

        while (i<=(int)Math.sqrt(n)){
            if(n%i==0){
                flag = false;
                break;
            }
            i++;
        }
        if(flag){
            System.out.println("It is Prime");
        }
        else {
            System.out.println("Non Prime");
        }
    }
}
