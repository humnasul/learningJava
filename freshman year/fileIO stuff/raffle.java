
import java.io.*;
import java.util.Scanner;
//importing
public class raffle {
//class name
    /**
     * Name: Humna Sultan
     * Program Name: 8.20 Torn Raffle
     * Date: 16 April 2019
     * Extra Thing: randomly decides raffle ticket winner
     */
    public static void main(String[] args){
    //main method
        String name1, name2;
        int num1, num2;
        //declare variables

        String[] lastname_txt = new String[25];
        int[] lastnum_txt = new int[25];
        String[] firstname_txt = new String[25];
        int[] firstnum_txt = new int[25];
        //declare arrays

        File file;
        File file2;
        File file3;
        File file4;
        //declare file vars

        Scanner in;
        Scanner in2;
        Scanner in3;
        Scanner in4;
        //declare different scanners

        try
        //try
        {
            file = new File("src/lastname.txt");
            in = new Scanner(file);
            //setting file and in equal
            for (int i = 0; i <25; i++)
            {
                if(in.hasNext())
                //if statement that checks if there is more text
                {
                    lastname_txt[i] = in.nextLine();
                }
            }
            file2 = new File("src/lastnum.txt");
            in2 = new Scanner(file2);
            //setting file and in equal
            for ( int i = 0; i < 25; i++)
            //for loop
            {
                if(in2.hasNext())
                //if statement that checks if there is more text
                {
                    lastnum_txt[i] = in2.nextInt();
                }
            }
            file3 = new File("src/firstname.txt");
            in3 = new Scanner(file3);
            //setting file and in equal
            for ( int i = 0; i < 25; i++)
            //for loop
            {
                if(in3.hasNext())
                //if statement that checks if there is more text
                {
                    firstname_txt[i] = in3.nextLine();
                }
            }
            file4 = new File("src/firstnum.txt");
            in4 = new Scanner(file4);
            //setting file and in equal
            for ( int i = 0; i < 25; i++)
            //for loop
            {
                if(in4.hasNext())
                //if statement that checks if there is more text
                {
                    firstnum_txt[i] = in4.nextInt();
                }
            }
        }
        catch(FileNotFoundException error)
        //catch
        {
            System.out.println(error.getMessage());
            //runs try
        }
        int j;
        boolean flag = true; // set flag to true to begin first pass
        int temp; //holding variable
        String temp2;

        while ( flag )
        {
            flag= false; //set flag to false awaiting a possible swap
            for( j = 0; j < lastnum_txt.length -1; j++ )
            {
                if ( lastnum_txt[ j ] < lastnum_txt[ j+1] ) // change to > for ascending sort
                {
                    temp = lastnum_txt[ j ]; //swap elements
                    lastnum_txt[ j ] = lastnum_txt[ j+1 ];
                    lastnum_txt[ j+1 ] = temp;
                    temp2 = lastname_txt[ j ]; //swap elements
                    lastname_txt[ j ] = lastname_txt[ j+1 ];
                    lastname_txt[ j+1 ] = temp2;
                    flag = true; //shows a swap occurred
                }
            }
        }
        //descending order sort fror last arrays

        flag = true;
        while ( flag )
        {
            flag= false; //set flag to false awaiting a possible swap
            for( j = 0; j < firstnum_txt.length -1; j++ )
            {
                if ( firstnum_txt[ j ] < firstnum_txt[ j+1] ) // change to > for ascending sort
                {
                    temp = firstnum_txt[ j ]; //swap elements
                    firstnum_txt[ j ] = firstnum_txt[ j+1 ];
                    firstnum_txt[ j+1 ] = temp;
                    temp2 = firstname_txt[ j ]; //swap elements
                    firstname_txt[ j ] = firstname_txt[ j+1 ];
                    firstname_txt[ j+1 ] = temp2;
                    flag = true; //shows a swap occurred
                }

            }
        }
        //descending order sort for first arrays

        for (int l = 0; l < 25; l++)
        {
            String na = firstname_txt[l];
            int first = firstnum_txt[l];
            String lana = lastname_txt[l];
            int last = lastnum_txt[l];
            System.out.println(first + " " + na + "---" + lana + " " + last);
        }
        //prints out names of all people

        int val = (int) (Math.random() *100 + 0);
        //extra
        //randomly determines raffle ticket winner

        System.out.println();
        System.out.println("The winning number is " + val + "! A message will print if someone won!");
        //prints winning value

        for (int i = 0; i < 25; i++)
        {
            int win = lastnum_txt[i];
            if (win == val)
            {
                System.out.println(firstname_txt[i] + " " +

                        lastname_txt[i] + " wins the raffle!");

            }
        }
        //checks to see if anyone won raffle
    }

}
