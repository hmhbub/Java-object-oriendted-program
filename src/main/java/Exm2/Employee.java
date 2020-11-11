/** *****************************************************************
 *                        Employee                                  *
 *------------------------------------------------------------------*
 * -office: int                                                     *
 * -salary: double                                                  *
 * -dateHired: MyDate                                               *
 * +Employee(name: String, address: String, phone: String,          *
 *  email: String, office: int, salary: double, dateHired: MyDate); *
 * +getOffice(): int                                                *
 * +getSalary(): double                                             *
 * +getDateHired(): MyDate                                          *
 * +setOffice(office: int): void                                    *
 * +setSalary(salary: double): void                                 *
 * +setDateHired(dateHired: MyDate): void                           *
 * +toString():String                                               *
 ****************************************************************** */
package Exm2;

/**
 *
 * @author mahbub
 */
//implement employee class
public class Employee extends Person {

    private int office;
    private double salary;
    MyDate dateHired;

    public Employee() {
    }
    

    public Employee(int office, double salary, String name, String address, String email, String phone) {
        super(name, address, email, phone);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public String getSalary() {
        return String.format("%.2f", salary);
    }

    /**
     * Return date hired
     */
    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay()
                + "/" + dateHired.getYear();
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Set new dateHired
     */
    public void setDateHired() {
        dateHired = new MyDate();
    }

    //* Return a string discription of the class
    public String toString() {
        return super.toString() + "\nOffice: " + office
                + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }

}
