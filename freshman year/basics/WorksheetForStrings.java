/**
 * Name: Humna Sultan
 * Program Name: Worksheet For Strings
 * Date: 26 September 2018
 * Extra Thing: Designed borders in program + Uther Pendragon info
 */

import java.util.Scanner;
//imports the scanner for printing
public class WorksheetForStrings {
    //Class name
    public static void main(String[] args) {
    //Main method

        String namelast, name, person, citystatezip, street, uther, caption;
        //These are string variables used for storing input made by the user and assigning strings to variables

        int capleng;
        //This is an int variable for finding the length of the caption for the image

        Scanner in = new Scanner(System.in);
        //This calls for the scanner

        System.out.println("Print your last name:: ");
        namelast = in.nextLine();
        //This asks the user to print their last name. Their last name will be assigned to a variable.

        System.out.println("Your medieval name is " + namelast + "@Camelot.com");
        //"@Camelot.com" is concatenated to the person's last name using a print method and variables.

        System.out.println("--------------------------------");
        //Border for organization

        person = "King Arthur";
        //A variable "person" is assigned to the string "King Arthur"
        System.out.println("This is the string 'person', containing the word 'King Arthur' :: " + person);
        //I printed the variable "person"

        person = "Guinevere";
        //I changed the string for variable "person" to "Guinevere".
        System.out.println("This is the string 'person', containing the word 'Guinevere' :: " + person);
        //I printed the variable "person" once again with a different string.

        System.out.println("--------------------------------");
        //Border for organization

        System.out.println("Enter your first name:: ");
        name = in.nextLine();
        //Asks for the person's first name.

        System.out.println("--------------------------------");
        //Border for organization

        System.out.println("Enter your house number and street name:: ");
        street = in.nextLine();
        //Asks for the user's house number and street name and assigns it to the variable "street".

        System.out.println("Enter your city, state, and zip code:: ");
        citystatezip = in.nextLine();
        //Asks for the users city state zip and stores it in the variable "citystatezip".

        System.out.println("................................");
        //Border for organization

        System.out.println(name + ":: " + street + ", " + citystatezip);
        //Prints the person's name and address.

        System.out.println("Your city has " + citystatezip.indexOf(",") + " letters.");
        //Prints the length of the city that the person lives in.

        System.out.println("--------------------------------");
        //Border for organization

        System.out.println("Uther Pendragon was the father of King Arthur.");
        //Extra Info
        uther = "Uther Pendragon";
        System.out.println("This is 'Uther Pendragon' printed using the substring method:: " + uther.substring(0,15));
        //Prints "Uther Pendragon" using the substring method.

        System.out.println("--------------------------------");
        //Border for organization

        System.out.println("Enter a caption for the image :: ");
        caption = in.nextLine();
        //Asks the user to enter a caption for an image and stores the response in the variable "caption".
        System.out.println("The caption you entered was " + caption + ".");
        //Prints the caption that the person entered

        capleng = caption.length();
        //Finds the length of the caption and stores it as a variable.
        System.out.println("Your caption has " + capleng + " letters.");
        //Prints the number of letters in the caption that the user entered using the length method.

        System.out.println("The character in the fourth subscript location of your caption is " + caption.charAt(4) + ".");
        //Prints the character in the fourth subscript location of the caption entered by using the "charAt" method.

    }
}