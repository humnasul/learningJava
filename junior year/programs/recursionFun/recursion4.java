package recursionFun;

/**
 * Name: Humna Sultan
 * Program Name: recursion fun lab #4
 * Date: 21 January 2021
 * Extra: n/a
 */

public class recursion4 {
    public static void main(String[] args) {
        System.out.println(countChickens("chickenbounciechicken"));
    }
    //main method that calls and prints return from method

    public static int countChickens(String bigString)
    {
        String word = "chicken";
        int length = 7;
        int x = 0;

        if(bigString.length() >= length)
        {
            if(bigString.equals(word))
            {
                return 1;
            }
            else if (bigString.contains(word))
            {
                return 1 + countChickens(bigString.substring(bigString.indexOf(word) + word.length()));
            }
            else
            {
                return 0;
            }

        }
        else
        {
            return 0;
        }
    }
    //method that finds 'chicken' string in given string
}