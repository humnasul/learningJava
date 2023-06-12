package Employee;
/**
 * Name: Humna Sultan
 * Program Name: P10.1, P10.2, P10.5
 * Date: 11 December 2020
 * Extra: takes employee's favorite fruit
 */
public class EmployeeTester {
    /**
     * main method/class
     * @param: N/A; params are included in object initializations
     */
    public static void main(String[] args)
    {
        Employee e = new Employee("Edgar", "Watermelon", 65000);
        Manager m = new Manager("Mary", "Cherry", "Engineering", 85000);
        Executive v = new Executive("Veronica", "Kiwi", "Engineering", 105000);
        System.out.println(e);
        System.out.println("Expected: Employee[name=Edgar,fruit=Watermelon,salary=65000.0]");

        System.out.println(m);
        System.out.println("Expected: Manager[super=Employee[name=Mary,fruit=Cherry,salary=85000.0],department=Engineering]"
);

        System.out.println(v);

        System.out.println("Executive[super=Manager[super=Employee[name=Veronica,fruit=Kiwi,salary=105000.0],department=Engineering]]");
    }
}