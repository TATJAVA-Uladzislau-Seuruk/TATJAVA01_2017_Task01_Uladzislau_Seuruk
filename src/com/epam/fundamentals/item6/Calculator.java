package com.epam.fundamentals.item6;

/**
 * @author Uladzislau Seuruk.
 */
public class Calculator {
    /**
     * Sums numbers with minimum and maximum values.
     *
     * @param a first number.
     * @param b second number.
     * @param c third number.
     * @return sum of min and max values.
     * @throws Exception if at least one of received arguments has illegal value or result of
     * calculation is out of range of double type.
     */
    public Double sumMinAndMax(double a, double b, double c) throws Exception {
        if (isIllegalValue(a) || isIllegalValue(b) || isIllegalValue(c)) {
            throw new Exception("At least one of arguments has illegal value.");
        }
        Double min = findMin(a, b, c);
        Double max = findMax(a, b, c);
        Double sum = min + max;
        if (isIllegalValue(sum)) {
            throw new Exception("Result of calculation is too great for double type.");
        }
        return sum;
    }

    private Double findMax(double a, double b, double c) {
        if (a < b) {
            if (b < c) {
                return c;
            }
            return b;
        }
        if (a < c) {
            return c;
        }
        return a;
    }

    private Double findMin(double a, double b, double c) {
        if (a < b) {
            if (a < c) {
                return a;
            }
            return c;
        }
        if (b < c) {
            return b;
        }
        return c;
    }

    private boolean isIllegalValue(Double number) {
        return number.isInfinite() || number.isNaN();
    }
}