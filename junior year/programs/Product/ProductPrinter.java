package Product;

/**
 * Name: Humna Sultan
 * Program Name: Chap. 3 P3.7
 * Date: 23 September 2020
 * Extra: N/A
 */

public class ProductPrinter {

    /**
     MAIN METHOD: creates objects for testing
     */
    public static void main(String[] args)
    {
        Product one = new Product("Waffle Maker", 15.99, 5);
        System.out.println("Name: " + one.getName());
        System.out.println("Original Price: $" + one.getPrice());
        System.out.println("Reduced Price: $" + one.reducePrice());

        System.out.println("----------------------------------");

        Product two = new Product("Oven", 157.99, 5);
        System.out.println("Name: " + two.getName());
        System.out.println("Original Price: $" + two.getPrice());
        System.out.println("Reduced Price: $" + two.reducePrice());

    }
}
