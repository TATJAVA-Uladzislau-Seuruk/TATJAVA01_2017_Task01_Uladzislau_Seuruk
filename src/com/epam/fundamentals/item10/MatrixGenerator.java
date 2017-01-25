package com.epam.fundamentals.item10;

/**
 * @author Uladzislau Seuruk.
 */
public class MatrixGenerator {
    /**
     * Generates matrix of requested order by specified rule.
     *
     * @param order order of matrix.
     * @return square matrix of requested order.
     * @throws Exception if order of matrix is not positive or even number.
     */
    public int[][] generate(int order) throws Exception {
        if (order <= 0) {
            throw new Exception("Order of matrix must be positive.");
        }
        if (order % 2 != 0) {
            throw new Exception("Order of matrix must be even.");
        }
        int[][] matrix = new int[order][order];
        for (int i = 0; i < order; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < order; ++j) {
                    matrix[i][j] = j + 1;
                }
                continue;
            }
            for (int j = 0; j < order; ++j) {
                matrix[i][j] = order - j;
            }
        }
        return matrix;
    }
}