package com.epam.fundamentals.item5;

/**
 * @author Uladzislau Seuruk.
 */
public class PowerCalculator {
    /**
     * Raises received negative numbers to second power and to fourth power all others.
     *
     * @param a first number.
     * @param b second number.
     * @param c third number.
     * @throws Exception if at least one of received values is illegal or result of calculation is
     * out of range of double type..
     */
    public void raiseToPowerAndPrintResult(double a, double b, double c) throws Exception {
        if (isValueIllegal(a) || isValueIllegal(b) || isValueIllegal(c)) {
            throw new Exception("At least one of received values is illegal.");
        }
        raiseToPowerAndPrintResult(a);
        raiseToPowerAndPrintResult(b);
        raiseToPowerAndPrintResult(c);
    }

    private void raiseToPowerAndPrintResult(double number) throws Exception {
        if (number < 0.0) {
            printResultToConsole(number * number);
            return;
        }
        printResultToConsole(Math.pow(number, 4));
    }

    private boolean isValueIllegal(Double value) {
        return value.isInfinite() || value.isNaN();
    }

    private void printResultToConsole(Double result) throws Exception {
        if (isValueIllegal(result)) {
            throw new Exception("Result of calculation is too great for double type.");
        }
        System.out.println(result);
    }
}
