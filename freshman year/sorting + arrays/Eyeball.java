
import java.util.Scanner;
//importing
public class Eyeball {
//class name
    /**
     * Name: Humna Sultan
     * Program Name: 8.11 Eyeball Video
     * Date: 28 April 2019
     * Extra Thing: asks the user about their experience and
     varies responses based on this
     */
    public static void main(String[] args) {
    //main method
        Scanner in = new Scanner(System.in);//calling scanner
        String[] name = new String[10];
        int[] idn = new int[10];
        int[] mid = new int[10];
        int [] rencode = new int[10];
        int[] days = new int[10];
        String[] stat = new String[10];
        double[] numsta = new double[10];
        //declaring arrays

        int meow = 0;
        //declaring variable
        System.out.println("Press the enter key twice to start :: ");
        in.nextLine();
        //starting program

        System.out.println("\n-----WELCOME TO THE EYEBALL VIDEO STORE-----\n");
        //introduction

        for (int i = 0; i <= 9; i++)
        //for loop for getting info
        {
            meow++;
            in.nextLine();
            System.out.println("\n---Serving Customer #" + meow + "---");

            System.out.println("Enter your name :: ");
            String ent = in.nextLine();
            name[i] = ent;
            System.out.println("Enter your identification number :: ");

            int num = in.nextInt();
            idn[i] = num;
            System.out.println("Enter the movie's identification number :: ");

            mid[i] = in.nextInt();
            System.out.println("Enter the rental code (can only be 1 or 5) :: ");

            num = in.nextInt();
            rencode[i] = num;
            System.out.println("Enter the number of days that you have had out the movie :: ");
            num = in.nextInt();
            days[i] = num;
            //each question puts the information into a specific spot in the corresponding array

        }
        for (int i = 0; i<=9; i++)
        //for loop for figuring out the prices of the rental movies if late
        {
            int one = rencode[i];
            int two = days[i];
            //makes variable equal to a spot in array

            if (two > one)
            {
                stat[i] = "Late";
            }
            if (one >= two)
            {
                stat[i] = "On Time";
            }
            //gets status

            if (one == 1)
            {
                int num2 = (one-two);
                if (num2 < 0)
                {
                    double mult = Math.abs(num2)*1.49;
                    numsta[i] = mult;
                }
                else
                {
                    double mult = 0.00;
                    numsta[i] = mult;
                }
            }
            //finds late fees if needed

            if (one == 5)
            {
                int num2 = (one-two);
                if (num2 < 0)
                {
                    double mult = Math.abs(num2)*0.69;
                    numsta[i] = mult;

                }
                else
                {
                    double mult = 0.00;
                    numsta[i] = mult;
                }
            }
            //finds late fees if needed
        }
        int j;
        boolean flag = true; // set flag to true to begin first pass

        int temp; //holding variable
        String temp2;
        double temp3;
        while ( flag )
        {
            flag= false; //set flag to false awaiting a possible swap

            for( j = 0; j < idn.length -1; j++ )
            {
                if ( idn[ j ] > idn[ j+1] ) // change to > for ascending sort
                {
                    temp = idn[ j ]; //swap elements
                    idn[ j ] = idn[ j+1 ];
                    idn[ j+1 ] = temp;
                    temp2 = name[ j ]; //swap elements
                    name[ j ] = name[ j+1 ];
                    name[ j+1 ] = temp2;
                    temp = mid[ j ]; //swap elements
                    mid[ j ] = mid[ j+1 ];
                    mid[ j+1 ] = temp;
                    temp = rencode[ j ]; //swap elements
                    rencode[ j ] = rencode[ j+1 ];

                    rencode[ j+1 ] = temp;
                    temp = days[ j ]; //swap elements
                    days[ j ] = days[ j+1 ];
                    days[ j+1 ] = temp;
                    temp2 = stat[ j ]; //swap elements
                    stat[ j ] = stat[ j+1 ];
                    stat[ j+1 ] = temp2;
                    temp3 = numsta[ j ]; //swap elements
                    numsta[ j ] = numsta[ j+1 ];
                    numsta[ j+1 ] = temp3;
                    //swaps elements in all arrays based on the order of identification number of the customer

                    flag = true; //shows a swap occurred

                }

            }
        }

        System.out.println("\nThe people who owe late fees are listed below");

        //tells user info
        for (int e = 0; e <= 9; e++)
        {
            if (stat[e] == "Late")
            {
                System.out.println(name[e]);
            }

        }
        //prints people who are late
        System.out.println("\nThe people who do not owe late fees are listed below");

        //tells user info
        for (int e = 0; e <= 9; e++)
        {

            if (stat[e] == "On Time")
            {
                System.out.println(name[e]);
            }

        }
        //prints out people who are not late
        //start of extra

        System.out.println("Did you enjoy your experience? :: ");
        in.nextLine();
        //asks user for how experience was and types different results

        String enjoy = in.nextLine();
        if (enjoy.equalsIgnoreCase("yes"))
        {
            System.out.println("Thank you for your use of this program. Have a lovely day!");
        }
        if(enjoy.equalsIgnoreCase("no"))
        {
            System.out.println("We apologize for the "
                    + "inconvienience; we will improve our systems. Please let us know "
                    + "what you had trouble with. Have a lovely day!");

        }
        //has different responses for yes and for no
        //extra
    }
}
