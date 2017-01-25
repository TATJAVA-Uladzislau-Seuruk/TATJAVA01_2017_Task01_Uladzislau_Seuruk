package com.epam.fundamentals.item4;

/**
 * @author Uladzislau Seuruk.
 */
public class PointAnalyzer {
    //TODO: think up how to get rid of "magic numbers".
    /**
     * Checks if point belongs to specified region.
     *
     * @param point <tt>Point</tt> to check.
     * @return <tt>true</tt> if point belongs to specified region, <tt>false</tt> otherwise.
     * @throws Exception if received <tt>Point</tt> was not initialized.
     */
    public boolean isPointBelongsToRegion(Point point) throws Exception {
        if (point == null) {
            throw new Exception("Point must be initialized.");
        }
        if (Math.abs(point.getX()) - 4 > 0) {
            return false;
        }
        if (Math.abs(point.getX()) - 2 <= 0) {
            if (point.getY() > 4 || point.getY() < -3) {
                return false;
            }
        } else {
            if (point.getY() < -3 || point.getY() > 0) {
                return false;
            }
        }
        return true;
    }
}