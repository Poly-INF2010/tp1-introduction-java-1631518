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
        double ecartPoint = 0.5;
        double i = (-width * ecartPoint);
        for (int n = 0; n <= width/ecartPoint; n++) {
            double j = (-height * ecartPoint);
            for (int k = 0; k <= height/ecartPoint; k++) {
                this.add(new Point2d(i, j));
                j+=ecartPoint;
            }
            i+=ecartPoint;
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        this.addAll(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(this.getCoords());
    }
}
