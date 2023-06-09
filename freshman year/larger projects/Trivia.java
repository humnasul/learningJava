
import java.util.Scanner;
//import Scanner
import java.io.*;
//imports file class
/**
 * Name: Humna Sultan
 * Program Name: 7.4 Trivial Pursuit
 * Date: 22 March 2018
 * Extra Thing: Includes an extra question
 */
public class Trivia {
    //class name
    public static void main(String[] args) {
        //main method

        int num, i;
        int ans1, ans2, ans3, ans4, ans5, ans6;
        String name;
        Scanner in;
        //declaring variables

        File f = new File("src/TrivQuest.txt");
        //declaring file/initialization

        PrintWriter pw;
        //calls print
        try
        //try
        {
            pw= new PrintWriter(f);
            //creates print-writer
            i = 0;
            num = 1;
            //initialization

            in = new Scanner(System.in);
            //scanner

            while(num == 1)
            {
                i++;
                pw.println("User: " + i);
                pw.println("------------------------------");
                System.out.println("What is your name? :: ");
                name = in.next();
                pw.println("Name: " + name);
                System.out.println("What was the name of Robert " +
                        "E. Lee’s most famous horse? \n1. Bob 2. Traveller 3. Muddy 4. SeaBiscuit :: ");

                ans1 = in.nextInt();
                System.out.println();
                pw.println(ans1);
                System.out.println("Diamonds are made up almost " +
                        "entirely of what element? \n1. Nitrogen 2. Rock 3. Carbon 4. Water :: ");

                ans2 = in.nextInt();
                System.out.println();
                pw.println(ans2);
                System.out.println("Where does Spongebob " +
                        "Squarepants work? :: \n1. Chum Bucket 2. Pizza Planet 3. The " +
                        "Krabby Krust 4. The Krusty Krab :: ");
                ans3 = in.nextInt();
                System.out.println();
                pw.println(ans3);

                System.out.println("Mexican tortillas were " +
                        "originally made from the grain of which plant? :: \n1. Flour 2. "
                        + "Corn 3. Beans 5. Potato :: ");
                ans4 = in.nextInt();
                System.out.println();
                pw.println(ans4);
                System.out.println("What is the world’s largest "
                        + "active volcano? :: \n1. Mauna Loa 2. Krakatoa 3. Mount Etna 4. Mount Merapi :: ");

                ans5 = in.nextInt();
                System.out.println();
                pw.println(ans5);
                System.out.println("What is Nathaniel's favorite " +
                        "color? :: \n1. Blue 2. Green 3. Orange 4. Pickle Green :: ");

                ans6 = in.nextInt();
                System.out.println();
                pw.println(ans6);
                System.out.println("Are there more users? Would " +
                        "you like the questions to be asked again? Answer 1 for yes, 2 for no :: ");

                num = in.nextInt();
                System.out.println();
            }
            //while loop that runs for all users (unknown) and asks questions. Prints answers to file

            pw.close();
            in.close();
            //closes
        }
        catch (FileNotFoundException e)
        //catch
        {
            System.out.println(e.getMessage());
            //runs try
        }

    }
}
