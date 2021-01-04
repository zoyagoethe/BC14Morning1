package StackMax;

import java.util.ArrayDeque;
import java.util.EmptyStackException;

public class StackMax {

    private ArrayDeque<Integer> source;
    private ArrayDeque<Integer> currentMax;

    public StackMax() {
        source = new ArrayDeque<>();
        currentMax = new ArrayDeque<>();
    }

    public void addLast(int element) {
        if (source.size() == 0) {
            currentMax.addLast(element);
        } else currentMax.addLast(Math.max(getMax(), element));
        source.addLast(element);
    }

    public int getLast() {
        if (source.size() == 0) {
            throw new NullPointerException();
        }
        return source.getLast();
    }

    public int removeLast() {
        if (source.size() == 0) {
            throw new EmptyStackException();
        }
        currentMax.removeLast();
        return source.removeLast();
    }

    public int size() {
        return source.size();
    }

    public int getMax() {
        if (source.size() == 0) {
            throw new EmptyStackException();
        }
        return currentMax.getLast();
    }
}

/*//foreach here over all the elements of the source
        int max = source.getFirst();
        for (Integer element : source) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }*/
