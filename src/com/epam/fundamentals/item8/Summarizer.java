package com.epam.fundamentals.item8;

/**
 * @author Uladzislau Seuruk.
 */
public class Summarizer {
    /**
     * Summarizes numbers from received array that are multiples of received divider.
     *
     * @param numbers array with numbers.
     * @param divider divider for numbers.
     * @return sum of numbers that multiples of received divider.
     * @throws Exception if array was not initialized or at least one of received numbers is not
     * natural or result of calculation
     * becomes too great for long type.
     */
    public long summarizeMultiples(long[] numbers, long divider) throws Exception {
        if (numbers == null) {
            throw new Exception("Array must be initialized.");
        }
        if (divider <= 0) {
            throw new Exception("Divider must be natural.");
        }
        long sum = 0;
        for (long value : numbers) {
            if (value <= 0) {
                throw new Exception("Numbers must be natural.");
            }
            if (value % divider == 0) {
                sum += value;
                if (sum <= 0) {
                    throw new Exception("Result of calculation becomes too great for long type.");
                }
            }
        }
        return sum;
    }
}