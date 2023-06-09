
/**
 * Name: Humna Sultan
 * Program Name: 8.8 Proj Data Sort
 * Date: 22 April 2019
 * Extra Thing: Gives the user the option of viewing a list
 organized by street names in data; prints the lists of only what
 the user asks for (zip codes are individually coded into a
 separate array and then are printed)
 */
import java.util.Scanner;
//scanner
public class DataSel {
    //class name
    public static void main(String[] args) {
    //main method
        Scanner in = new Scanner(System.in);
        //scanner calling/naming

        String names[] = {"Barney Fife", "Luke Skywalker", "Cruella Deville",
                "Sally Smith", "Marsha Brady", "Gomez Addams", "John Adams",
                "Marie Antoinette", "Albert Einstein", "Mick Jagger",
                "Mickey Mouse"};
        String adre[] = {"10 Warbler Rd.", "R2 Death Star Ave.",
                "123 Witchey Way", "3862 Street Blvd.", "1970 Groovy Street",
                "1 Spooky Circle", "3445 Presidential Plaza", "2 Rue Morgue",
                "7 Relativity Rd.", "100 Rolling Stone Path", "2 Disney Lane"};
                String city[] = {"Mountainville, SC 34765", "Jupiter, MD44623",
                        "Hollywood, CA 12345", "Springfield, IL 31733",
                        "Arlington, VA 51266", "Tombstone, AZ 63341", "New York, NY 11220",
                        "New Orleans, LA 25993", "Topeka, KS 63121", "Seattle, WA 23733",
                        "Orlando, FL 72272"};
        //variables with data

            String [] last = new String [11];
            String [] street = new String [11];
            String[] nacity = new String [11];
            String[] zip = new String [11];
            int[] zip2 = new int [11];
            //new variables that will store altered forms of data
            int index = 0;
            //declaring variable for use when declaring what new arrays are equal to

            for (int i = 0; i <= 10; i++)
            {
                index = names[i].indexOf(" ");
                last[i] = names[i].substring(index+1);
            }
            //makes array 'last' equal to the last names in the data

            for (int i = 0; i <= 10; i++)
            {
                index = adre[i].indexOf(" ");
                street[i] = adre[i].substring(index+1);
            }
            //makes array 'street' equal to the street names in the data
            //extra

            for (int i = 0; i <= 10; i++)
            {
                index = city[i].indexOf(",");

                nacity[i] = city[i].substring(0, index);
            }
            //makes array 'nacity' equal to the names of the cities in the data

            for (int i = 0; i <= 10; i++)
            {
                index = city[i].indexOf(",") + 4;
                zip[i] = city[i].substring(index + 1);
            }
            //makes array 'zip' equal to the zip codes in the data

            for (int i = 0; i <= 10; i++) {
                int num2 = Integer.parseInt(zip[i]);
                zip2[i] = num2;

            }
            /* takes array 'zip' and transfers all of the individual
            elements into integers; places all integers into new array 'zip2' */
            System.out.println("\nChoose One: \n1. View alphabetical "
                            + "list by last name\n2. View list sorted by name of street\n3. "
                           + "View list sorted by name of city\n4. View list sorted by zip code ");
            int val = in.nextInt();
            //asks user for which list they want to view

        switch (val)
        //switch statement for options that user picks
            {
                case 1: {
                    System.out.println("\nHere is the list:: ");
                    alpha(last);
                    //orders array 'last' into alphabetical order
                    for(int i = 0; i <= 10; i++)
                    {
                        System.out.println(last[i]);
                    }
                    //prints each element in ordered array

                    break;
                }
                //case for when user selects one
                case 2: {
                    System.out.println("\nHere is the list:: ");
                    alpha2(street);
                    //orders array 'street' into alphabetical order
                    for(int i = 0; i <= 10; i++)
                    {
                        System.out.println(street[i]);
                        //prints each element in ordered array
                    }
                    break;
                }
                //case for when user selects two
                case 3: {
                    System.out.println("\nHere is the list:: ");
                    alpha3(nacity);
                    //orders array 'nacity' into alphabetical order
                    for(int i = 0; i <= 10; i++)
                    {
                        System.out.println(nacity[i]);
                    }
                    //prints each element in ordered array
                    break;
                }
                //case for when user selects three
                case 4: {
                    System.out.println("\nHere is the list:: ");
                    ascend(zip2);
                    //orders array 'zip2'(zip codes in integer form array) into ascending order
                    for(int i = 0; i <= 10; i++)
                    {
                        System.out.println(zip2[i]);
                        //prints each element in ordered array
                    }
                    break;
                }
            }
        }
        public static void alpha( String last [ ] )
        {
            int i, j;
            String temp;
            for ( i = 0; i < last.length - 1; i++ )
            {
                for ( j = i + 1; j < last.length; j++ )
                {
                    if ( last [ i ].compareToIgnoreCase( last [ j ] ) > 0
                    )
                    {
                        temp = last [ i ];
                        last [ i ] = last [ j ]; // swapping
                        last [ j ] = temp;
                    }
                }
            }
        }
        //method for making array 'last' in alphabetical order; is called in switch
        public static void alpha2( String street [ ] )
        {
            int i, j;
            String temp;
            for ( i = 0; i < street.length - 1; i++ )
            {
                for ( j = i + 1; j < street.length; j++ )
                {
                    if ( street [ i ].compareToIgnoreCase( street [ j ] ) > 0
                    )
                    {
                        temp = street [ i ];

                        street [ i ] = street [ j ]; // swapping
                        street [ j ] = temp;
                    }
                }
            }
        }
        //method for making array 'street' in alphabetical order; is called in switch
        public static void alpha3( String nacity [ ] )
        {
            int i, j;
            String temp;
            for ( i = 0; i < nacity.length - 1; i++ )
            {
                for ( j = i + 1; j < nacity.length; j++ )
                {
                    if ( nacity [ i ].compareToIgnoreCase( nacity [ j ] ) > 0
                    )
                    {
                        temp = nacity [ i ];
                        nacity [ i ] = nacity [ j ]; // swapping
                        nacity [ j ] = temp;
                    }
                }
            }
        }
        //method for making array 'nacity' in alphabetical order; is called in switch
        public static void ascend ( int zip2[] )
        {
            int i, j, temp;
            for ( i = 0; i < zip2.length - 1; i ++ )
            {
                for ( j = i + 1; j < zip2.length; j ++ )
                {
                    if( zip2[ i ] > zip2[ j ] ) //sorting into descending order
                    {

                        temp = zip2[ i ]; //swapping
                        zip2[ i ] = zip2[ j ];
                        zip2[ j ] = temp;
                    }
                }
            }
        }
        //method for making array 'zip2' in ascending number order; is called in switch
    }
