package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        width = width;
        height = height;
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {

    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        coords = coords;
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(this.getCoords());
    }
}
