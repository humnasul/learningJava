/**
 * Name: Humna Sultan
 * Program Name: Monster Lab
 * Date: 5 October 2019
 * Extra: Asks for favorite colors of monsters 1 and 2 and
 compares
 */
package monster;
//package
public class Monster {
    //class name
    public Monster() {
    }
    //constructor
    public static void getInfo(int size1, String name1, int size2, String name2, String color1, String color2)
    {
        System.out.println("Monster 1 - " + name1 + " " + size1 + " " + color1);

        System.out.println("Monster 2 - " + name2 + " " + size2 + " " + color2);
    }
    //method for printing info about monsters

    public static void compareSize(int size1, int size2)
    //compares size of monsters
    {
        if (size1 > size2)
        {
            System.out.println("Monster one is bigger than Monster two.");
        }
        //if first mon is bigger than second mon
        if (size1 < size2)
        {
            System.out.println("Monster one is smaller than Monster two.");
        }
        //if first mon is smaller than second mon
        if (size1 == size2)
        {
            System.out.println("The monsters are the same size.");
        }
        //if mons' sizes are equal
    }
    public static void compareName(String name1, String name2)
    //compares names of monsters
    {
        if (name1.equalsIgnoreCase(name2))
        {
            System.out.println("Monster one has the same name as Monster two.");
        }
        //if names are the same
        else
        {
            System.out.println("Monster one does not have the same name as Monster two.");
        }
        //if names are not the same
    }
    public static void compareColor(String c1, String c2)
    //compares fav colors of monsters
    //extra
    {
        if (c1.equalsIgnoreCase(c2))
        {
            System.out.println("Monster one has the same favorite color as Monster two.");
        }
        //if colors are the same
        else
        {
            System.out.println("Monster one does not have the same favorite color as Monster two.");
        }
        //if colors are different
    }
    //extra
}
