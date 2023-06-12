package FileAnalyzer2;

/**
 * Name: Humna Sultan
 * Program Name: P11.2
 * Date: 11 January 2021
 * Extra: prints message if line number >= 2
 */

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 A class to count the number of characters, words, and lines in files.
 */
public class FileCounter2
{

    public int word = 0;
    public int cha = 0;
    public int line = 0;

    /**
     Construct a FileCounter object.
     */
    public FileCounter2()
    {

    }

    /**
     Processes an input source and adds its character, word, and line
     counts to this counter.
     @param in the scanner to process
     */
    public void read(Scanner in)
    {
        while(in.hasNextLine())  {
            line++;
            String lines = in.nextLine();
            cha += lines.length();
            word += new StringTokenizer(lines, " ,").countTokens();
        }
        in.close();
    }

    /**
     Gets the number of words in this counter.
     @return the number of words
     */
    public int getWordCount()
    {
        return word;
    }

    /**
     Gets the number of lines in this counter.
     @return the number of lines
     */
    public int getLineCount()
    {
        if (line >= 2)
        {
            System.out.println("You have greater than or equal to 2 lines! Cool!");
        }
        return line;
    }

    /**
     Gets the number of characters in this counter.
     @return the number of characters
     */
    public int getCharacterCount()
    {
        return cha;
    }


}
