/** ********************************
 *            Circle               *
 *---------------------------------*
 *   - radius: int                 *
 *                                 *
 ********************************* */
package Exm5;

/**
 *
 * @author mahbub
 */
public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int perimeter() {
        return 2 * 3 * radius;
    }

    @Override
    public int area() {
        return 3 * radius * radius;
    }

}
