/** ***********************************************
 *                   Student                      *
 *------------------------------------------------*
 * -status: String                                *
 * ---------------                                *
 * +Student(name: String, address: String,        *
 *  phone: String, email: String, status: String) *
 * +getStatus(): String                           *
 * +setStatus(status: String): void               *
 * +toString(): String                            *
 ************************************************ */
package Exm2;

/**
 *
 * @author mahbub
 */
//implement student class
public class Student extends Person {

    private String status;

    Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }
    // return stats
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    // return a string discription of the class
    public String toString() {
        return super.toString() + "\n Status:" + status;
    }

}
