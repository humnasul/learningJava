package FileAnalyzer1;

/**
 * Name: Humna Sultan
 * Program Name: P11.1
 * Date: 11 January 2021
 * Extra: offers free zebra if character count > 20
 */

import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileCounter1
{
    /**
     Construct a FileCounter object.
     */
    public int word = 0;
    public int cha = 0;
    public int line = 0;

    public FileCounter1()
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
        return line;
    }

    /**
     Gets the number of characters in this counter.
     @return the number of characters
     */
    public int getCharacterCount()
    {
        if (cha > 20)
        {
            System.out.println("You have more than 20 words, you get a free zebra!");
        }
        return cha;
    }

}

