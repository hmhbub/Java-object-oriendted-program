/** ********************************
 *            Circle               *
 *---------------------------------*
 *   - edge: int                   *
 *   - height: int                 *
 *   +posX : int                   *
 *   +posY: int                    *
 *   +move()                       *
 ********************************* */
package Exm5;

import java.util.Scanner;

/**
 *
 * @author mahbub
 */
public class EquilateralTriangle extends Figure implements Movable {

    private int edge;
    private int height;
    public int posX;
    public int posY;

    public EquilateralTriangle(int edge, int height) {
        this.edge = edge;
        this.height = height;

    }

    @Override
    /**
     * Return perimeter of this quilateralTriangle
     */
    public int perimeter() {
        return 3 * edge;

    }

    @Override
    /**
     * Return area of this EquilateralTriangle
     */
    public int area() {
        return (edge * height) / 2;

    }

    @Override
    public void move() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input x");
        posX = input.nextInt();
        System.out.println("Input y");
        posY = input.nextInt();
    }

    @Override
    public void turnBack() {
        this.posX = 0;
        this.posY = 0;
    }

}
