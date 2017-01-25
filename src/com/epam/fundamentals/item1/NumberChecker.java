package com.epam.fundamentals.item1;

/**
 * @author Uladzislau Seuruk.
 */
public class NumberChecker {
    /**
     * Checks if sum of first two digits of received number equals to sum of last two.
     *
     * @param number number to check.
     * @return <tt>true</tt> if sum of first two digits of received number equals to sum of last two,
     * <tt>false</tt> otherwise.
     * @throws Exception if received number is not four-digit.
     */
    public boolean check(long number) throws Exception {
        if (number < 1000 || number > 9999) {
            throw new Exception("Received number is not four-digit");
        }
        long firstSum = number/1000 + (number/100)%10;
        long secondSum = (number/10)%10 + number%10;
        return firstSum == secondSum;
    }
}