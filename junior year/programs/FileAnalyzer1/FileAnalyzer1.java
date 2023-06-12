package FileAnalyzer1;

/**
 * Name: Humna Sultan
 * Program Name: P11.1
 * Date: 11 January 2021
 * Extra: offers free zebra if character count > 20
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalyzer1
{
    /**
     * main method/class
     * @param: N/A; params are included in object initializations
     */
    public static void main(String[] args) throws IOException
    {
        System.out.println("Filename: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        FileCounter1 counter = new FileCounter1();
        FileReader reader = new FileReader(name);
        Scanner fileIn = new Scanner(reader);
        counter.read(fileIn);
        fileIn.close();
        System.out.println("Characters: " + counter.getCharacterCount());
        System.out.println("Words: " + counter.getWordCount());
        System.out.println("Lines: " + counter.getLineCount());
    }
}
