
public class histo {
//class name
    /**
     * Name: Humna Sultan
     * Program Name: 8.17 Histogram
     * Date: 14 May 2019
     * Extra Thing: Tells user number of stars in each row;
     tells the user when histogram is complete
     */
    public static void main(String[] args) {
    //main method
        int[] arr = {26, 19, 45, 22, 79, 35, 21, 4, 76, 45,
                56, 90, 88, 32, 45, 3, 66, 74, 77, 35, 24, 33, 42, 55, 76, 74,
                88, 90};
        //histogram array declaration

        int one = 0, two = 0, thr = 0, four = 0, five = 0, six
                = 0, sev = 0, eig = 0, nin = 0, ten = 0, ele = 0, twel = 0;
        //declares variables for for loop

        for (int i = 0; i <= 27; i++)
        {
            int num = arr[i];
            if (num >= 0 && num <=9)
            {

               one++;

            }if (num >= 10 && num <= 19)
            {
                two++;

            }
            if (num >= 20 && num <= 29)
            {
                thr++;

            } if (num >= 30 && num <= 39)
            {
                four++;

            } if (num >= 40 && num <= 49)
            {
                five++;

            } if (num >= 50 && num <= 59)
            {
               six++;

            } if (num >= 60 && num <= 69)
            {
                sev++;

            } if (num >= 70 && num <= 79)
            {
                eig++;

            } if (num >= 80 && num <= 89)
            {
                nin++;

            } if (num >= 90 && num <= 99)
            {
                ten++;

            }
            if (num >= 100)
            {
                ele++;
            }
        }
        //determines number of stars that will go in each row for each category; does for all number in array

        //start of extra
        int l = 1;
        //declares variable for counting in printing

        System.out.println("The " + l + "st row in the histogram has " + one + " stars.");
        l++;
        //increments variable for counting every print statement

        System.out.println("The " + l + "nd row in the histogram has " + two + " stars.");
        l++;

        System.out.println("The " + l + "rd row in the histogram has " + thr + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + four + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + five + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + six + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + sev + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + eig + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + nin + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + ten + " stars.");
        l++;

        System.out.println("The " + l + "th row in the histogram has " + ele + " stars.");
        l++;

        //extra
        //prints message for user so that they knownumber of stars

        System.out.println();
        //skips line
        for (int j = one; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = two; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = thr; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = four; j >= 1; j--)
        {

            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = five; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = six; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = sev; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = eig; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = nin; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = ten; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();
        for (int j = ele; j >= 1; j--)
        {
            System.out.print("*");
        }
        //prints stars for row
        System.out.println();

        System.out.println("Histogram complete!");
        //prints message for when histogram is complete
    }
}