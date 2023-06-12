package Employee2;
import java.util.Scanner;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 3 Exercise 1
 * Date: 17 September 2019
 * Extra: More employees in employee class
 */
public class Employee {
    double salary;
    String name;
    //instance variables
    public static void main(String[] args) {
        Employee harry = new Employee("Hacker, Harry", 50000);
        harry.raiseSalary(10);
        System.out.println(harry.getName());
        System.out.println("$" + harry.getSalary());
    }
    /**
     Main method that creates an object for testing
     */
    public String getName()
    {

        return name;
    }
    /**
     method to return name
     */
    public double getSalary()
    {
        return salary;
    }
    /**
     method to return salary
     */
    public void raiseSalary(double byPercent)
    {
        salary = salary + salary*(byPercent/100);
    }
    /**
     method to raise employee's salary
     */
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
/**
 method that takes parameters and puts values into instance variables
 */

}
