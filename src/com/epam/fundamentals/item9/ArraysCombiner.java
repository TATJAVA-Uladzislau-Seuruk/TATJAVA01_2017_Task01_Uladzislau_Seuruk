package com.epam.fundamentals.item9;

/**
 * @author Uladzislau Seuruk.
 */
public class ArraysCombiner {
    /**
     * Inserts second received array into first after requested element.
     *
     * @param firstArray first array.
     * @param secondArray  second array.
     * @param position number of element of first array to insert second array after.
     * @return combined array.
     * @throws Exception if at least one of arrays was not initialized or requested position is less
     * than zero or greater than length of first array.
     */
    public Object[] combine(Object[] firstArray, Object[] secondArray, int position)
            throws Exception {
        if (firstArray == null || secondArray == null) {
            throw new Exception("Arrays must be initialized.");
        }
        if (position < 0 || position >= firstArray.length) {
            throw new Exception("Position of insertion must be greater or equals to zero but less" +
                    " than or equals to first array length.");
        }
        Object[] combinedArray = new Object[firstArray.length + secondArray.length];
        for (int i = 0; i < combinedArray.length; ++i) {
            if (i <= position) {
                combinedArray[i] = firstArray[i];
                continue;
            }
            if (i <= position + secondArray.length) {
                combinedArray[i] = secondArray[i - (position + 1)];
                continue;
            }
            combinedArray[i] = firstArray[i - secondArray.length];
        }
        return combinedArray;
    }
}