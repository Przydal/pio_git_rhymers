package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TABLE_SIZE = 12;
	private static final int TOTAL_NUMBER = -1;
	private static final int NEGATIVE_VALUE = -1;
	private static final int FULL_NUMBER = 11;
	private final int[] numbers = new int[TABLE_SIZE];
	private int total = TOTAL_NUMBER;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_NUMBER;
	}

	public boolean isFull() {
		return total == FULL_NUMBER;
	}

	protected int peekaboo() {
		if (callCheck())
			return NEGATIVE_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return NEGATIVE_VALUE;
		return numbers[total--];
	}

}
