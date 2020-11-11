/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exm2;

/**
 *
 * @author mahbub
 */
public class Test {

    public static void main(String[] args) {

        Person person = new Person("Mahbub", "istanbul", "m@gmail.com  ", "0923485238");
        Student student = new Student("abu", "Ankara", "234590385", "lfkjglkaj", "Teacher");
        Employee employee = new Employee(4, 5000.3, "mike", "24street", "mahjsjdgujs0@gmail.com", "438690348");

        Faculty faculty = new Faculty(8, "4pm to 6pm", 0, 0, "Sue", "28 Well street", "sue28@aol.com", "4133333333");

        Staff staff = new Staff("Executive Assistant", 12, 70000, "Tom", "90 Country road", "tomcat@aol.com", "2030000000");

        // Invoke toString of Person, Student, Employee, Faculty and Staff
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }

}
