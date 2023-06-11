package gradeTracker;

/**
 * Name: Humna Sultan
 * Program Name: Tracking Grades - Student
 * Date: 11 September 2019
 * Extra: 3 different students instead of 2 different students;
 students' names are all names of programming languages
 */
import java.util.Scanner;
//importing
public class Student {
    //class name
    public Student(String studentName)
    {
    }
    //constructor
    public static void inputGrades(String name)
    //method for inputting grades
    {
        Scanner in = new Scanner(System.in);
        //scanner call
        double test1 = 0;
        double test2 = 0;
        //initializing/declaring variables

        System.out.println("What is the score of test 1 for " + name + "? :: ");

        test1 = in.nextDouble();
        if (test1 > 100 || test1 <= 0)
        {
            do {
                System.out.println("Please enter a valid grade for the student (0 < x <= 100).");

                System.out.println("What is the score of test 1 for " + name + "? :: ");

                test1 = in.nextDouble();
            } while (test1> 100 || test1 <= 0);
        }
        //asks the user for grades of student. Makes sure that score is appropriate; otherwise, repeats prompt

        System.out.println("What is the score of test 2 for " + name + "? :: ");

        test2 = in.nextDouble();
        if (test2 > 100 || test2 <= 0)
        {
            do {
                System.out.println("Please enter a valid grade for the student (0 < x <= 100).");

                System.out.println("What is the score of test 2 for " + name + "? :: ");

                test2 = in.nextDouble();
            } while (test2> 100 || test2 <= 0);
        }
        //asks the user for grades of student. Makes sure that score is appropriate; otherwise, repeats prompt

        getAverage(test1, test2, name);
        //calls method for average
    }
    public static void getAverage(double one, double two, String name)
    //method that calculates average
    {
        double total = one+two;
        double aver = total/2;
        //calculates average of a student's grades
        printStudent(one, two, aver, name);

        //calls method for printing
    }
    public static void printStudent(double one, double two, double aver, String name)
    //method that prints the information pertaining to a student
    {
        System.out.println();
        //skips line

        System.out.println("Name - " + name + " :: Test 1 = " + one + " :: Test 2 = " + two + " :: Average = " + aver);
        //Prints student's info

        System.out.println();
        //skips line
    }
}