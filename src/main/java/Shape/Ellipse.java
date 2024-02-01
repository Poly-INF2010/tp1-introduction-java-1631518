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
        double ellipseEquationValue=0;
        for (double i = -widthDiameter/2; i <= widthDiameter/2; i+=.5) {
            for (double j = -heightDiameter/2; j <= heightDiameter/2; j+=.5){
                ellipseEquationValue=Math.pow(i,2)/Math.pow(widthDiameter/2,2)+Math.pow(j,2)/Math.pow(heightDiameter/2,2);
                if (ellipseEquationValue<=1) {
                    this.add(new Point2d(i, j));
                }
            }
        }
        for (double i = -widthDiameter*3/8; i <= widthDiameter*3/8; i+=.5) {
            for (double j = -heightDiameter*3/8; j <= heightDiameter*3/8; j+=.5){
                ellipseEquationValue=Math.pow(i,2)/Math.pow(widthDiameter*3/8,2)+Math.pow(j,2)/Math.pow(heightDiameter*3/8,2);
                if (ellipseEquationValue<=1) {
                    this.remove(new Point2d(i, j));
                }
            }
        // double ecartPoint = 0.5;
        // double radiusFactor = 0.5;
        // double removeFactor = 0.375;
        // for (double i = (-widthDiameter * radiusFactor); i <= (widthDiameter * radiusFactor); i += ecartPoint) {
        //     for (double j = (-heightDiameter * radiusFactor); j <= (heightDiameter * radiusFactor); j += ecartPoint) {
        //         double ellipseEquationValue = Math.pow(i, 2) / Math.pow(widthDiameter, 2) + Math.pow(j, 2) / Math.pow(heightDiameter, 2);
        //         if (ellipseEquationValue <= 1) {
        //             if(i <= (widthDiameter * removeFactor) && i > (-widthDiameter * removeFactor) && j <= (heightDiameter * removeFactor) && j > (-heightDiameter * removeFactor) ) {
        //                 this.remove(new Point2d(i, j));
        //             }
        //             else {
        //                 this.add(new Point2d(i, j));
        //             }
        //         }
        //     }
        // }
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

