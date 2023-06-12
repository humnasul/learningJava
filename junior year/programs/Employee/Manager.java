package Employee;
/**
 * Name: Humna Sultan
 * Program Name: P10.1, P10.2, P10.5
 * Date: 11 December 2020
 * Extra: takes employee's favorite fruit
 */
public class Manager extends Employee {
    /**
     * constructor for class
     * sets instance variables
     */
    public Manager (String n, String f, String depart, double sal)
    {
        super(n, f, sal);
        name = n;
        fruit = f;
        department = depart;
        salary = sal;
    }
    /**
     * override toString - returns values
     * @return: values for printing
     */
    @Override

    public String toString()
    {
        return "name="+name + "\ndepartment=" + department + "\nsalary=" + salary +

                "\nfruit:"+fruit;
    }
    private String name;
    private String fruit;
    private String department;
    private double salary;
    //instance variables
}