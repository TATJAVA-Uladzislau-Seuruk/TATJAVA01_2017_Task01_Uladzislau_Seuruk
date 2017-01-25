package com.epam.fundamentals.item4;

/**
 * @author Uladzislau Seuruk.
 */
public class Point {
    /**
     * X coordinate.
     */
    private Double x;
    /**
     * Y coordinate.
     */
    private Double y;

    /**
     * Checks coordinates for invalid values before initializing.
     *
     * @param x x coordinate.
     * @param y y coordinate.
     * @throws Exception if at least one coordinate has invalid value.
     */
    public Point(double x, double y) throws Exception {
        if (isValueIllegal(x) || isValueIllegal(y)) {
            throw new Exception("Invalid coordinate values.");
        }
        this.x = x;
        this.y = y;
    }

    /**
     * Getter.
     */
    public Double getX() {
        return x;
    }

    /**
     * Getter.
     */
    public Double getY() {
        return y;
    }

    private boolean isValueIllegal(Double value) {
        return value.isInfinite() || value.isNaN();
    }
}