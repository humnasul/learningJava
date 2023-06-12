package FileAnalyzer2;

/**
 * Name: Humna Sultan
 * Program Name: P11.2
 * Date: 11 January 2021
 * Extra: prints message if line number >= 2
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

//import com.sun.java.util.jar.pack.Package.File;

import FileAnalyzer1.FileCounter1;

/**
 This class prints a report on the contents of a number of files.
 */
public class FileAnalyzer2
{
    public static int wsum = 0;
    public static int csum = 0;
    public static int lsum = 0;

    /**
     * main method/class
     * @param: N/A; params are included in object initializations
     */
    public static void main(String[] args)
    {
        try
        {
            boolean go = true;
            while(go)
            {
                System.out.println("Filename: ");
                Scanner in = new Scanner(System.in);
                String name = in.nextLine();
                FileCounter2 counter = new FileCounter2();
                FileReader reader = new FileReader(name);
                Scanner fileIn = new Scanner(reader);

                counter.read(fileIn);
                fileIn.close();

                System.out.println("Characters: " + counter.getCharacterCount());
                System.out.println("Words: " + counter.getWordCount());
                System.out.println("Lines: " + counter.getLineCount());

                wsum = wsum + counter.getWordCount();
                csum = csum + counter.getCharacterCount();
                lsum = lsum + counter.getLineCount();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.out.println("Characters: " + csum);
            System.out.println("Words: " + wsum);
            System.out.println("Lines: " + lsum);
            System.exit(0);
        }
    }
}