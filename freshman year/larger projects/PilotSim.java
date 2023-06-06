
import java.util.Scanner;
//imports scanner
public class PilotSim
//class name
{
    /**
     * Name: Humna Sultan
     * Program Name: 4.5 Pilot Simulator
     * Date: 2 January 2018
     * Extra Thing: Added "Kirby's Warp Star" as a vehicle and extra
     printed statement if so
     */
    public static void main(String[] args)
    //main class
    {
        int airc, numc, adju;
        String fli;
        //stating variables

        Scanner in = new Scanner(System.in);
        //calls for scanner in program
        System.out.println("***||NASA Aimes Research Center - VMS||***");
        //states the company

        System.out.println("\nWhat aircraft would you like to simulate?");
        System.out.println("1. blimp \n2. helicopter \n3. fighter jet \n4. Space Shuttle \n5. Kirby's Warp Star");
        System.out.println("Enter the number of the aircraft that you would like to simulate :: ");
        airc = in.nextInt();
        //asks the user the type of aircraft

        if (airc != 1 && airc != 2 && airc != 3 && airc != 4 && airc != 5)
        {
            System.out.println("\nYou did not enter an option from the list! Try again!");
            System.out.println("What aircraft would you like to simulate?");
            System.out.println("1. blimp \n2. helicopter \n3. fighter jet \n4. Space Shuttle \n5. Kirby's Warp Star");
            System.out.println("Enter the number of the aircraft that you would like to simulate :: ");
            airc = in.nextInt();
        }
        //error trap for type of aircraft
        fli = "Hendricks";
        //initializes variable

        switch (airc)
        {
            case 1:
            {
                fli = "blimp";
                break;
            }
            case 2:
            {
                fli = "helicopter";
                break;
            }
            case 3:
            {
                fli = "fighter jet";

                break;
            }
            case 4:
            {
                fli = "Space Shuttle";
                break;
            }
            case 5:
            {

                fli = "Kirby's Warp Star";
                break;

            }
        }
        //switch for end of program; assigns a variable to the type of vehicle selected so that it can be used

        System.out.println(fli);
        System.out.println("\nHere are the characteristics that the VMS can adjust:");
        System.out.println("1. Position Trim (Trim) \n2. Force " +
                        "Breakout (Return-to-Center Force \n3. Force Gradient (Spring " +
                                "Force) \n4. Force Friction \n5. Damping \n6. Hard Stop");
        //list of characteristics
        System.out.println("\n How many characteristics would you like to adjust for this flight?");
        numc = in.nextInt();
        //asks the user number of characteristics he/she wants to adjust

        if (numc != 1 && numc != 2 && numc != 3 && numc != 4 &&
                numc != 5 && numc != 6)
        {
            System.out.println("Please enter an appropriate response.");
            System.out.println("How many characteristics would you like to adjust for this flight?");

            numc = in.nextInt();
        }
        //error trap for number of characteristics to be adjusted
        switch (numc)
        //switch that allows user to enter characteristics that they want to adjust
        {
            case 1: {
                // case for if the user wants to adjust 1 characteristic
                for (int i = 1; i>0; i--)
                //for loop that will allow for looping the number of characteristics that user wants to adjust
                {
                    System.out.println("\nPlease enter a number for a "
                        + "characteristic that you would like to adjust: ");

                    adju = in.nextInt();
                    //asks for number of char to adjust

                    switch (adju)
                    {
                        case 1: {
                            //prints descriptor for characteristic 1
                            System.out.println(" You have selected ::"
                                            + "\n1. Position Trim "
                                            + "(Trim) - "
                                            + "The position to which a "
                                            + "flight"
                                            + "control returns when the pilot "
                                            + "releases it.");
                            break;
                        }
                        case 2: {
                            //prints descriptor for characteristic 2
                            System.out.println("You have selected :: "
                                            + "\n2. Force Breakout (Return-to-Center Force) - A force\n"
                                            + "that returns a control to Trim. This is a constant force\n"
                                            + "applied toward Trim which remains the same despite\n"
                                            + "how far the control is moved (displacement) and how\n" +
                                            "fast a control is moved (velocity).");
                            break;
                        }

                        case 3: {
                            //prints descriptor for characteristic 3
                            System.out.println("You have selected :: "
                                            + "\n3. Force Gradient (Spring Force)" +
                                            "- A force that returns a control to Trim, but one that varies\n" +
                                            "with displacement. The farther the control "
                                            + "is moved, the stronger the force applied toward\n" + "Trim.");
                            break;
                        }

                        case 4: {
                            //prints descriptor for characteristic 4
                            System.out.println("You have selected :: "
                                            + "\n4. Force Friction - A constant force "
                                            + "that is opposite to the direction "
                                            + "of movement.");
                            break;
                        }

                        case 5: {
                            //prints descriptor for characteristic 5
                            System.out.println("You have selected :: "
                                            + "\n5. Damping - A force that is opposite to the "
                                            + "direction of movement. Damping varies with\n" +
                                            "velocity. The faster a control is moved, the "
                                            + "stronger the force.");
                            break;
                        }

                        case 6: {
                            //prints descriptor for characteristic 6

                            System.out.println("You have selected :: "
                                            + "\n6. Hard Stop - A force that simulates a mechanical limit of travel. "
                                            + "By varying the Hard Stops,\n" + "the range of travel can be adjusted.");
                            break;
                        }

                        default: {
                            //allows for user to re-enter the char num if response is inappropriate
                            System.out.println("\nYou didn't enter the number of a "
                                    + "characteristic in the list! Try again!");
                            i++;
                            break;

                        }
                    }

                }
                break;

            }
            case 2: {//case for if user wants to adjust 1 char

                for (int k = 2; k>0; k--)
                //for loop that will allow for looping the number of characteristics that user wants to adjust
                {
                    System.out.println("\nPlease enter a number for a "
                        + "characteristic that you would like to adjust: ");
                    adju = in.nextInt();
                    //asks user for char num to adjust

                    switch (adju)
                    {
                        case 1: {//prints descriptor for characteristic 1
                            System.out.println(" You have selected ::"
                                            + "\n1. Position Trim "
                                            + "(Trim) - "
                                            + "The position to which a "
                                            + "flight"
                                            + "control returns when the pilot "
                                            + "releases it.");
                            break;
                        }

                        case 2: {
                            //prints descriptor for characteristic 2
                            System.out.println("You have selected :: "
                                            + "\n2. Force Breakout (Return-to-Center Force) - A force\n"
                                            + "that returns a control to Trim. This is a constant force\n"
                                            + "applied toward Trim which remains the same despite\n"
                                            + "how far the control is moved (displacement) and how\n" +
                                    "fast a control is moved (velocity).");
                            break;
                        }

                        case 3: {
                            //prints descriptor for characteristic 3
                            System.out.println("You have selected :: "
                                            + "\n3. Force Gradient (Spring Force)" +
                                            " - A force that returns a control to "
                                            + "Trim, but one that varies\n"
                                            + "with displacement. The farther the control "
                                            + "is moved, the stronger the force applied toward\n" +
                                    "Trim.");
                            break;
                        }

                        case 4: {
                            //prints descriptor for characteristic 4
                            System.out.println("You have selected :: "
                                            + "\n4. Force Friction - A constant force "
                                            + "that is opposite to the direction "
                                            + "of movement.");
                            break;
                        }

                        case 5: {
                            //prints descriptor for characteristic 5
                            System.out.println("You have selected :: "
                                            + "\n5. Damping - A force that is opposite to the "
                                            + "direction of movement. Damping varies with\n"
                                            + "velocity. The faster a control is moved, the "
                                            + "stronger the force.");
                            break;
                        }

                        case 6: {
                            //prints descriptor for characteristic 6
                            System.out.println("You have selected :: "
                                            + "\n6. Hard Stop - A force that simulates a mechanical limit of travel. "
                                            + "By varying the Hard Stops,\n"
                                            + "the range of travel can be adjusted.");
                            break;
                        }

                        default: {
                            //allows the user to re-enter option num if response was inappropriate
                            System.out.println("\nYou didn't enter the number of a "
                                    + "characteristic in the list! Try again!");
                            k++;
                            break;
                        }
                    }

                }
                break;
            }
            case 3: {
                //case for if user wants to adjust 3 characteristics

                for (int j = 3; j>0; j--)
                //for loop that will allow for looping the number of characteristics that user wants to adjust
                {
                    System.out.println("\nPlease enter a number for a "
                        + "characteristic that you would like to adjust: ");

                    adju = in.nextInt();
                    //asks for characteristic num that user wants to adjust

                    switch (adju)
                    {
                        case 1: {
                            //prints descriptor for characteristic 1
                            System.out.println(" You have selected ::"
                                            + "\n1. Position Trim "
                                            + "(Trim) - "
                                            + "The position to which a "
                                            + "flight"
                                            + "control returns when the pilot "
                                            + "releases it.");
                            break;
                        }

                        case 2: {
                            //prints descriptor for characteristic 2
                            System.out.println("You have selected :: "
                                            + "\n2. Force Breakout (Return-to-Center Force) - A force\n"
                                            + "that returns a control to Trim. This is a constant force\n"
                                            + "applied toward Trim which remains the same despite\n"
                                            + "how far the control is moved (displacement) and how\n" +
                                            "fast a control is moved (velocity).");
                            break;
                        }

                        case 3: {
                            //prints descriptor for characteristic 3
                            System.out.println("You have selected :: "
                                            + "\n3. Force Gradient (Spring Force)"
                                            + " - A force that returns a control to Trim, but one that varies\n"
                                            + "with displacement. The farther the control "
                                            + "is moved, the stronger the force applied toward\n" + "Trim.");
                            break;
                        }

                        case 4: {
                            //prints descriptor for characteristic 4
                            System.out.println("You have selected :: "
                                            + "\n4. Force Friction - A constant force "
                                            + "that is opposite to the direction "
                                            + "of movement.");
                            break;
                        }

                        case 5: {
                            //prints descriptor for characteristic 5
                            System.out.println("You have selected :: "
                                            + "\n5. Damping - A force that is opposite to the "
                                            + "direction of movement. Damping varies with\n"
                                            + "velocity. The faster a control is moved, the "
                                            + "stronger the force.");
                            break;
                        }

                        case 6: {
                            //prints descriptor for characteristic 6
                            System.out.println("You have selected :: "
                                            + "\n6. Hard Stop - A force that simulates a mechanical limit of travel. "
                                            + "By varying the Hard Stops,\n"
                                            + "the range of travel can be adjusted.");
                            break;
                        }

                        default: {
                            //allows user to re-enter characteristic num if inappropriate
                            System.out.println("\nYou didn't enter the number of a characteristic"
                                    + " in the list! Try again!");
                            j++;
                            break;
                        }
                    }

                }
                break;

            }
            case 4: {
                //same code/basic point of other cases

                for (int l = 4; l>0; l--)
                {
                    System.out.println("\nPlease enter a number for a "
                        + "characteristic that you would like to adjust: ");
                    adju = in.nextInt();
                    switch (adju)
                    {
                        case 1: {

                            System.out.println(" You have selected ::"
                                            + "\n1. Position Trim "
                                            + "(Trim) - "
                                            + "The position to which a flight control returns when the pilot "
                                            + "releases it.");
                            break;
                        }
                        case 2: {

                            System.out.println("You have selected :: "
                                            + "\n2. Force Breakout (Return-to-Center Force) - A force\n"
                                            + "that returns a control to Trim. This is a constant force\n"
                                            + "applied toward Trim which remains the same despite\n"
                                            + "how far the control is moved (displacement) and how\n" +
                                    "fast a control is moved (velocity).");
                            break;
                        }
                        case 3: {

                            System.out.println("You have selected :: "
                                            + "\n3. Force Gradient (Spring Force)"
                                            + " - A force that returns a control to Trim, but one that varies\n"
                                            + "with displacement. The farther the control is moved, the "
                                            + "stronger the force applied toward\n" + "Trim.");
                            break;
                        }
                        case 4: {

                            System.out.println("You have selected :: "
                                            + "\n4. Force Friction - A constant force "
                                            + "that is opposite to the direction of movement.");
                            break;
                        }
                        case 5: {

                            System.out.println("You have selected :: "
                                            + "\n5. Damping - A force that is opposite to the "
                                            + "direction of movement. Damping varies with\n"
                                            + "velocity. The faster a control is moved, the "
                                            + "stronger the force.");
                            break;
                        }
                        case 6: {

                            System.out.println("You have selected :: "
                                            + "\n6. Hard Stop - A force that simulates a mechanical limit of travel. "
                                            + "By varying the Hard Stops,\n" + "the range of travel can be adjusted.");
                            break;
                        }
                        default: {
                            System.out.println("\nYou didn't enter the number of a "
                                            + "characteristic in the list! Try again!");
                            l++;
                            break;
                        }
                    }

                }
                break;

            }
            case 5: {
                //same code/basic point of other cases
                for (int m = 5; m>0; m--)

                {
                    System.out.println("\nPlease enter a number for a "
                        + "characteristic that you would like to adjust: ");
                    adju = in.nextInt();
                    switch (adju)
                    {
                        case 1: {

                            System.out.println(" You have selected ::"
                                            + "\n1. Position Trim "
                                            + "(Trim) - The position to which a "
                                            + "flight control returns when the pilot "
                                            + "releases it.");
                            break;
                        }
                        case 2: {

                            System.out.println("You have selected :: "
                                            + "\n2. Force Breakout (Return-to-Center Force) - A force\n"
                                            + "that returns a control to Trim. This is a constant force\n"
                                            + "applied toward Trim which remains the same despite\n"
                                            + "how far the control is moved (displacement) and how\n"
                                    + "fast a control is moved (velocity).");
                            break;
                        }
                        case 3: {

                            System.out.println("You have selected :: "
                                            + "\n3. Force Gradient (Spring Force)" +
                                            " - A force that returns a control to Trim, but one that varies\n"
                                            + "with displacement. The farther the control "
                                            + "is moved, the stronger the force applied toward\n" + "Trim.");
                            break;
                        }
                        case 4: {

                            System.out.println("You have selected :: "
                                            + "\n4. Force Friction - A constant force "
                                            + "that is opposite to the direction "
                                            + "of movement.");
                            break;
                        }
                        case 5: {

                            System.out.println("You have selected :: "
                                            + "\n5. Damping - A force that is opposite to the "
                                            + "direction of movement. Damping varies with\n"
                                            + "velocity. The faster a control is moved, the "
                                            + "stronger the force.");
                            break;
                        }
                        case 6: {

                            System.out.println("You have selected :: "
                                            + "\n6. Hard Stop - A force that simulates a mechanical limit of travel. "
                                            + "By varying the Hard Stops,\n" + "the range of travel can be adjusted.");
                            break;
                        }
                        default: {
                            System.out.println("\nYou didn't enter the number of a "
                                            + "characteristic in the list! Try again!");
                            m++;
                            break;

                        }
                    }

                }
                break;

            }
            case 6: //same code/basic point of other cases

            {
                for (int p = 6; p>0; p--)

                {
                    System.out.println("\nPlease enter a number for a "
                        + "characteristic that you would like to adjust: ");

                    adju = in.nextInt();
                    switch (adju)

                    {
                        case 1: {

                            System.out.println(" You have selected ::"
                                            + "\n1. Position Trim "
                                            + "(Trim) - The position to which a "
                                            + "flight control returns when the pilot "
                                            + "releases it.");
                            break;
                        }
                        case 2: {

                            System.out.println("You have selected :: "
                                            + "\n2. Force Breakout (Return-to-Center Force) - A force\n"
                                            + "that returns a control to Trim. This is a constant force\n"
                                            + "applied toward Trim which remains the same despite\n"
                                            + "how far the control is moved (displacement) and how\n"
                                    + "fast a control is moved (velocity).");
                            break;
                        }
                        case 3: {

                            System.out.println("You have selected :: "
                                            + "\n3. Force Gradient (Spring Force)" +
                                            " - A force that returns a control to Trim, but one that varies\n"
                                            + "with displacement. The farther the control "
                                            + "is moved, the stronger the force applied toward\n" + "Trim.");
                            break;
                        }
                        case 4: {

                            System.out.println("You have selected :: "
                                            + "\n4. Force Friction - A constant force "
                                            + "that is opposite to the direction "
                                            + "of movement.");
                            break;
                        }
                        case 5: {

                            System.out.println("You have selected :: "
                                            + "\n5. Damping - A force that is opposite to the "
                                            + "direction of movement. Damping varies with\n"
                                            + "velocity. The faster a control is moved, the "
                                            + "stronger the force.");
                            break;
                        }
                        case 6: {

                            System.out.println("You have selected :: "
                                            + "\n6. Hard Stop - A force that simulates a mechanical limit of travel. "
                                            + "By varying the Hard Stops,\n"
                                            + "the range of travel can be adjusted.");
                            break;
                        }

                        default: {
                            System.out.println("\nYou didn't enter the number of a "
                                            + "characteristic in the list! Try again!");
                            p++;
                            break;

                        }
                    }

                }
                break;

            }
            case 0:
            {
                //case if user wants to adjust no characteristics

                System.out.println("\nYou have chosen not to adjust any characteristics on this flight.");
                break;
            }

        }
        System.out.println("\n\nYou have chosen to fly (a) " + fli + ". \nYou can adjust " + numc +
                        "characteristics during this flight.");
        //prints required info about flight

        if (fli == "Kirby's Warp Star")
        {
            System.out.println("\n Kirby and Meta Knight have invited you to a picnic! Sounds fun!");

        }
        //extra
        System.out.println("\n== Thank you for using the NASA VMS ==");
        //concludes

    }

}