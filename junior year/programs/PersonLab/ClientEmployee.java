package PersonLab;
import java.util.Scanner;

/**
 * Name: Humna Sultan
 * Program Name: Person Lab
 * Date: 4 December 2020
 * Extra: adds extra money to pay rate if firstname is "Bob"
 */
public class ClientEmployee {

    /**
     * main method/class
     * @param: N/A; params are included in object initializations
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String last, first, dept;
        double pay_rate;
        int hours;
        //creates scanner and variables

        System.out.println("Enter employee last name: ");
        last = input.nextLine();
        System.out.println("Enter employee first name: ");
        first = input.nextLine();
        System.out.println("Enter department: ");
        dept = input.nextLine();
        System.out.println("Enter employee pay rate: ");
        pay_rate = input.nextDouble();
        System.out.println("Enter employee hours worked: ");
        hours = input.nextInt();
        //asks user input

        Employee prof = new Employee(first, last, pay_rate, hours, dept);
        prof.calculatePay();
        System.out.println(prof.toString());
        prof.print();

        System.out.println("The wages for " + prof.getFirstName() + " " +
                prof.getLastName() + " from the " + prof.getDepartment() + " department are $" +
                prof.getFinalPay());

        //creates prof using user input and prints info
        System.out.println("-----------------------------");
        Employee prof2 = new Employee();
        prof2.calculatePay();
        System.out.println(prof2.toString());
        prof2.print();
        System.out.println("The wages for " + prof2.getFirstName() + " " +
                prof2.getLastName() + " from the " + prof2.getDepartment() + " department are $" +
                prof2.getFinalPay());

        //creates prof2 using Employee methods and prints info
        System.out.println("-----------------------------");
        System.out.println("Object 2 is equal to Object 1: " + prof2.equals(prof));
        //calls equals class and compares
    }
}