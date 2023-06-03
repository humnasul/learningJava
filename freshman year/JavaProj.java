import java.text.*;
import java.util.Scanner;
public class JavaProj {
    /**
     * Name: Humna Sultan
     * Program Name: "Mid term" program
     * Date: 14 February 2019
     * Extra Thing: N/A
     */
    public static void main(String[] args) {
        //main method
        int coll, ans;
        //integer variables
        Scanner in = new Scanner(System.in);
        //calling for scanner
        DecimalFormat decFor = new DecimalFormat("0.00");
        //calling for decimal format
        for (int b = 0; b < 7; b++){
            for(int a = 0; a < b; a++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---SHOPRITE---");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<i;j++)

            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //printing name of company and design
        OfNames();
        //calling other method
    }
    public static void OfNames()
    {
        System.out.println("Company Officers: ");
        System.out.println("Officer Sanay");
        System.out.println("Officer Code");
        System.out.println("Officer Patrick");
        System.out.println("Officer CompSci");
        buying();
        //calling other method
    }
    public static void products()
    {
        System.out.println(" Here are the products available: ");
        System.out.println(" Product Service Price Per Unit");
        System.out.println(" 1.Potatoes N/A $4.99 per bag of 6");
        System.out.println(" 2.Chocolate Ice Cream N/A $2.99 per pint");
        System.out.println(" 3.Eclairs N/A $3.50 per box of 4");
        System.out.println(" 4.Noodles N/A $1.99 per box");
        System.out.println(" 5.Salmon N/A $10.99 per fish");
    }
    public static void buying()
    {
        Scanner in = new Scanner(System.in);

        //calling for scanner in method
        products();
        //calling other method
        System.out.println("Which product would you like to buy? Enter the product number :: ");
        int num = in.nextInt();
        while (num != 1 && num!= 2 && num!= 3 && num != 4 && num != 5)
        {
            System.out.println("You didn't enter an option! Try again!");
            System.out.println("Which product would you like to buy? Enter the product number :: ");
            num = in.nextInt();
        }
        //error trap
        if (num == 1)
        {
            String pro = "bag(s) of potatoes";
            System.out.println("How many of the product do you want to buy?");
            int many = in.nextInt();
            System.out.println("You have purchased " + many + " " + pro + ".");
            cost(many, num);
            //calling other method
        }
        if (num == 2)
        {
            String pro = "pint(s) of chocolate ice cream";
            System.out.println("How many of the product do you want to buy?");
            int many = in.nextInt();
            System.out.println("You have purchased " + many + " " + pro + ".");
            cost(many, num);
            //calling other method
        }
        if (num == 3)
        {
            String pro = "box(es) of eclairs";
            System.out.println("How many of the product do you want to buy?");
            int many = in.nextInt();
            System.out.println("You have purchased " + many + " " + pro + ".");
            cost(many, num);
            //calling other method
        }
        if (num == 4)
        {

            String pro = "box(es) of noodles";
            System.out.println("How many of the product do you want to buy?");
            int many = in.nextInt();
            System.out.println("You have purchased " + many + " " + pro + ".");
            cost(many, num);
            //calling other method
        }
        if (num == 5)
        {
            String pro = "salmon fish(es)";
            System.out.println("How many of the product do you want to buy?");
            int many = in.nextInt();
            System.out.println("You have purchased " + many + " " + pro + ".");
            cost(many, num);
            //calling other method
        }
    //if statements for seprate products
    }
    public static void cost (int many, int num)
    {
        DecimalFormat decFor = new DecimalFormat("0.00");
        //calling for decimal format
        if (num == 1)
        {
            double cos = many*4.99;
            System.out.println("---You owe $" + decFor.format(cos) + ".---");
        }
        if (num == 2)
        {
            double cos = many*2.99;
            System.out.println("---You owe $" + decFor.format(cos) + ".---");
        }
        if (num == 3)
        {
            double cos = many*3.50;
            System.out.println("---You owe $" + decFor.format(cos) + ".---");
        }
        if (num == 4)
        {
            double cos = many*1.99;

            System.out.println("---You owe $" + decFor.format(cos) + ".---");
        }
        if (num == 5)
        {
            double cos = many*10.99;
            System.out.println("---You owe $" + decFor.format(cos) + ".---");
        }
    //if statements for products
        System.out.println("***************************\nTHANK YOU FOR SHOPPING");
    //thank you message before termination of program
    }
}