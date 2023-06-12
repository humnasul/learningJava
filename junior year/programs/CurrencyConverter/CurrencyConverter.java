package CurrencyConverter;
import java.util.Scanner;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 6 P6.1
 * Date: 16 October 2020
 * Extra: Choice between EUR to USD or USD to EUR
 */
public class CurrencyConverter {
    /*
     * Main method
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String val = " ";
        double ans = 0;
        int choice = 0;
        double val2 = 0;
        System.out.println("Enter 1 for USD to EUR or 2 for EUR to USD :: ");
        choice = in.nextInt();
        //extra
        in.nextLine();
        /*
         * if statement for which type of conversion to do ; extra
         */
        if (choice == 1)

        {
            /*
             * While loop that takes input and evaluates whether to convert or quit
             */
            while (!val.equalsIgnoreCase("Q"))
            {
                System.out.println("Enter a dollar value to convert to euros: ");
                val = in.nextLine();
            /*
            * if statement to evaluate whether program should be quit or not
            based on value of user input */
                if (val.equalsIgnoreCase("Q"))
                {
                    System.exit(0);
                }
                else
                {
                    val2 = Double.parseDouble(val);
                    ans = val2 * 0.85;
                    System.out.println(ans + " EUR");
                }
            }
            System.exit(0);
        }
        else if (choice == 2)
        {
            /*
             * While loop that takes input and evaluates whether to convert or quit
             */
            while (!val.equalsIgnoreCase("Q"))
            {
                System.out.println("Enter a euro value to convert to dollars: ");
                val = in.nextLine();
            /*
            * if statement to evaluate whether program should be quit or not
            based on value of user input
            */

                if (val.equalsIgnoreCase("Q"))
                {
                    System.exit(0);
                }
                else
                {
                    val2 = Double.parseDouble(val);
                    ans = val2 * 1.17;
                    System.out.println(ans + " EUR");
                }
            }
            System.exit(0);
        }
        else
        {
            System.out.println("You did not enter a valid choice. Bye bye!");
            System.exit(0);
        }
    }
}