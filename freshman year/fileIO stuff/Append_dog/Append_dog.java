
import java.util.Scanner;
//import Scanner
import java.io.*;
//imports file class
/**
 * Name: Humna Sultan
 * Program Name: 7.3 Append
 * Date: 20 March 2018
 * Extra Thing: Appends additional info (duck)
 */
public class Append_dog {
    //class name
    public static void main(String[] args) {
    //main method

        String name1, name2, name3, duckst;
        int age1, age2, age3, agedu;
        FileWriter fw;
        PrintWriter pw;
        //declaring

        try
        //try
        {
            fw= new FileWriter("src/Dog.txt", true);
            pw= new PrintWriter(fw);
            name1 = "Beatrice";
            name2 = "Tasha";
            name3 = "Patty";
            age1 = 3;
            age2 = 4;
            age3= 1;
            duckst = "Billy has a duck named Floofers whose age is ";
            agedu = 62;
            //extra
            //initializing

            pw.println();
            pw.println(name1 + " " + age1);
            pw.println(name2 + " " + age2);
            pw.println(name3 + " " + age3);
            pw.println(duckst + agedu + " years.");
            //extra
            //printing

            pw.close();
            //closes printwriter
        }

        catch (IOException e)
        //catch
        {
            System.out.println(e.getMessage());
            //runs try
        }

    }
}
