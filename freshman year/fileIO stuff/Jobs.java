
import java.io.*;
//imports file class
import java.util.Scanner;
//imports Scanner class
public class Jobs {
//class name
    /**
     * Name: Humna Sultan
     * Program Name: 7.1 Create
     * Date: 10 March 2018
     * Extra Thing: N/A; on other part of lab
     */
    public static void main(String[] args)
    {
        String name;
        int emplo, hours;
        double wage;
        //declaring variables

        Scanner in1 = new Scanner(System.in); //for integer input
        Scanner in2 = new Scanner(System.in); //for string input
        Scanner in3 = new Scanner(System.in); //for doubles
        //declares 3 scanners

        System.out.println("How many employees would you like to enter information for? :: ");
        emplo = in1.nextInt();
        //asks user for number of employees that they will enter info about

        File f = new File("src/Payroll.txt");
        //declaring file/initialization
        PrintWriter pw;

        //calls print
        try
        //try
        {
            pw= new PrintWriter(f);
            //creates print-writer
            for (int i = 0; i < emplo; i++)
            /* for loop that executes so that employer can enter
                names and info of all of the employees that they want to enter about */
            {
                System.out.println("What is the employee's full name? :: ");
                name = in2.nextLine();
                //asks for employees full name

                System.out.println("How many hours has the employee worked in the past week? ::");
                hours = in1.nextInt();
                //asks for how many hours the employee has worked in the current week

                System.out.println("What is the hourly wage of the employee (in dollars)? ::");
                wage = in3.nextDouble();
                //asks for hourly wage of employee

                pw.println(name + " : worked " + hours + " hours this week - hourly wage is $" + wage);
                pw.println("\n" + "------------------------------------");
                //puts info into file
            }
            pw.close();
            in1.close();
            in2.close();
            in3.close();
            //closes
        }

        catch (FileNotFoundException e)
        {

            System.out.println(e.getMessage());
            //runs try
        }
        //catch
    }
}
