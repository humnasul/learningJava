
import java.util.Scanner;
//imports Scanner
import java.text.*;
//imports decimal format
    /**
     * Name: Humna Sultan
     * Program Name: 3.5 - CompAbuse
     * Date: 6 November 2018
     * Extra Thing: If you name is Donald or Mickey, you pay
     different amounts + comments
     */
    public class CompAbuse {
        //class name
        public static void main(String[] args) {
        //main class
            String nameIn, nameOf;
            //String variables
            int off;
            //integer variables
            Scanner in = new Scanner(System.in);
            //calls for scanner in program
            DecimalFormat decFor = new DecimalFormat("0.00");
            //calls for decimal format

            System.out.println("*** Society for the Prevention of Cruelty to Computers ***");
            //name of organization

            System.out.println("`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-`-");
            //organization border

            System.out.println("Enter the name of the investigator :: ");
            nameIn = in.nextLine();
            //asks the user for the name of the investigator and stores the response in a variable
            System.out.println("Enter the name of the offender :: ");
            nameOf = in.nextLine();
            //asks the user for the name of the offender observed and stores the response in a variable

            System.out.println("^<^<^<^<^<^<^<^<^<^<^<^<^<");
            //organization border

            System.out.println("What cruelty offense did you observe? Here are the choices: ");
            //prints
            System.out.println("1. Name calling at the computer. ($49.95)");
            //prints offense and price
            System.out.println("2. Finger shaking at the computer. ($99.95)");
            //prints offense and price
            System.out.println("3. Yelling loudly at the computer. ($149.95)");
            //prints offense and price
            System.out.println("4. Physically attacking the computer. ($499.95)");
            //prints offense and price

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            //organization border

            System.out.println("Only one option can be chosen at a time");
            //prints
            System.out.println("The offense that you observed was # ");
            off = in.nextInt();
            //asks the user for the offense that was observed and stores the response in a variable

            String badName = "donald";
            //sets a string variable to a value
            String mick = "mickey";
            //sets a string variable to a value

            double val1 = 49.95*0.8;
            //finds the price of the offense if the offender's name is mickey and you commit offense 1
            double val2 = 499.95*1.45;
            //finds the price of the offense if the offender's name is donald and you commit offense 2

            System.out.println("*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*&*");
            //organization border

            switch (off){
            //switch statement for offenses
                case 1:
                    if (nameOf.equalsIgnoreCase(mick))
                    {
                        System.out.println("You owe 20% less because your name is Mickey! You owe $" + decFor.format(val1) + "!");
                    }
                    //if statement for if the offender's name is mickey and they commit offense 1. The offender pays 20% less.

                    else
                    {
                        System.out.println(nameOf +" owes $49.95 as reported by " + nameIn + ".");

                    }
                    //else statement for if the offender's name is not mickey and they commit offense 1. The offender pays normal price.

                    break;
                    //break; program does not continue to next case
                case 2:
                    System.out.println(nameOf + " owes $99.95 as reported by " + nameIn + ".");
                    //occurs if the offender commits crime 2. The offender pays $99.95.
                    break;
                    //break; program does not continue to next case
                case 3:
                    System.out.println(nameOf + " owes $149.95 as reported by " + nameIn + ".");
                    //occurs if the offender commits crime 3. The offender pays $149.95.
                    break;
                    //break; program does not continue to next case.
                case 4:
                    if (nameOf.equalsIgnoreCase(badName))
                    {
                        System.out.println("You owe 45% more because your name is Donald! You owe $" + decFor.format(val2) + "!");

                    }
                    //if statement for if the offender's name is donald and they commit offense 4. The offender pays 45% more.

                    else
                    {
                        System.out.println(nameOf +" owes $499.95 as reported by " + nameIn + ".");

                    }
                    //else statement for if the offender's name is not donald and they commit offense 4. The offender pays normal price.
                    break;
                    //break; program does not continue to next case
                default:
                    System.out.println("You did not enter an appropriate response. The program is ending.");
                    //default. prints if the user does not enter an offense that is 1, 2, 3, or 4.

            }

        }
    }
