package dataBasics;

//Humna Sultan
//CompSci 9 A
//Data Basics Exercises
//Data Basics Six

import java.util.Scanner;
public class DataBasicsSix {
    public static void main(String[] args) {
        String name, color, animal;
        Scanner in = new Scanner (System.in);
        System.out.println("What is your name? ");
        name = in.nextLine();
        System.out.println("What is your favorite color? ");
        color = in.nextLine();
        System.out.println("*****************************");
        System.out.println(name + ", did you ever think of dying your hair " + color + "?");
        System.out.println("----------------------------------");
        System.out.println("What is your favorite animal? ");
        animal = in.nextLine();
        System.out.println("*****************************");
        System.out.println(name + ", have your ever thought about owning a " + animal + "?");

        System.out.println("----------------------------------");

    }
}