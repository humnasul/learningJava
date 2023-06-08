
import java.util.Scanner;
import java.text.*;
//importing
public class RPainSt
//class name
/**
 * Name: Humna Sultan
 * Program Name: 5.5 RPS
 * Date: 20 January 2019
 * Extra Thing: Orange Paint; costs 23.78 per gallon
 */
{
    public static void main(String[] args)
    //main method
    {
        double rpai, gpai, opai, p, gpri, rpri, opri, tbill;
        int ans;
        //variables

        Scanner in = new Scanner(System.in);
        DecimalFormat decFor = new DecimalFormat("0.00");
        //calling decimal format and scanner

        System.out.println("Would you like to purchase any paint? 1 for yes or 2 for no :: ");

        ans = in.nextInt();
        //initially asking if user wants paint

        rpai = 0;
        gpai = 0;
        opai = 0;
        gpri = 0;
        //initializing variables
        while (ans == 1)
        {
            System.out.println("How many gallons of red paint would you like to buy? :: ");
            p = in.nextDouble();
            rpai = rpai + p;

            System.out.println("How many gallons of green paint would you like to buy? :: ");
            p = in.nextDouble();
            gpai = gpai + p;

            System.out.println("How many gallons of orange paint would you like to buy? :: ");
            p = in.nextDouble();
            opai = opai + p;

            System.out.println("Would you like to purchase any additional paint? 1 for yes or 2 for no :: ");
            ans = in.nextInt();
        }
        //while loop that asks user how much paint they want and whether they want more paint

        if (ans == 2)
        //this happens when user is done buying paint
        {
            gpri = green(gpai);
            rpri = red(rpai);
            opri = orange(opai);
            tbill = totbill(rpri, gpri, opri);
            //calls other methods

            System.out.println("__--Bill--__");
            store();

            System.out.println("Total Cost of Red Paint: $" + decFor.format(rpri));
            System.out.println("Total Cost of Green Paint: $" + decFor.format(gpri));
            System.out.println("Total Cost of Orange Paint: $" + decFor.format(opri));

            System.out.println("Total Bill: $" + decFor.format(tbill));
            thank();
            //prints bill
        }
    }
    public static double green(double gpai)
    {
        double l = gpai * 19.95;
        return l;
    }
    public static double red(double rpai)
    {
        double o = rpai * 21.95;
        return o;
    }
    public static double orange(double opai)
    {
        double r = opai * 23.78;
        return r;
    }
    //methods that find prices of paint
    public static void store()
    {
        System.out.println("*------------------------*");
        System.out.println("*--Rainbow Paint Store---*");
        System.out.println("*------------------------*");
    }
    //stores name/logo method
    public static double totbill(double rpri, double gpri, double opri)
    {
        double u = rpri + gpri + opri;
        double t = u * 1.08;
        return t;
    }
    //finds total bill
    public static void thank()
    {
        System.out.println("&%###Thank you for shopping at the Rainbow Paint Store!###%&");
    }
    //thanks user method
}
