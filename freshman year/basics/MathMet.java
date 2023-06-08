import java.util.Scanner;
import java.lang.Math;
//importing scanner and math class
/**
 * Name: Humna Sultan
 * Program Name: 6.1 Math Class
 * Date: February 14 2019
 * Extra Thing: Method 6 - allowing user to input the height of
 one student
 */
public class MathMet
{
    public static void main (String [] args)
    //main method; calling methods and organizing
    {
        Scanner in = new Scanner (System.in);
        //calling for scanner

        System.out.println("Lab 6.1: Part 1");
        System.out.println("-------------------------------");
        one();

        System.out.println("Lab 6.1: Part 2");
        System.out.println("-------------------------------");
        two();

        System.out.println("Lab 6.1: Part 3");
        System.out.println("-------------------------------");
        three();

        System.out.println("Lab 6.1: Part 4");
        System.out.println("-------------------------------");
        four();

        System.out.println("Lab 6.1: Part 5");
        System.out.println("-------------------------------");
        five();

        System.out.println("Lab 6.1: Part 6");
        System.out.println("-------------------------------");
        six();

        System.out.println("Lab 6.1: Part 7");
        System.out.println("-------------------------------");
        sev();

        System.out.println("Lab 6.1: Part 8");
        System.out.println("-------------------------------");
        eig();
        //calling methods and organization
    }
    public static void one()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a positive or negative decimal number :: ");
        double num = in.nextDouble();

        System.out.println("--- Number entered rounded down ---");
        System.out.println(Math.floor(num));

        System.out.println("--- Number entered rounded up ---");
        System.out.println(Math.ceil(num));
    }
    //method one; nunbers and rounding
    public static void two()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter age 1 :: ");
        int age1 = in.nextInt();
        System.out.println("Enter age 2 :: ");
        int age2 = in.nextInt();

        int diff = Math.max(age1, age2) - Math.min(age1, age2);
        System.out.println("The difference between the ages is " + diff + " years");
    }
    //method 2; difference between numbers
    public static void three()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("NUMBER SQUARE ROOT");
        for (int i = 1; i < 21; i++)
        {
            System.out.println( i + " " + Math.sqrt(i));
        }
    }
    //method three; square roots of numbers
    public static void four()
    {
        System.out.println("***Numbers to the power of 1, 2, and 3***");

        for (int i = 1; i <= 5; i++)
        {
            System.out.println();
            for (int j = 1; j <= 3; j ++)
            {
                System.out.print(Math.pow(i, j) + " ");
            }
        }
    }
    //method four; Math.pow and numbers
    public static void five()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter an integer value :: ");
        int one = in.nextInt();
        System.out.println("Enter another integer value :: ");
        int two = in.nextInt();

        System.out.println("The larger of the two values is " + Math.max(one, two));
    }
    //method five; finding larger values with Math.max and Math.min
    public static void six()
    {
        System.out.println("***Halloween Costumes for Children***");

        Scanner in = new Scanner (System.in);
        double r = 36;
        double area = Math.round(Math.PI*Math.pow(r, 2));
        System.out.println("The amount of fabric needed for student 1 is " + area + " sq. inches.");

        r = 38;
        area = Math.round(Math.PI*Math.pow(r, 2));
        System.out.println("The amount of fabric needed for student 2 is " + area + " sq. inches.");

        r = 40;
        area = Math.round(Math.PI*Math.pow(r, 2));
        System.out.println("The amount of fabric needed for student 3 is " + area + " sq. inches.");

        r = 42;
        area = Math.round(Math.PI*Math.pow(r, 2));
        System.out.println("The amount of fabric needed for student 4 is " + area + " sq. inches.");

        r = 36;
        double piping = Math.round(2*Math.PI*r);
        System.out.println("The amount of red piping needed for student 1 is " + piping + " inches.");

        r = 38;
        piping = Math.round(2*Math.PI*r);
        System.out.println("The amount of red piping needed for student 2 is " + piping + " inches.");

        r = 40;
        piping = Math.round(2*Math.PI*r);
        System.out.println("The amount of red piping needed for student 3 is " + piping + " inches.");

        r = 42;
        piping = Math.round(2*Math.PI*r);
        System.out.println("The amount of red piping needed for student 4 is " + piping + " inches.");

        //start of extra
        System.out.println("Enter the height in inches of another student :: ");

        double stu = in.nextDouble();
        r = stu;
        area = Math.round(Math.PI*Math.pow(r, 2));
        System.out.println("The amount of fabric needed for the student entered is " + area + " sq. inches.");
        piping = Math.round(2*Math.PI*r);

        System.out.println("The amount of red piping needed for the student entered is " + piping + " inches.");
        //extra
    }
    //method six; circumference and area of circles
    public static void sev()
    {
        System.out.println("***Bacteria over Time***");
        double bact = 40;
        for (int t =0; t <= 24; t++)
        {
            bact =

                    Math.floor(Math.round((bact*Math.pow(2.71,0.25935*t))));
            System.out.println(t + " hours :: " + bact);
        }
    }
    //method 7; bacteria over time with Math.pow
    public static void eig()
    {
        System.out.println("***The leg lengths of a triangle are 9 and 13 units.***");

        double c = Math.round(Math.hypot(9, 13));
        System.out.println("The hypotenuse of the triangle is "

                + c + " units.");
        double ni = 9;
        double thirt = 13;

        double ang = Math.round((Math.atan(ni/thirt)*180)/Math.PI);

        System.out.println("The number of degrees of the acute angle opposite the leg length 9 is " + ang + " degrees");
    }
    //method 8; trigonometry, pythagorean theorem, and right triangles
}
