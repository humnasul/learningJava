/**
 * Name: Humna Sultan
 * Program Name: Employee Commission Lab
 * Date: 1 December 2020
 * Extra: adds extra money to commission employee if flat salary is low
 */
package Person;
public class CommissionEmployee extends SalariedEmployee {
    public double hourlyRate;
    public double flatSalary;
    public double salesTotal;
    public double numberHoursPerWeek;
    public double commissionPercentage;
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
     * @param sales: num of sales made
     * @param hours: number of hours worked
     * @param percen: commission percentage
     */
    public CommissionEmployee(String first, String last, String birth, String id, String job,
                              String com, double rate, double sal, double sales, double hours, double percen) {

        super(first, last, birth, id, job, com, rate, sal, hours);
        hourlyRate = rate;
        flatSalary = sal;
        salesTotal = sales;
        numberHoursPerWeek = hours;
        commissionPercentage = percen;
        if (flatSalary < 100)
        {
            System.out.println("You get a bonus on your flat salary!");
            flatSalary = flatSalary + 50;
        }
        //extra
    }
    /**
     * returns calculated annual salary
     * @return: annual salary value
     */
    public double getAnnualSalary()
    {
        annualSalary = flatSalary + ((commissionPercentage / 100 ) * salesTotal);
        return annualSalary;
    }
}