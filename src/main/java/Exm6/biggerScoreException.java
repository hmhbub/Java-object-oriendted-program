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
public class biggerScoreException extends Exception {

    public biggerScoreException(Integer bigScore) {
        super("BiggerScores Exception :" + bigScore + "cannot be added");
    }

}
