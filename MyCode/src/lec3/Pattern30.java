package lec3;

public class Pattern30 {
    public static void main(String[] args) {
        int n=5;
        int val = n;
        for(int i=0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(val + " ");
                val--;
            }
            System.out.println();
            val = n;
        }
    }
}
