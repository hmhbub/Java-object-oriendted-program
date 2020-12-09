/*
Write a Studnet class that keeps the scores of the studnets in the ArrayList<Integer>.
*wirite addNote method to add a new score the arrylist.
if the score is less than zero, throw smallScoreException
if the score is greater than 100, throw biggerScoreException
* Write you own Exception class and test your code. şf the score is not 
between 0 and 100 catch the exception and message like this:
   -- smallScoreException: -5 cannot be added as a score.
   -- biggerScoreException: 150 cannot be be added as score .

 */
package Exm6;

import java.util.ArrayList;

/**
 *
 * @author mahbub
 */
public class Student {

    private ArrayList<Integer> array = new ArrayList<>();

    public void addScore(int number) throws smallScoreException, biggerScoreException {
        if (number < 0) {
            throw new smallScoreException(number);
        } else if (number > 100) {
            throw new biggerScoreException(number);
        } else {
            array.add(number);
        }
    }

}
