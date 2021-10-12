package lec5;

public class Function {
    public static void main(String[] args) {
        System.out.println("Hello");
        addition();
        substraction();
        System.out.println("Bye");
        System.out.println(additionParam(50,20));
    }
    public static void addition(){
        int a = 20;
        int b = 30;
        int sum = a+b;
        System.out.println(sum);
    }
    public static void substraction(){
        int a = 30;
        int b = 20;
        int diff = a-b;
        System.out.println(diff);
    }
    public static int additionParam(int a,int b){
        int sum = a+b;
        return sum;
    }
}
