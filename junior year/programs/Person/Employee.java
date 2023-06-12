/**
 * Name: Humna Sultan
 * Program Name: Employee Commission Lab
 * Date: 1 December 2020
 * Extra: adds extra money to commission employee if flat salary is low
 */
package Person;
public abstract class Employee extends Person{
    public String employeeID;
    public String jobTitle;
    public String company;
    //instance variables
    /**
     * constructor for Employee

     * @param first: first name
     * @param last: last name
     * @param birth: birthdate
     * @param id: id of person
     * @param job: job of person
     * @param com: company
     */
    public Employee(String first, String last, String birth, String id, String job, String com) {
        super(first, last, birth);
        employeeID = id;
        jobTitle = job;
        company = com;
    }
    public abstract String getName();
    public abstract String getBirth();
    public abstract String getTiCo();
    public abstract String getID();
    public abstract double getAnnualSalary();
    //abstract methods for use
}