package StackMax;

public class Main {
    public static void main(String[] args) {
        StackMax stackMax = new StackMax();

        stackMax.addLast(3);
        stackMax.addLast(33);
        stackMax.addLast(333);
        stackMax.addLast(3);
        stackMax.addLast(32);
        stackMax.addLast(444);
        stackMax.addLast(432);
        stackMax.addLast(456);
        stackMax.removeLast();

        System.out.println(stackMax.getMax());

    }
}
