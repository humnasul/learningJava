package FruitStand;
import java.util.ArrayList;
//imports arraylist
import java.util.Scanner;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 7 Fruit Stand Lab
 * Date: 22 October 2020
 * Extra: Watermelon message in FruitStand.java
 */
public class FruitStand {
    String fname;
    int q;
    //instance variables for use
    /**
     * main function: contains asking user, printing, etc.
     */
    public static void main(String[] args)
    {
        String n = "";
        int nq = 0;
        int tq = 0;
        String val = "";
        int count = 0;
        ArrayList<Fruit> basket = new ArrayList<Fruit>();
        //initializes + declares variables for use

        Scanner in = new Scanner(System.in);
        //scanner
        do {
            System.out.println("Enter a fruit name: ");
            n = in.nextLine();
            System.out.println("Enter a quantity: ");
            nq = in.nextInt();
            in.nextLine();
            tq++;
            //asks user for info and stores
            basket.add(new Fruit(n, nq));
            //adds object to basket arraylist
            System.out.println("Continue shopping? y/n");
            val = in.nextLine();
            //asks whether to continue shopping; evaluated in while condition
        } while (!val.equalsIgnoreCase("N"));
        //does while the user agrees to continue
        for (int i = 0; i < basket.size(); i++)
        {
            Fruit c = basket.get(i);
            System.out.println(c.toString());
            //calls method in fruit.java for printing
            if ((c.name).equalsIgnoreCase("Watermelon"))
            {
                count++;
            }
            //extra; adds to variable if user buys watermelon
        }
        //for loop for printing
        if (count > 0)
        {
            System.out.println("Congratulations! You get free chocolate! Nice choice!");
        }
        //extra; prints special message if user buys watermelon

    }
}