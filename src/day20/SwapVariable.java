package day20;

public class SwapVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
