/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exm6;

/**
 *
 * @author mahbub
 */
public class smallScoreException extends Exception {

    public smallScoreException(Integer smallScore) {
        super("Small values Error: " + smallScore + "cannot be added");
    }

}
