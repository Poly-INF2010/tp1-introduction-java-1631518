package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;
    final static Double leftRectangleRotationAngle=10.0;
    final static Double rightRectangleRotationAngle=-12.0;
    final static Integer ellipseRatio=2;
    final static Double nLetterRectangleRotationAngle=-20.0;
    final static Double noChange=0.0;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        Point2d rectangle_dimensions=new Point2d(halfStripeThickness, maxHeight);
        Rectangle leftRectangle =new Rectangle(rectangle_dimensions);
        Rectangle rightRectangle=leftRectangle.clone();
        Rectangle middleRectangle=new Rectangle(new Point2d(halfMaxWidth , halfStripeThickness));

        rightRectangle.translate(rightRectangle.getCoords(),new Point2d(halfMaxWidth, noChange));
        middleRectangle.translate(middleRectangle.getCoords(),new Point2d(halfMaxWidth-stripeThickness , stripeThickness));
        leftRectangle.rotate(leftRectangle.getCoords(), Math.toRadians(leftRectangleRotationAngle));
        rightRectangle.rotate(rightRectangle.getCoords(), Math.toRadians(rightRectangleRotationAngle));

        BaseShape aShape=new BaseShape();
        aShape.add(leftRectangle);
        aShape.add(rightRectangle);
        aShape.add(middleRectangle);
        return aShape;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle verticalRectangle=new Rectangle(new Point2d(stripeThickness, maxHeight));
        Circle lowerEllipse= new Circle(halfMaxHeight);
        Circle upperEllipse= new Circle(halfMaxHeight);

        lowerEllipse.translate(lowerEllipse.getCoords(),new Point2d(halfMaxWidth+halfStripeThickness , -halfMaxHeight/ellipseRatio));
        upperEllipse.translate(upperEllipse.getCoords(),new Point2d(halfMaxWidth+halfStripeThickness , +halfMaxHeight/ellipseRatio));

        BaseShape bShape=new BaseShape();
        bShape.add(lowerEllipse);
        bShape.add(upperEllipse);
        bShape.add(verticalRectangle);
        return bShape;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Point2d rectangle_dimensions=new Point2d(maxWidth, halfStripeThickness);
        Rectangle lowerRectangle =new Rectangle(rectangle_dimensions);
        Rectangle upperRectangle=lowerRectangle.clone();
        Rectangle verticalRectangle=new Rectangle(new Point2d(halfStripeThickness , maxHeight));

        lowerRectangle.translate(lowerRectangle.getCoords(),new Point2d(halfMaxWidth, -halfMaxHeight));
        upperRectangle.translate(upperRectangle.getCoords(),new Point2d(halfMaxWidth, +halfMaxHeight));

        BaseShape cShape=new BaseShape();
        cShape.add(lowerRectangle);
        cShape.add(upperRectangle);
        cShape.add(verticalRectangle);
        return cShape;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Point2d rectangle_dimensions=new Point2d(maxWidth, halfStripeThickness);
        Rectangle upperRectangle =new Rectangle(rectangle_dimensions);
        Rectangle lowerRectangle=upperRectangle.clone();
        Rectangle middleRectangle=upperRectangle.clone();
        Rectangle verticalRectangle=new Rectangle(new Point2d(halfStripeThickness, maxHeight));

        lowerRectangle.translate(lowerRectangle.getCoords(),new Point2d(halfMaxWidth, -halfMaxHeight));
        middleRectangle.translate(middleRectangle.getCoords(),new Point2d(halfMaxWidth, noChange));
        upperRectangle.translate(upperRectangle.getCoords(),new Point2d(halfMaxWidth, +halfMaxHeight));

        BaseShape eShape=new BaseShape();
        eShape.add(verticalRectangle);
        eShape.add(middleRectangle);
        eShape.add(lowerRectangle);
        eShape.add(upperRectangle);
        return eShape;

    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Point2d rectangle_dimensions=new Point2d(maxWidth, halfStripeThickness);
        Rectangle horizontalRectangle =new Rectangle(rectangle_dimensions);
        Rectangle verticalRectangle=new Rectangle(new Point2d(halfStripeThickness, maxHeight));
        Rectangle secondVerticalRectangle=verticalRectangle.clone();
        secondVerticalRectangle.translate(secondVerticalRectangle.getCoords(),new Point2d(maxWidth, noChange));
        horizontalRectangle.translate(horizontalRectangle.getCoords(),new Point2d(halfMaxWidth, noChange));

        BaseShape hShape=new BaseShape();
        hShape.add(horizontalRectangle);
        hShape.add(secondVerticalRectangle);
        hShape.add(verticalRectangle);
        return hShape;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Point2d rectangle_dimensions=new Point2d(halfStripeThickness, maxHeight);
        Rectangle leftRectangle =new Rectangle(rectangle_dimensions);
        Rectangle rightRectangle=leftRectangle.clone();
        Rectangle middleRectangle=leftRectangle.clone();

        rightRectangle.translate(rightRectangle.getCoords(),new Point2d(maxWidth, noChange));
        middleRectangle.translate(middleRectangle.getCoords(),new Point2d(halfMaxWidth, noChange));
        middleRectangle.rotate(middleRectangle.getCoords(), Math.toRadians(nLetterRectangleRotationAngle));

        BaseShape nShape=new BaseShape();
        nShape.add(leftRectangle);
        nShape.add(middleRectangle);
        nShape.add(rightRectangle);
        return nShape;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {

        return new Ellipse(maxWidth, maxHeight);
    }
    
}

