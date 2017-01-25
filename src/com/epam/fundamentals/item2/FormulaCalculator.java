package com.epam.fundamentals.item2;

/**
 * @author Uladzislau Seuruk.
 */
public class FormulaCalculator {
    /**
     * Solves formula with received arguments.
     *
     * @param a first argument.
     * @param b second argument.
     * @param c third argument.
     * @return result of calculation.
     * @throws Exception if at least one of received arguments or result of calculation has illegal
     * value.
     */
    public double calculate(double a, double b, double c) throws Exception {
        if (isValueIllegal(a) || isValueIllegal(b) || isValueIllegal(c)) {
            throw new Exception("At least one of arguments has illegal value.");
        }
        if (isNumberEqualsToZero(a) || isNumberEqualsToZero(b)) {
            throw new Exception("First and second argument must not be equals to zero.");
        }
        double result = Math.sqrt(b*b + 4*a*c) + b;
        result /= 2*a;
        result -= a*a*a*c;
        result += 1.0/b/b;
        if (isValueIllegal(result)) {
            throw new Exception("Result of calculation is Nan or has infinite value.");
        }
        return result;
    }

    private boolean isNumberEqualsToZero(Double number) {
        return new Double(1.0/number).isInfinite();
    }

    private boolean isValueIllegal(Double value) {
        return value.isInfinite() || value.isNaN();
    }
}