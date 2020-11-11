/** ***************************************
 *                Person                  *
 *----------------------------------------*
 * -name: String                          *
 * -address: String                       *
 * -phone: String                         *
 * -email: String                         *
 * +Person()                              *
 * +Person(name: String, address: String, *
 *  phone: String, email: String)         *
 * +getName(): String                     *
 * +getAddress(): String                  *
 * +getPhone(): String                    *
 * +getEmail(): String                    *
 * +setName(name: String ): void          *
 * +setAddress(address: String): void     *
 * +setPhone(phone: String): void         *
 * +setEmail(email: String): void         *
 * +toString(): String                    *
 **************************************** */
package Exm2;

/**
 *
 * @author mahbub
 */
//implements person class
public class Person {

    String name;
    String address;
    String email;
    String phone;
    /*constrcut person default object */
    Person() {

    }
    /** Construct Person object with specified name, address, phone and email */
    Person(String name, String address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;

    }
    //return name
    public String getName() {
        return name;
    }
    //return address
    public String getAddress() {
        return address;
    }
    //return phone
    public String getPhone() {
        return phone;

    }
    //return email
    public String getEmail() {
        return email;
    }
    //set new name
    public void setName(String name) {
        this.name = name;
    }
    //set new address
    public void setAddress(String address) {
        this.address = address;
    }
    //set new Email Address
    public void setEmail(String email) {
        this.email = email;
    }
    //set new phone number
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "\nName:" + name + "\nAddress:" + address + "\nEmail address:" + email + "\nPhone number: " + phone;
    }

}
