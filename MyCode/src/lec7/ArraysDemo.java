package lec7;
public class ArraysDemo {
    public static void main(String[] args) {
        int a = 5;
        int[] arr = null;
        arr = new int[a];
        System.out.println(arr);
        arr[0] =10;
        arr[1] =20;
        arr[2] =30;
        arr[3] =40;
        arr[4] =50;
        System.out.println(arr.length);

        for(int val: arr){
            System.out.print(val + " ");
        }  //Works only in standard calling
        System.out.println();

        int[] brr = arr;  //No new array is created, it just references the arr

        brr[0] = 100;
        System.out.println(brr[0]);

        brr = arr; //garbage collection will remove this

        System.gc(); // Manually calling
        int[] crr = {1,2,3,4,5,6};
        int[] drr;
        drr = new int[] {2,3,4,5};

    }
}
