/** *****************************************
 *                MyDate                    *
 *------------------------------------------*
 * -year: int                               *
 * -month: int                              *
 * -day: int                                *
 * +MyDate()                                *
 * +MyDate(elapsedTime: long)               *
 * +MyDate(year: int, month: int, day: int) *
 * +getYear(): int                  NewClass        *
 * +getMonth(): int                         *
 * +getDay(): int                           *
 * +setDate(elapsedTime: long)              *
 ****************************************** */
package Exm2;

import java.util.GregorianCalendar;

/**
 *
 * @author mahbub
 */
//implemenet MyDate class
public class MyDate {

    private int year;
    private int month;
    private int day;

    /**
     * Creates a MyDate object for the current date
     */
    public MyDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);

    }

    /**
     * Creates a MyDate object with a specified elapsed time since midnight,
     * January 1, 1970, in milliseconds
     */
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    /**
     * Creates a MyDate object with the specified year, month, and day
     */
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = year;
        this.day = day;

    }

    //return year
    public int getYear() {
        return year;
    }

    // return month
    public int getMonth() {
        return month;
    }

    //return day
    public int getDay() {
        return day;
    }

    /**
     * Sets a new date for the object using the elapsed time
     */
    public void setDate(long elapsedTime) {
        GregorianCalendar calander = new GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }

}
