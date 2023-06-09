
import java.util.Scanner;
//imports scanner
public class Tictac {
    /**
     * Name: Humna Sultan
     * Program Name: 8.19 TicTacToe
     * Date: 14 May 2019
     * Extra Thing: Allows user to put in rows and columns
     starting at 1 instead of 0 (substring numbers)
     */
    public static void main(String[] args) {
    //main method
        Scanner in = new Scanner (System.in);
        //calls scanner

        char[][] grid = {{'B','B', 'B'}, {'B','B', 'B'}, {'B','B', 'B'} };
        //declares grid
        //'B' represents blank spots

        System.out.println("------TIC TAC TOE------");
        System.out.println("Follow the instructions given to you! " +
                "Grab another player in order to play! The youngest player goes first (X's)! Have fun :)");

        System.out.println("The 'B''s shown in the board represent blank spaces for play!");

        System.out.println("******************************");
        //heading and instructions

        System.out.println();
        //skips line

        welcome(grid);
        //calls game method

        boolean exes = false;
        boolean ooos = false;
        //booleans for determining winner from winner method
        boolean one = checkForWinner1(grid, exes);
        boolean two = checkForWinner2(grid, ooos);
        //calls winner methods

        System.out.println("-----------------------");
        //border

        if (one == false && two == false)
        {
            System.out.println("The game was a draw!");
        }
        if (one == true && two == false)
        {
            System.out.println("Player X wins!");
        }
        if (one == false && two == true)
        {
            System.out.println("Player O wins!");
        }
        if (one == true && two == true)
        {
            System.out.println("Both players win!");
        }
        //determines winners based on booleans used in winner methods
    }
    public static void welcome(char[][] grid)
    //method for game
    {
        Scanner in = new Scanner (System.in);
        //scanner call
        int num = 1;
        int row = 0;

        int col = 0;
        //declares variables
        for (int i = 0; i<= 8; i++)
        {
        //for loop for 9 turns that players will take
            if (num%2 == 1)
            //for odd numbers (X's turn)
            {
                System.out.println();
                System.out.println("Player X's Turn");
                System.out.println("What row do you want to put your marker? :: ");

                row = in.nextInt();
                //takes input for row
                //extra starts
                row = row -1;
                //extra: allows for user to put in real values for col and row

                System.out.println("What column do you want to put your marker? :: ");

                col = in.nextInt();
                //takes input for column
                //extra starts
                col = col -1;
                //extra: allows for user to put in real values for col and row

                while (row > 2)
                {
                    System.out.println();
                    System.out.println("That spot is either taken or cannot be on the board! Try again!");

                    System.out.println("Player X's Turn");
                    System.out.println("What row do you want to put your marker? :: ");

                    row = in.nextInt();
                    row = row -1;
                    System.out.println("What column do you want to put your marker? :: ");

                    col = in.nextInt();

                    col = col -1;

                }
                /* makes sure that the user's choice in col and row
                is reasonable (can be in game and is not already taken) */

                while (col > 2)
                {
                    System.out.println();
                    System.out.println("That spot is either taken or cannot be on the board! Try again!");

                    System.out.println("Player X's Turn");
                    System.out.println("What row do you want to put your marker? :: ");

                    row = in.nextInt();
                    row = row -1;
                    System.out.println("What column do you want to put your marker? :: ");

                    col = in.nextInt();
                    col = col -1;
                }
                /* makes sure that the user's choice in col and row
                is reasonable (can be in game and is not already taken) */

                while (grid[row][col] != 'B')
                {
                    System.out.println();
                    System.out.println("That spot is either taken or cannot be on the board! Try again!");

                    System.out.println("Player X's Turn");
                    System.out.println("What row do you want to put your marker? :: ");

                    row = in.nextInt();
                    row = row -1;
                    System.out.println("What column do you want to put your marker? :: ");

                    col = in.nextInt();
                    col = col -1;
                }
                /* makes sure that the user's choice in col and row
                is reasonable (can be in game and is not already taken) */

                grid [row][col] = 'X';
                //prints 'X' if conditions are met

                System.out.println();
                //skips line

                showGameBoard(grid); //calls method for showing grid
            }
            if (num%2 == 0)
            //for even numbers (O's turn)
            {
                System.out.println();
                System.out.println("Player O's Turn");
                System.out.println("What row do you want to put your marker? :: ");

                row = in.nextInt();
                //takes input for row number
                //extra start

                row = row -1;
                //extra: allows for user to put real values for col and row

                System.out.println("What column do you want to put your marker? :: ");

                col = in.nextInt();
                //takes input for col number
                //extra start

                col = col -1;
                //extra: allows for user to put real values for col and row

                while ( row > 2)
                {
                    System.out.println();
                    System.out.println("That spot is either taken or cannot be on the board! Try again!");

                    System.out.println("Player O's Turn");
                    System.out.println("What row do you want to put your marker? :: ");

                    row = in.nextInt();
                    row = row -1;
                    System.out.println("What column do you want to put your marker? :: ");

                    col = in.nextInt();

                    col = col -1;
                }
                /* makes sure that the user's choice in col and row

                is reasonable (can be in game and is not already taken) */

                while (col >2)
                {
                    System.out.println();
                    System.out.println("That spot is either taken or cannot be on the board! Try again!");

                    System.out.println("Player O's Turn");
                    System.out.println("What row do you want to put your marker? :: ");

                    row = in.nextInt();
                    row = row -1;
                    System.out.println("What column do you want to put your marker? :: ");

                    col = in.nextInt();
                    col = col -1;

                }
                /* makes sure that the user's choice in col and row
                is reasonable (can be in game and is not already taken) */

                while (grid[row][col] != 'B')
                {
                    System.out.println();
                    System.out.println("That spot is either taken or cannot be on the board! Try again!");

                    System.out.println("Player O's Turn");
                    System.out.println("What row do you want to put your marker? :: ");

                    row = in.nextInt();
                    row = row -1;
                    System.out.println("What column do you want to put your marker? :: ");

                    col = in.nextInt();
                    col = col -1;
                }
                /* makes sure that the user's choice in col and row
                is reasonable (can be in game and is not already taken) */

                grid [row][col] = 'O';
                //prints 'O' if conditions are met

                System.out.println();
                //skips line
                showGameBoard(grid);
                //calls method for showing board
            }
            num++;
            //adds to num; goes to next increment of for loop
        }
    }
    public static void showGameBoard(char[][] grid)
    {
    //method for showing board

        for (int a = 0; a <3; a++)
        {
            for(int b = 0; b <3; b++)
            {
                System.out.print(grid[a][b] + " ");
            }
            System.out.println();
        }
        //prints game board currently
    }
    public static boolean checkForWinner1(char[][] grid, boolean exes)
    {
    //checking for winner 'X'
        if (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2]

                == 'X')
        {
            exes = true;
        }
        if (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0]

                == 'X')
        {
            exes = true;
        }

        if (grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2]

                == 'X')
        {
            exes = true;
        }
        if (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2]

                == 'X')
        {
            exes = true;
        }
        if (grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2]

                == 'X')
        {
            exes = true;
        }
        if (grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0]

                == 'X')
        {
            exes = true;
        }
        if (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1]

                == 'X')
        {
            exes = true;
        }
        if (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2]

                == 'X')
        {
            exes = true;
        }
        /* sets 'exes' to true or false depending on winning
        conditions and whether they are met */

        return exes;
        //returns variable
    }
    public static boolean checkForWinner2(char[][] grid, boolean ooos)
    //checking for winner 'O'
    {
        if (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') {
            ooos = true;
        }
        if (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O') {
            ooos = true;
        }
        if (grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') {
            ooos = true;
        }
        if (grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O') {
            ooos = true;
        }
        if (grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O') {
            ooos = true;
        }
        if (grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O') {
            ooos = true;
        }
        if (grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O') {
            ooos = true;
        }
        if (grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O') {
            ooos = true;
        }
        return ooos;
        //sets 'exes' to true or false depending on winning conditions and whether they are met
    }
}