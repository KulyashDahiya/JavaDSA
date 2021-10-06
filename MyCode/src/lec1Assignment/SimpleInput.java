package lec1Assignment;

import java.util.*;

public class SimpleInput {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
//        int n=0;
//        while (sum>=0){
//            list.add(sc.nextInt());
//            sum = sum + list.get(n);
//            if(sum>=0){
//                System.out.println(list.get(n));
//            }
//            n++;
         while(sum>=0){
             int n = sc.nextInt();
             sum += n;
            if(sum>=0) {
                System.out.println(n);
            }
        }
    }
}
