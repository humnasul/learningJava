package Card1;
import java.util.Scanner;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 5 P5.2
 * Date: 8 October 2020
 * Extra: Potato Card (P)
 */
public class Card1 {
    static String cd;
    static String cd1;
    static String cd2;
    static String ans1;
    static String ans2;
//instance variables
    /**
     main method; creates constructor for testing
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the card notation: ");
        String c = in.nextLine();
        Card1 test = new Card1(c);
        System.out.println(cd);
        if (test.proceed())

        {
            test.split();
            test.getDescription();
            System.out.println(ans1 + ans2);
        }
        else
        {
            System.out.println("Unknown");
        }
//sees if notation is right by calling function to check input
    }
    /**
     method that splits user input into card number and card suit
     */
    public void split()
    {
        cd1 = cd.substring(0,1);
        cd2 = cd.substring(1,2);
    }
    /**
     method that finds out whether user input was formatted correctly and whether it is safe to
     proceed
     - extra: includes potato card
     @return boolean: returns true if safe, returns false if input was incorrect
     */
    public boolean proceed()
    {
        boolean p = false;
        if (cd.length() == 2)
        {
            p = true;
        }
        else if (cd.length() == 1)
        {
            if (cd.contentEquals("P"))
            {
                p = false;

                System.out.println("You have the special potato card!");
                System.exit(0);
            }
            else
            {
                p = false;
            }
        }
        return p;
    }
    /**
     method that finds out description of card by using switch statements
     */
    public void getDescription()
    {
        switch(cd1)
        {
            case "A":
            {
                ans1 = "Ace of ";
                break;
            }
            case "2":
            {
                ans1 = "Two of ";
                break;
            }
            case "3":
            {
                ans1 = "Three of ";
                break;
            }
            case "4":
            {
                ans1 = "Four of ";
                break;
            }
            case "5":

            {
                ans1 = "Five of ";
                break;
            }
            case "6":
            {
                ans1 = "Six of ";
                break;
            }
            case "7":
            {
                ans1 = "Seven of ";
                break;
            }
            case "8":
            {
                ans1 = "Eight of ";
                break;
            }
            case "9":
            {
                ans1 = "Nine of ";
                break;
            }
            case "J":
            {
                ans1 = "Jack of ";
                break;
            }
            case "Q":
            {
                ans1 = "Queen of ";
                break;
            }
            case "K":
            {
                ans1 = "King of ";
                break;
            }
            default:

            {
                System.out.println("Unknown");
                System.exit(0);
            }
        }
        switch(cd2)
        {
            case "D":
            {
                ans2 = "Diamonds";
                break;
            }
            case "H":
            {
                ans2 = "Hearts";
                break;
            }
            case "S":
            {
                ans2 = "Spades";
                break;
            }
            case "C":
            {
                ans2 = "Clubs";
                break;
            }
            default:
            {
                System.out.println("Unknown");
                System.exit(0);
            }
        }
    }
    /**
     method that takes parameters and puts values into instance variables
     @param c: value that is hard-coded when declaring constructor, used to set instance
     variables; user enters

     */
    public Card1(String c)
    {
        cd = c;
    }
}