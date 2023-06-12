package Employee2;
import Employee2.Employee;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 3 Exercise 1
 * Date: 17 September 2019
 * Extra: More employees in employee class
 */
public class EmployeeTester {
    public static void main(String[] args)
    {
        Employee mitch = new Employee("Robber, Mitch", 823213);
        mitch.raiseSalary(10);
        System.out.println(mitch.getName());
        System.out.println("$" + mitch.getSalary());
        System.out.println("------------------------------");
        Employee evie = new Employee("Baker, Evie", 152619);
        evie.raiseSalary(20);
        System.out.println(evie.getName());
        System.out.println("$" + evie.getSalary());
        System.out.println("------------------------------");
        Employee will = new Employee("Fisherman, William", 76865);
        will.raiseSalary(8);
        System.out.println(will.getName());
        System.out.println("$" + will.getSalary());
    }
/**
 method for testing employee class
 */
}