package com.epam.fundamentals.item3;

/**
 * @author Uladzislau Seuruk.
 */
public class RightTriangle {
    /**
     * Length of first cathetus.
     */
    private Double firstCathetus;
    /**
     * Length of second cathetus.
     */
    private Double secondCathetus;

    /**
     * Checks if received values are valid.
     *
     * @param firstCathetus lengths of first cathetus.
     * @param secondCathetus lengths of second cathetus.
     * @throws Exception if lengths of at least one of cathetus has illegal value.
     */
    public RightTriangle(double firstCathetus, double secondCathetus) throws Exception {
        if (isValueIllegal(firstCathetus) || isValueIllegal(secondCathetus)) {
            throw new Exception("Lengths of at least one of cathetus has special double value.");
        }
        if (firstCathetus <= 0 || secondCathetus <= 0) {
            throw new Exception("Length of at least one of cathetus is less or equals to zero.");
        }
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
    }

    /**
     * Returns area of triangle.
     *
     * @throws Exception if result of calculation is out of range of double type.
     */
    public Double getArea() throws Exception {
        Double area = 0.5 * firstCathetus * secondCathetus;
        if (area.isInfinite()) {
            throw new Exception("Area value too great for double type.");
        }
        return area;
    }

    /**
     * Returns perimeter of triangle.
     *
     * @throws Exception if result of calculation is out of range of double type.
     */
    public Double getPerimeter() throws Exception {
        Double perimeter = firstCathetus + secondCathetus
                + calculateHypotenuse(firstCathetus, secondCathetus);
        if (perimeter.isInfinite()) {
            throw new Exception("Perimeter value too great for double type.");
        }
        return perimeter;
    }

    private Double calculateHypotenuse(double firstCathetus, double secondCathetus)
            throws Exception {
        double hypotenuse = Math.sqrt(firstCathetus*firstCathetus + secondCathetus*secondCathetus);
        if (new Double(hypotenuse).isInfinite()) {
            throw new Exception("Length of hypotenuse is too great for double type.");
        }
        return hypotenuse;
    }

    private boolean isValueIllegal(Double value) {
        return value.isInfinite() || value.isNaN();
    }
}