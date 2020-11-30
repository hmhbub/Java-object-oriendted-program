/** ********************************
 *            MyPoint              *
 *---------------------------------*
 * -x: double                      *
 * -y: double                      *
 * +MyPoint()                      *
 * +MyPoint(x: double, y: double)  *
 * +getX(): double                 *
 * +getY(): double                 *
 * +distance(myPoint: MyPoint)     *
 * +distance(x: double, y: double) *
 ********************************* */
package Exm4;

/**
 *
 * @author mahbub
 */
// implement MyPoint class
public class MyPoint {

    private double x;
    private double y;

    // Constructs that creates a point (0,0)
    public MyPoint() {
        this(0, 0);
    }

    /**
     * Constructs a point with specified coordinates
     */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // return x
    public double getX() {
        return x;
    }

    // return y 
    public double getY() {
        return y;
    }

    /**
     * Returns the distance from this point to a specified point of the MyPoint
     * type
     */
    public double distance(MyPoint mypoint) {
        return Math.sqrt(Math.pow(mypoint.getX() - x, 2)) + Math.pow(mypoint.getY() - y, 2);
    }

    /**
     * Returns the distance from this point to another point with specified x-
     * and y-coordinates.
     */
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }
}
