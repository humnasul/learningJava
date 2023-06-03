package dataBasics;

//Humna Sultan
//CompSci 9 A
//Data Basics Exercises
//Data Basics Activity #1

import java.util.Scanner;
public class DataBasicsOne
{
    public static void main(String[] args)
    {
        int year, score, leftover;
        Scanner key = new Scanner (System.in);
        System.out.println("Enter Year:");
        year = key.nextInt();
        score = year/20;
        leftover = year%20;
        System.out.println(score + " score and " + leftover + " years");
        System.out.println("(According to the U.S. Declaration Of Independence, a score is 20 years)");
        System.out.println("********************************************************");
    }
}