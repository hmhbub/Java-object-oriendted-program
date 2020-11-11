/** ********************************************************
 *                      Faculty                            *
 *---------------------------------------------------------*
 * -officeHours: int                                       *
 * -rank: String                                           *
 * +Faculty(name: String, address: String, phone: String,  *
 *  email: String, office: int, salary: double,            *
 *  officeHours: int, rank: String)     *
 * +getOfficeHours(): int                                  *
 * +setOfficeHours(officeHours: int): void                 *
 * +getRank(): String                                      *
 * +setRank(rank: String): void                            *
 * +toString(): String                                     *
 ********************************************************* */
package Exm2;

/**
 *
 * @author mahbub
 */
//implement faculty class
public class Faculty extends Employee {

    private int officeHours;
    private String rank;

    public Faculty(int officeHours, String rank, int office, double salary,  String name, String address, String email, String phone) {
        super(office, salary, name, address, email, phone);
        this.officeHours = officeHours;
        this.rank = rank;
    }

   public int getOfficeHours(){
       return officeHours;
   }
   public String getRank(){
       return rank;
   }
   public void setOfficeHours(int officehours){
       this.officeHours=officehours;
   }
   public void setRank(String rank){
       this.rank=rank;
   }
   public String toString(){
       return super.toString() +"\n OfficeHours:"+ officeHours+"\nRank:"+ rank;
   }
   
}
