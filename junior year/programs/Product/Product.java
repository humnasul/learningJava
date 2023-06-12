package Product;

/**
 * Name: Humna Sultan
 * Program Name: Chap. 3 P3.7
 * Date: 23 September 2020
 * Extra: N/A
 */

public class Product {

    String name;
    double price;
    double reduce;
    //instance variables

    /**
     MAIN METHOD: creates object for testing
     */
    public static void main(String[] args)
    {
        Product test = new Product("Toaster", 29.95, 5);
        System.out.println(test.getName());
        System.out.println(test.getPrice());
        System.out.println(test.reducePrice());

    }

    /**
     method that returns name
     @return name: returns name from function for use
     */
    public String getName()
    {
        return name;
    }

    /**
     method that returns price
     @return getPrice: returns price from function for use
     */
    public double getPrice()
    {
        return price;
    }

    /**
     method that reduces price and returns
     @return price: returns price after reducing
     */
    public double reducePrice()
    {
        price = price - reduce;
        return price;
    }

    /**
     method that takes parameters and puts values into instance variables
     @param n: value that user inputs when declaring constructor, used to set instance variables
     @param p: value that user inputs when declaring constructor, used to set instance variables
     @param rp: value that user inputs when declaring constructor, used to set instance variables
     */
    public Product(String n, double p, double rp)
    {
        name = n;
        price = p;
        reduce = rp;
    }
}

