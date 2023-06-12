package Employee;
/**
 * Name: Humna Sultan
 * Program Name: P10.1, P10.2, P10.5
 * Date: 11 December 2020
 * Extra: takes employee's favorite fruit
 */
public class Employee {
    /**
     * constructor for class
     * sets instance variables
     */
    public Employee(String n, String f, double sal)
    {
        name = n;
        salary = sal;
        fruit = f;
    }
    /**
     * toString - returns values
     * @return: values for printing
     */
    public String toString()
    {
        return "name="+name + "\nsalary="+salary + "\nfruit="+fruit;
    }
    private String name;

    private String fruit;
    private double salary;
    //instance variables
}