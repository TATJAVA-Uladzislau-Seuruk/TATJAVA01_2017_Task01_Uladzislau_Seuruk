package com.epam.fundamentals;

/**
 * @author Uladzislau Seuruk.
 */
public class Main {
    public static void main(String[] args) {
        try {
            //-- task 1
            /*
            NumberChecker checker = new NumberChecker();
            System.out.println(checker.check(1230));
            */

            //-- task 2
            /*
            FormulaCalculator calculator = new FormulaCalculator();
            System.out.println(calculator.calculate(1.0, 1.0, 0.0));
            */

            //-- task 3
            /*
            RightTriangle triangle = new RightTriangle(4e2, 3e2);
            System.out.println(triangle.getArea());
            System.out.println(triangle.getPerimeter());
            */

            //-- task 4
            /*
            Point point = new Point(-4.0, -3.0);
            PointAnalyzer analyzer = new PointAnalyzer();
            System.out.println(analyzer.isPointBelongsToRegion(point));
            */

            //-- task 5
            /*
            PowerCalculator calculator = new PowerCalculator();
            calculator.raiseToPowerAndPrintResult(-1.0, 2.0, -5.0);
            */

            //-- task 6
            /*
            Calculator calculator = new Calculator();
            System.out.println(calculator.sumMinAndMax(-2.0, -3.0, -1.5));
            */

            //-- task 7
            /*
            FunctionSolver solver = new FunctionSolver();
            solver.solveAndPrintResult(1.1, 1, 1.0);
            */

            //-- task 8
            /*
            Summarizer summarizer = new Summarizer();
            System.out.println(summarizer.summarizeMultiples(new long[] {1, 5, 4, 4, 2}, 3));
            */

            //-- task 9
            /*
            ArraysCombiner combiner = new ArraysCombiner();
            Object[] array = combiner.combine(new Integer[] {1, 2, 3}, new Integer[] {4, 5}, 0);
            for (Object element : array) {
                System.out.println(element);
            }
            */

            //-- task 10
            /*
            MatrixGenerator generator = new MatrixGenerator();
            int[][] array = generator.generate(4);
            for (int[] innerArray : array) {
                for (int element : innerArray) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            */
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}