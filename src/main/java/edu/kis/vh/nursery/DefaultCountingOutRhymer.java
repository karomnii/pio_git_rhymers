package edu.kis.vh.nursery;

/**
 * The {@code DefaultCountingOutRhymer} class provides a simple implementation of a stack.
 * It allows adding numbers up to a specified limit and provides methods to check if the rhymer is empty or full,
 * peek at the top number, and remove the top number.
 */
public class DefaultCountingOutRhymer {

    /**
     * The maximum number of elements the rhymer can hold.
     */
    public static final int MAX_NUMBERS = 12;

    /**
     * The initial value of the total index.
     */
    public static final int INIT_TOTAL = -1;

    /**
     * The condition indicating that the rhymer is full.
     */
    public static final int IS_FULL_CONDITION = MAX_NUMBERS - 1;

    /**
     * The condition indicating that the rhymer is empty.
     */
    public static final int IS_EMPTY_CONDITION = -1;

    /**
     * The value returned when trying to access an element from an empty rhymer.
     */
    public static final int EMPTY_ARRAY = -1;

    /**
     * The array that holds the numbers in the rhymer.
     */
    private final int[] numbers = new int[MAX_NUMBERS];

    /**
     * The index of the last added number in the rhymer.
     */
    private int total = INIT_TOTAL;

    /**
     * Returns the current total index.
     *
     * @return the total index
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adds a number to the rhymer if it is not full.
     *
     * @param in the number to add
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the rhymer is empty.
     *
     * @return {@code true} if the rhymer is empty, {@code false} otherwise
     */
    public boolean callCheck() {
        return total == IS_EMPTY_CONDITION;
    }

    /**
     * Checks if the rhymer is full.
     *
     * @return {@code true} if the rhymer is full, {@code false} otherwise
     */
    public boolean isFull() {
        return total == IS_FULL_CONDITION;
    }

    /**
     * Returns the last added number without removing it.
     *
     * @return the last added number, or {@link #EMPTY_ARRAY} if the rhymer is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_ARRAY;
        return numbers[total];
    }

    /**
     * Removes and returns the last added number.
     *
     * @return the last added number, or {@link #EMPTY_ARRAY} if the rhymer is empty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_ARRAY;
        return numbers[total--];
    }
}
