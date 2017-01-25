package com.epam.fundamentals.item7;

/**
 * @author Uladzislau Seuruk.
 */
public class FunctionSolver {
    /**
     * Calculates function values at interval and prints them as table.
     *
     * @param lowerBound lower bound of interval.
     * @param upperBound upper bound of interval.
     * @param step step of calculation.
     * @throws Exception if lower bound greater than upper or step is not positive.
     */
    public void solveAndPrintResult(double lowerBound, double upperBound, double step)
            throws Exception {
        if (lowerBound > upperBound) {
            throw new Exception("Lower bound can't be greater than upper.");
        }
        if (isNumberEqualsToZero(step) || step < 0.0) {
            throw new Exception("Step must be greater than zero.");
        }
        Double[][] result = solve(lowerBound, upperBound, step);
        printResultsToConsole(result);
    }

    private boolean isNumberEqualsToZero(Double number) {
        return new Double(1.0/number).isInfinite();
    }

    private void printResultsToConsole(Double[][] values) {
        System.out.println("    x    |   F(x)  ");
        System.out.println("_________|_________");
        for (Double[] line : values) {
            System.out.format("%9f|%9f%n", line[0], line[1]);
        }
    }

    private Double[][] solve(Double lowerBound, Double upperBound, Double step) {
        int count = (int)((upperBound - lowerBound) / step);
        Double[][] result = new Double[count + 1][2];
        for (int i = 0; i < count + 1; ++i) {
            double x = lowerBound + i*step;
            result[i][0] = x;
            result[i][1] = Math.sin(x) * Math.sin(x) - Math.cos(2*x);
        }
        return result;
    }
}