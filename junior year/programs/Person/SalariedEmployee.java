/**
 * Name: Humna Sultan
 * Program Name: Employee Commission Lab
 * Date: 1 December 2020
 * Extra: adds extra money to commission employee if flat salary is low
 */
package Person;
public class SalariedEmployee extends Employee {
    public double hourlyRate;
    public double numberHoursPerWeek;
    public double flatSalary;
    public String firstname;
    public String lastname;
    public String birthdate;
    public String employeeID;
    public String jobTitle;
    public String company;
    public double annualSalary;
//instance variables
    /**
     * constructor for HourlyEmployee
     * @param first: first name
     * @param last: last name
     * @param birth: birthdate
     * @param id: id of person
     * @param job: job of person
     * @param com: company
     * @param rate: rate of pay
     * @param sal: flatSalary value
     * @param hours: number of hours worked
     */
    public SalariedEmployee(String first, String last, String birth, String id, String job, String
            com, double rate, double sal, double hours) {
        super(first, last, birth, id, job, com);
        firstname = first;
        lastname = last;
        birthdate = birth;

        employeeID = id;
        jobTitle = job;
        company = com;
        hourlyRate = rate;
        flatSalary = sal;
        numberHoursPerWeek = hours;
    }
    /**
     * returns annual salary
     * @return: annual salary value provided
     */
    public double getAnnualSalary() {
        annualSalary = flatSalary;
        return annualSalary;
    }
    /**
     * returns name
     * @return: firstname and lastname together
     */
    @Override
    public String getName() {
        return firstname + " " + lastname;
    }

    /**
     * returns birthdate
     * @return: returns birthdate of user
     */
    @Override
    public String getBirth() {
        return birthdate;
    }
    /**
     * returns title and company
     * @return: job title and company together
     */

    @Override
    public String getTiCo() {
        return jobTitle + " at " + company;
    }
    /**
     * returns ID
     * @return: employee's job ID provided
     */
    @Override
    public String getID() {
        return employeeID;
    }
}