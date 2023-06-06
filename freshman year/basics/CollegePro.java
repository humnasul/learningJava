import java.util.Scanner;
public class CollegePro {
    /**
     * Name: Humna Sultan
     * Program Name: "Mid term" program
     * Date: 8 February 2019
     * Extra Thing: N/A
     */
    public static void main(String[] args) {
    //main method
        int coll, ans;
    //integer variables
        Scanner in = new Scanner(System.in);
    //calling for scanner
        System.out.println("--**College Investigation Program**--");
        System.out.println("Information is available for the following colleges: ");
        System.out.println("1. CompSci College");
        System.out.println("2. Binary College");
        System.out.println("3. Sharon College");
        System.out.println("Would you like to see a college? 1 for yes, 2 for no :: ");
        ans = in.nextInt();
        int num = 1;
        num++;

        while (num>0)
        {
            while (ans != 1 && ans != 2)
            {
                System.out.println("You didn't enter a proper option! Try again!");

                System.out.println("Would you like to see a college? 1 for yes, 2 for no :: ");

                ans = in.nextInt();

            }
            if (ans == 1)
            {
                System.out.println("Which college you like to see? :: ");
                coll = in.nextInt();
                while (coll != 1 && coll != 2 && coll != 3)
                {
                    System.out.println("You didn't enter an option! Try again!");

                    System.out.println("Which college you like to see? :: ");
                    coll = in.nextInt();
                }
                if (coll == 1 || coll == 2 || coll == 3)
                    switch (coll)
                    {
                        case 1: one();
                            break;
                        case 2: two();
                            break;
                        case 3: three();
                    }
                System.out.println("\nWould you like to see another college? 1 for yes, 2 for no :: ");
                ans = in.nextInt();
            }
            if (ans == 2)
            {
                break;
            }
        }

        System.out.println("---Thank you for utilizing the College Investigation Program! Stay in school! :) ---");
    }
    public static void one()
    //method for college 1

    {
        System.out.println("\n##CompSci College##");
        System.out.println("The total university undergraduate enrollment for the year is 4.");
        System.out.println("The percentage of women enrolled is 78%. The percentage of men enrolled is 22%");
        System.out.println("The yearly undergraduate tuition is $675,281");
        System.out.println("The Computer Science program has a cereal party every month");
    }
    public static void two()
    //method for college 2

    {
        System.out.println("\n##Binary College##");
        System.out.println("The total university undergraduate enrollment for the year is 6,734.");
        System.out.println("The percentage of women enrolled is 50%. The percentage of men enrolled is 50%");
        System.out.println("The yearly undergraduate tuition is $7,362,934");
        System.out.println("The Computer Science program ranks #26 in the whole world");
    }
    public static void three()
    //method for college 3

    {
        System.out.println("\n##Sharon College##");
        System.out.println("The total university undergraduate enrollment for the year is 4,836.");
        System.out.println("The percentage of women enrolled is 21%. The percentage of men enrolled is 79%");
        System.out.println("The yearly undergraduate tuition is $74,424,244");
        System.out.println("The Computer Science program is taught by Sharon Lin");
    }
}
