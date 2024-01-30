package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
//        double j=0;
//        for (double i = -widthDiameter/2; i < widthDiameter/2; i+=.5) {
//            j=Math.sqrt((1-Math.pow(i,2)/Math.pow(widthDiameter,2))*Math.pow(heightDiameter,2));
//            this.add(new Point2d(i, j));
//        }
//        for (double i = -widthDiameter/2; i < widthDiameter/2; i+=.5) {
//            j=-Math.sqrt((1-Math.pow(i,2)/Math.pow(widthDiameter,2))*Math.pow(heightDiameter,2));
//            this.add(new Point2d(i, j));
//        }

        double widthSquared = Math.pow(widthDiameter, 2);
        double heightSquared = Math.pow(heightDiameter, 2);

        for (double i = -widthDiameter/2; i < widthDiameter/2; i+=0.5) {

            double iSquared = Math.pow(i, 2);
            double denominator = widthSquared - iSquared;

            double jPositive = Math.sqrt(heightSquared * (1 - iSquared/denominator));
            double jNegative = -jPositive;

            this.add(new Point2d(i, jPositive));
            this.add(new Point2d(i, jNegative));

        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        this.addAll(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(this.getCoords());
    }
}
