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
//        double ecartPoint = 0.5;
//        double radiusFactor = 0.5;
//        double removeFactor = 0.375;
//        for (double i = (-widthDiameter * radiusFactor); i <= (widthDiameter * radiusFactor); i += ecartPoint) {
//
//            for (double j = (-heightDiameter * radiusFactor); j <= (heightDiameter * radiusFactor); j += ecartPoint) {
//
//                double ellipseEquationValueAdd = Math.pow(i,2)/Math.pow(widthDiameter*radiusFactor,2)+Math.pow(j,2)/Math.pow(heightDiameter*radiusFactor,2);
//                if (ellipseEquationValueAdd <= 1) {
//
//                    double ellipseEquationValueRemove = Math.pow(i,2)/Math.pow(widthDiameter*removeFactor,2)+Math.pow(j,2)/Math.pow(heightDiameter*removeFactor,2);
//                    if(i <= (widthDiameter * removeFactor) && i > (-widthDiameter * removeFactor) && j <= (heightDiameter * removeFactor) && j > (-heightDiameter * removeFactor) && ellipseEquationValueRemove <= 1 ) {
//                        this.remove(new Point2d(i, j));
//                    }
//                    else {
//                        this.add(new Point2d(i, j));
//
//                    }
//                }
//            }
//        }

        double ecartPoint = 0.5;
        double radiusFactor = 0.5;
        double removeFactor = 0.375;

        double i = (-widthDiameter * radiusFactor);
        for (int n = 0; n <= widthDiameter/ecartPoint; n++) {
            double j = (-heightDiameter * radiusFactor);
            for (int k = 0; k <= heightDiameter/ecartPoint; k++) {
                double ellipseEquationValueAdd = Math.pow(i,2)/Math.pow(widthDiameter*radiusFactor,2)+Math.pow(j,2)/Math.pow(heightDiameter*radiusFactor,2);
                if (ellipseEquationValueAdd <= 1) {
                    double ellipseEquationValueRemove = Math.pow(i,2)/Math.pow(widthDiameter*removeFactor,2)+Math.pow(j,2)/Math.pow(heightDiameter*removeFactor,2);
                    if(i <= (widthDiameter * removeFactor) && i > (-widthDiameter * removeFactor) && j <= (heightDiameter * removeFactor) && j > (-heightDiameter * removeFactor) && ellipseEquationValueRemove <= 1 ) {
                        this.remove(new Point2d(i, j));
                    }
                    else {
                        this.add(new Point2d(i, j));
                    }
                }
                j+=ecartPoint;
            }
            i += ecartPoint;
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

