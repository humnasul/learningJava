
/**
 * Name: Humna Sultan
 * Program Name: 8.7 Work Sort
 * Date: 19 April 2019

 * Extra Thing: Organizes array in alphabetical order in bubble
 and Exchange (other class)
 */
public class BubAlpha {
    //class name
    public static void main(String[ ] args)
    //main method
    {
        String[ ] alpha = {"a", "g", "k", "j", "t", "i", "f", "s",
                "w", "b"};
        //array
        System.out.println("--------------------------------");
        System.out.println("##Before Sorting##");
        System.out.println("--------------------------------");

        for ( int o = 0; o < 10; o++ )
        {
            System.out.println( alpha [ o ] );
        }
        //prints array before sorting
        sortStringBubble (alpha);
        //calls method for sorting
        System.out.println("--------------------------------");
        System.out.println("##After Sorting##");
        System.out.println("--------------------------------");
        for ( int k = 0; k < 10; k++ )
            System.out.println( alpha [ k ] );
    }
    //prints array after sorting
    public static void sortStringBubble( String x [ ] )
    //sorting method
    {
        int j;
        boolean flag = true; //to determine finished

        String temp;
        while ( flag )
        {
            flag = false;
            for ( j = 0; j < x.length - 1; j++ )
            {
                if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0)
                { // ascending sort
                    temp = x [ j ];
                    x [ j ] = x [ j+1 ]; //swapping
                    x [ j+1] = temp;
                    flag = true;
                }
            }
        }
    }
}
