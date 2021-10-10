package lec4;

public class datatypeDemo {
    public static void main(String[] args) {
        byte b = (byte) 670;
        short s = 10;
        int i = 10;
        long l = 10;

        b = (byte) s;
        b = (byte) i;
        b = (byte) l;

        s = b;
        System.out.println(b);
        System.out.println(10+20+"Hello"+10+20);
        System.out.println(2+'\t'+3);
        System.out.println(2+"\t"+3);
    }
}
