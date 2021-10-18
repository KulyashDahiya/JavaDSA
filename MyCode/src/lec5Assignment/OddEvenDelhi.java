package lec5Assignment;
import java.util.Scanner;
public class OddEvenDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            boolean flag = checkCar(arr[i]);
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    public static boolean checkCar(int n)
    {
        int a = nof(n);
        int[] brr = new int[a];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = n%10;
            n /= 10;
        }
        int sumo = 0, sume =0;
        for (int i = 0; i < brr.length; i++) {
            if(brr[i]%2==0)
                sume += brr[i];
            else
                sumo += brr[i];
        }
        if(sume%4==0 || sumo%3==0)
            return true;
        else
            return false;
    }

    public static int nof(int n){
        int count = 0;
        while (n!=0){
            n /= 10;
            count++;
        }
        return count;
    }
}
