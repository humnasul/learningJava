package PersonLab;
/**
 * Name: Humna Sultan
 * Program Name: Person Lab
 * Date: 4 December 2020
 * Extra: adds extra money to pay rate if firstname is "Bob"
 */
public class Employee extends Person1 {
    private double payRate;
    private double hoursWorked;
    private String department;
    public String firstname;
    public String lastname;
    public double finalPay;
    public final int hours = 40;
    public final double overtime = 1.5;
//instance variables
    /**
     * constructor for Employee with parameters
     * @param first: first name
     * @param last: last name
     * @param pay: pay rate
     * @param hours: hours worked
     * @param depart: department name
     */
    public Employee(String first, String last, double pay, double hours, String depart)
    {
        super(first, last);
        firstname = first;
        lastname = last;

        if(firstname.equals("Bob"))
        {
            System.out.println("You get $10 added to your pay rate!");
            payRate = pay +10;
        }
        else
        {
            payRate = pay;
        }
        //extra
        hoursWorked = hours;
        department = depart;
    }
    /**
     * constructor for Employee with no parameters; calls methods to fill info
     */
    public Employee()
    {
        super("James", "Bond");
        setAll("James", "Bond", 60.0, 50, "THEATRE");
    }
    /**
     * toString method that returns info
     * @return: object information
     */
    @Override
    public String toString()
    {
        return "The wages for " + this.lastname + ", " + this.firstname + " from the " +

                this.department + " department are: $" + this.payRate;
    }
    /**
     * method that prints all object information
     */
    @Override
    public void print()

    {
        System.out.println("The employee " + firstname + " " + lastname + " from the " +

                department + " department worked " + hoursWorked + " hours.");

        System.out.println("Their pay rate was $" + payRate + ". The wages for " +

                firstname + " " + lastname + " are $" + finalPay);
    }
    /**
     * method that copies object information
     * @param - Person1 c: object to copy information from
     */
    public void copy(Employee c)
    {
        this.setAll(c.getFirstName(), c.getLastName(), c.getPayRate(),

                c.getHoursWorked(), c.getDepartment());
    }
    /**
     * method that returns Object and gets copy
     * @return c: returns created object c
     */
    public Employee getCopy()
    {
        Employee c = new Employee(firstname, lastname, payRate, hoursWorked,

                department);

        return c;
    }
    /**
     * method that calculates employee's final pay and assigns to instance variable
     */
    public void calculatePay()
    {
        if (hoursWorked > 40)
        {
            finalPay = (payRate*hours)+((payRate+10)*overtime);
        }
        else
        {
            finalPay = hoursWorked*payRate;

        }
    }
    /**
     * method that sets all instance variables
     * @param first: first name
     * @param last: last name
     * @param : pay rate
     * @param hours: hours worked
     * @param : department name
     */
    public void setAll(String first, String last, double rate, double hours, String dep)
    {
        firstname = first;
        lastname = last;
        payRate = rate;
        hoursWorked = hours;
        department = dep;
    }
    /**
     * method that returns object's pay rate
     * @return: pay rate
     */
    public double getPayRate()
    {
        return payRate;
    }
    /**
     * method that returns object's hours worked
     * @return: hours worked
     */
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    /**
     * method that returns object's department

     * @return: department
     */
    public String getDepartment()
    {
        return department;
    }
    /**
     * method that returns object's final pay
     * @return: final pay
     */
    public double getFinalPay()
    {
        return finalPay;
    }
    /**
     * equals method that compares objects
     * @param - Employee o: object to be compared to this object
     * @return: true/false if objects are equal or not
     */
    public boolean equals(Employee o)
    {
        if (o.payRate==this.payRate && o.firstname.equals(this.firstname) &&
                o.lastname.equals(this.lastname)&&o.department.equals(this.department)&&
                o.hoursWorked==this.hoursWorked){

        return true;
    }
    else {
        return false;
    }

    }
}