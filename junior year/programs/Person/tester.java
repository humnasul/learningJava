/**
 * Name: Humna Sultan
 * Program Name: Employee Commission Lab
 * Date: 1 December 2020
 * Extra: adds extra money to commission employee if flat salary is low
 */
package Person;
//main class - creates objects and calls functions
public class tester {

    /**
     * main method/class
     * @param: N/A; params are included in object initializations
     */
    public static void main (String[] args)
    {
        System.out.println("**PERSON**");
        Person one = new Person("Billy", "Bob", "12/1/20");
        System.out.println("Name: " + one.r1());
        System.out.println("Birthdate: " + one.r2());
        System.out.println();
        System.out.println("**HOURLY EMPLOYEE**");
        HourlyEmployee two = new HourlyEmployee("Billy", "Bob", "12/1/20",

                "12345", "Worker", "Shoprite", 0.45, 10);

        System.out.println("Name: " + two.getName());
        System.out.println("Birthdate: " + two.getBirth());
        System.out.println("Title and Company: " + two.getTiCo());
        System.out.println("ID: " + two.getID());
        System.out.println("Annual Salary: " + two.getAnnualSalary());
        System.out.println();
        System.out.println("**SALARIED EMPLOYEE**");
        SalariedEmployee three = new SalariedEmployee("Billy", "Bob", "12/1/20",

                "12345", "Worker", "Shoprite", 0.45, 100, 10);

        System.out.println("Name: " + three.getName());
        System.out.println("Birthdate: " + three.getBirth());

        System.out.println("Title and Company: " + three.getTiCo());
        System.out.println("ID: " + three.getID());
        System.out.println("Annual Salary: " + three.getAnnualSalary());
        System.out.println();
        System.out.println("**COMISSIONED EMPLOYEE**");
        CommissionEmployee four = new CommissionEmployee("Billy", "Bob",

                "12/1/20", "12345", "Worker", "Shoprite", 0.45, 100, 50, 10, 20);
        System.out.println("Name: " + four.getName());
        System.out.println("Birthdate: " + four.getBirth());
        System.out.println("Title and Company: " + four.getTiCo());
        System.out.println("ID: " + four.getID());
        System.out.println("Annual Salary: " + four.getAnnualSalary());
        System.out.println();
        System.out.println("**COMISSIONED EMPLOYEE EXTRA**");
        CommissionEmployee five = new CommissionEmployee("Billy", "Bob",

                "12/1/20", "12345", "Worker", "Shoprite", 0.45, 90, 50, 10, 20);
        System.out.println("Name: " + five.getName());
        System.out.println("Birthdate: " + five.getBirth());
        System.out.println("Title and Company: " + five.getTiCo());
        System.out.println("ID: " + five.getID());
        System.out.println("Annual Salary: " + five.getAnnualSalary());
    }
}