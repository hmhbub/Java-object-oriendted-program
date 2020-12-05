/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exm5;

/**
 *
 * @author mahbub
 */
public class Test {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 3);
        System.out.println("Perimeter of rectangle :" + r.perimeter());

        Figure f = new Rectangle(7, 8);

        Circle c = new Circle(5);

        EquilateralTriangle eq = new EquilateralTriangle(4, 5);
        eq.posX = 7;
        eq.posY = 5;

        eq.move();

        System.out.println(eq.posX);
        System.out.println(eq.posY);

        eq.turnBack();

        System.out.println(eq.posX);
        System.out.println(eq.posY);
    }
}
