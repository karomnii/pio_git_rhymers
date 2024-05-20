package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int minusOne = -1;
    public static final int eleven = 11;
    private int[] NUMBERS = new int[12];
    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == minusOne;
    }

    public boolean isFull() {
        return total == eleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return minusOne;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return minusOne;
        return NUMBERS[total--];
    }


}
