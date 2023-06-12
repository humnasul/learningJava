package PersonLab;
/**
 * Name: Humna Sultan
 * Program Name: Person Lab
 * Date: 4 December 2020
 * Extra: adds extra money to pay rate if firstname is "Bob"
 */
public class Person1 {
    public String firstname;
    public String lastname;
//instance variables
    /**
     * constructor for Person1 with parameters
     * @param first: first name
     * @param last: last name
     */
    public Person1(String first, String last)
    {
        setName(first, last);
    }
    /**
     * method that sets instance variables
     * @param f: first name
     * @param l: last name
     */
    public void setName(String f, String l)
    {

        firstname = f;
        lastname = l;
    }
    /**
     * method that prints first name and last name together
     */
    public void print()
    {
        System.out.println(firstname + " " + lastname);
    }
    /**
     * method that prints first name and last name together
     */
    public void printLastFirst()
    {
        System.out.println(lastname + ", " + firstname);
    }
    /**
     * toString method that returns vars
     * @return: object information
     */
    public String toString()
    {
        return "First name: " + firstname + "\nLast name: " + lastname;
    }
    /**
     * equals method that compares objects
     * @param - Employee o: object to be compared to this object
     * @return: true/false if objects are equal or not
     */
    public boolean equals(Employee o)
    {
        if (o.firstname.equals(this.firstname) && o.lastname.equals(this.lastname)){
            return true;
        }
        else{

            return false;
        }

    }
    /**
     * method that returns object firstname
     * @return firstname: object name
     */
    public String getFirstName()
    {
        return firstname;
    }
    /**
     * method that returns object lastname
     * @return lastname: object last name
     */
    public String getLastName()
    {
        return lastname;
    }
    /**
     * method that copies object information
     * @param - Person1 c: object to copy information from
     */
    public void copy(Person1 c)
    {
        this.setName(c.getFirstName(), c.getLastName());
    }
    /**
     * method that returns Object and gets copy
     * @return c: returns created object c
     */
    public Person1 getCopy()
    {
        Person1 c = new Person1(firstname, lastname);
        return c;
    }

}