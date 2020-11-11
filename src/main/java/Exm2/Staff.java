/** ********************************************************************
 *                                Staff                                *
 *---------------------------------------------------------------------*
 * -title: String                                                      *
 * +Staff(name: String, address: String, phone: String, email: String, *
 *  office: int, salary: double, dateHired: MyDate, title: String)     *
 * +getTitle(): String                                                 *
 * +setTitle(title: String): void                                      *
 * +toString(): String                                                 *
 ********************************************************************* */
package Exm2;

/**
 *
 * @author mahbub
 */
public class Staff extends Employee {

    private String title;

    public Staff(String title, int office, double salary , String name, String address, String email, String phone) {
        super(office, salary,  name, address, email, phone);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\nTitle:" + title;
    }
}
