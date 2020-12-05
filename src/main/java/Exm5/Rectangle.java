/** ********************************
 *            Rectangle            *
 *---------------------------------*
 *  -shortEdge: int                *
 *  -longEdge:int                  *
 ********************************* */
package Exm5;

/**
 *
 * @author mahbub
 */
// implement Triangle class
public class Rectangle extends Figure {

    private int shortEdge;
    private int longEdge;

    public Rectangle(int shortEdge, int longEdge) {
        this.shortEdge = shortEdge;
        this.longEdge = longEdge;
    }

    @Override
    public int perimeter() {
        return 2 * (longEdge + shortEdge);
    }

    @Override
    public int area() {
        return longEdge * shortEdge;
    }

}
