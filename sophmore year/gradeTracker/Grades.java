package gradeTracker;

/**
 * Name: Humna Sultan
 * Program Name: Tracking Grades - Grades
 * Date: 11 September 2019
 * Extra: 3 different students instead of 2 different students;
 students' names are all names of programming languages
 */
import java.util.Scanner;
//importing
public class Grades {
    //class name
    public static void main(String[] args)
    //main method
    {
        Scanner in = new Scanner(System.in);
        //calls Scanner

        Student student1 = new Student("Java");
        //creates object of other class and inputs "Java" as name

        student1.inputGrades("Java");
        //calls method from other class for inputting grades (argument name)

        Student student2 = new Student("Python");
        //creates object of other class and inputs "Python" as name

        student1.inputGrades("Python");
        //calls method from other class for inputting grades (argument name)

        Student student3 = new Student("Fortran");
        //creates object of other class and inputs "Fortran" as name

        student1.inputGrades("Fortran");
        //calls method from other class for inputting grades (argument name)
    }
}
