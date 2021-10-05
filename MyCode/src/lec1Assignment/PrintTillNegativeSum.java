package lec1Assignment;

import java.util.Scanner;

public class PrintTillNegativeSum {
    public static void main(String[] args) {
        //Print till the sum becomes negative
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt;
        int[] arr = new int[5];
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0; i<5; i++){
            sum += arr[i];

            if(sum>=0){
                System.out.println(arr[i]);
            }
            else{
                break;
            }
        }
    }
}
