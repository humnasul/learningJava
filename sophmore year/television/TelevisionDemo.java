/**
 * Name: Humna Sultan
 * Program Name: Television Lab
 * Date: 23 September 2019
 * Extra: tells user that they can get a lollipop from Mr.
 Hendricks' desk if they enter channel 21
 */
package television;
//package
import java.util.Scanner;
//importing Scanner
public class TelevisionDemo
{
    //class name
    public static void main(String[] args)
    {
    //main method
        Scanner keyboard = new Scanner (System.in);
        //calls Scanner
        int station;
        System.out.println("What is the brand of your television? :: ");
        String tvbrand = keyboard.nextLine();

        //asks for tv brand; stores in var
        System.out.println("What is the size of your television (feet) :: ");
        double size = keyboard.nextDouble();
        //asks for size of tv; stores in var
        Television bigScreen = new Television(tvbrand, size);
        //creates television object

        System.out.println();
        //skips line

        System.out.println("What would you like to do? ::");
        System.out.println("1. Turn on the TV");
        int status = keyboard.nextInt();
        //asks the user if they want to turn on tv
        while(status != 1)
        {
            System.out.println("What would you like to do? ::");
            System.out.println("1. Turn on the TV");
            status = keyboard.nextInt();
        }
        //gives user no option except to turn off tv
        bigScreen.power();
        //turns on tv
        System.out.println("A " + bigScreen.getScreenSize() + " " + bigScreen.getManufacturer() + " has been turned on.");
        //tells the user that tv is on
        station = -2;
        //sets station (temporary
        System.out.println();

        while (station <= 0)
        {
            System.out.print("What channel do you want? (Make sure the channel is >= 1) :: ");
            station = keyboard.nextInt();
            //change the channel on the television
            bigScreen.setChannel(station);
            if(station == 21)
            {
                System.out.println();
                System.out.println("()()()You guessed the magic number! You "
                        + "win a lollipop! Go redeem it from Mr. Hendricks' desk! ()()()");
                System.exit(0);
            }
            //extra
        }
        //makes sure that station is >= 1; if channel == 21, prize
        bigScreen.increaseVolume();
        //increases tv volume
        System.out.println();
        System.out.println("Channel: " + bigScreen.getChannel());
        System.out.println("Volume: " + bigScreen.getVolume());
        //prints channel + volume
        for (int i = 0; i >= 0; i++)
        //inifinite loop that only exits if tv is switched off
        {
            status = -3;
            while (status <= 0 || status > 4)
            {

                System.out.println();
                System.out.println("What would you like to do? ::");
                System.out.println("1. Turn off the TV");
                System.out.println("2. Change the channel");
                System.out.println("3. Increase the volume");
                System.out.println("4. Decrease the volume");
                status = keyboard.nextInt();
            }
        //asks user what they want to do and makes sure answer is appropriate

            if (status == 1)
            {
                System.out.println("The television has been switched off.");

                System.out.println("***Thank you for utilizing this program***");
                System.exit(0);
                System.out.println();
            } //for turning tv off
            if (status == 2)
            {
                station = -2;
                while (station <= 0)
                {
                    System.out.println("What channel would you like? (Make sure the channel is >= 1) :: ");
                    station = keyboard.nextInt();
                    bigScreen.setChannel(station);
                    System.out.println("Channel: " + bigScreen.getChannel());
                    if (station == 21)
                    {
                        System.out.println("()()()You guessed the magic number! "
                                + "You will a lollipop! Go redeem it from Mr. Hendricks' desk! ()()()");
                        System.exit(0);
                    }
                    //extra
                    System.out.println();
                }
            }
            //changes channel
            if (status == 3)
            {
                bigScreen.increaseVolume();
                System.out.println("Volume: " + bigScreen.getVolume());
                System.out.println();
            }
            //increases volume
            if (status == 4)
            {
                if (bigScreen.getVolume() == 0)
                {
                    System.out.println();

                    System.out.println("The volume is already 0! It cannot become lower!");
                }
                else
                {
                    bigScreen.decreaseVolume();
                    System.out.println("Volume: " + bigScreen.getVolume());
                    System.out.println();
                }
            }
            //for decreasing volume; makes sure that you cannot have a - volume
        }
    }
}
