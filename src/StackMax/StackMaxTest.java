package StackMax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackMaxTest {
    StackMax stackMax = new StackMax();

    @Test
    void addLast_getMax() {
        stackMax.addLast(3);
        stackMax.addLast(33);
        stackMax.addLast(333);
        stackMax.addLast(3);
        stackMax.addLast(32);
        stackMax.addLast(444);
        stackMax.addLast(432);
        stackMax.addLast(456);
        stackMax.removeLast();
        assertEquals(444, stackMax.getMax());
    }
}