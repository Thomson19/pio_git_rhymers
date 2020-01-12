package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int NUMBERS_COUNT = 12;
    private static final int EMPTY_BUFFER = -1;
    private static final int START_INDEX = -1;

    private final int[] numbers = new int[NUMBERS_COUNT];

    final public int getTotal() {
        return total;
    }

    private int total = START_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == START_INDEX;
    }

    public boolean isFull() {
        return total == NUMBERS_COUNT - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_BUFFER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_BUFFER;
        return numbers[total--];
    }

}
