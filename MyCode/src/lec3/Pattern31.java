package lec3;
//Watch video and learn
public class Pattern31 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;
        int val = n;
        while (row<=n){
            int cst = 1;
            while (cst<=nst){
                if(row+cst==n+1)
                    System.out.print("* ");
                else
                    System.out.print(val + " ");
                val--;
                cst++;
            }
            //Updation
            row++;
            val = n;
            System.out.println();
        }
    }
}
