package FruitStand;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 7 Fruit Stand Lab
 * Date: 22 October 2020
 * Extra: Watermelon message in FruitStand.java
 */
public class Fruit {
    String name;
    int qu;
    //instance variables
    /**
     * function for setting values to instance variables
     * @param fruitname: name of fruit that user entered
     * @param quantity: quantity of fruit that user entered
     */
    public Fruit(String fruitname, int quantity)
    {
        name = fruitname;
        qu = quantity;
    }

    /**
     * method that returns values for name and quantity of fruit object
     * @return String: returns name of fruit and quantity
     */
    public String toString()
    {
        return name + " " + qu;
    }

}