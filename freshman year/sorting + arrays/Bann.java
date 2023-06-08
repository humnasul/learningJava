
public class Bann {
//class name
    /**
     * Name: Humna Sultan
     * Program Name: 8.12
     * Date: 29 April 2019
     * Extra Thing: Prints names in banner format (#4; there is
     a gap between every word)
     */
    public static void main(String[] args) throws
            InterruptedException
    {
    //main method
        String message = "The Matrix is a movie";
        for (int k=0; k < message.length(); k++)
        {
            System.out.print(message.charAt(k)+ " ");
            Thread.sleep (500);
        }
        Thread.sleep (2000);
        //prints in banner format

        System.out.println();

        System.out.println("******************************");
        //border

        String message2 = "The Matrix has you.";
        for (int k=0; k < message2.length( ); k++)
        {
            System.out.print(message2.charAt(k)+ " ");
            Thread.sleep (500);
        }
        Thread.sleep (2000);

        System.out.println();
        //prints in banner format with separation

        String message3 = "Follow the white rabbit.";
        for (int k=0; k < message3.length( ); k++)
        {
            System.out.print(message3.charAt(k)+ " ");
            Thread.sleep (500);
        }
        Thread.sleep (2000);

        System.out.println();
        //prints in banner format with separation
        String message4 = "Knock, knock, Neo.";
        for (int k=0; k < message4.length( ); k++)
        {
            System.out.print(message4.charAt(k)+ " ");
            Thread.sleep (500);
        }
        Thread.sleep (2000);

        System.out.println();
        //prints in banner format with separation
        System.out.println("******************************");
        //border

        String name = "Keanu Reeves";
        int comm = name.indexOf(" ");
        for (int k=comm+1; k < name.length( ); k++)
        {
            System.out.print(name.charAt(k)+ " ");
            Thread.sleep (500);
        }
        //prints last name
        System.out.print(", ");
        //adds comma
        for (int k=0; k < comm; k++)
        {
            System.out.print(name.charAt(k)+ " ");
            Thread.sleep (500);
        }
        //prints first name
        System.out.println();

        System.out.println("******************************");
        //border
        String last = "Matrix Reloaded";
        for (int k=0; k < last.length(); k++)
        {
            System.out.print(last.charAt(k)+ " ");
            Thread.sleep (500);
        }
        //prints 'Matrix Reloaded'

        System.out.println();
        System.out.println();
        //2 spaces
        System.out.println("-------------------------------------");
        //border for sorted names

        String[] arr = {"Neo", "Morpheus", "Trinity", "Smith", "Mouse", "Cypher"};
        //array
        sortStringBubble(arr);
        //calls alphabetical sorting method
        for (int k=0; k < 6; k++)
        {
            System.out.print(arr[k] + "--");
            Thread.sleep (500);
        }
        System.out.println();
        //prints each word in array with a time gap

    }
    public static void sortStringBubble( String arr [ ] )
    //alphabetical sorting method for array

    {
        int j;
        boolean flag = true; //to determine finished
        String temp;
        while ( flag )
        {
            flag = false;
            for ( j = 0; j < arr.length - 1; j++ )
            {
                if ( arr [ j ].compareToIgnoreCase( arr [ j+1 ] ) > 0
                )
                { // ascending sort
                    temp = arr [ j ];
                    arr [ j ] = arr [ j+1 ]; //swapping
                    arr [ j+1] = temp;
                    flag = true;
                }
            }
        }

    }
}
