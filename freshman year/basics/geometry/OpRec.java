package geometry;

/**
 * Name: Humna Sultan
 * Program Name: 5.4 Geometric
 * Date: 18 January 2019
 * Extra Thing: N/A
 */
public class OpRec {
    //class name
    public static void main(String[] args)
    //main method
    {
        line();
        rec();
        line();
        //call for other methods
    }
    public static void rec()
    {
        for (int l = 2; l >= 0; l--)
        {
            System.out.print("&");

            for (int u = 5; u >= 0; u--)
            {
                System.out.print(" ");

                if (u == 0)
                {
                    System.out.print("&");
                    System.out.println();
                }

            }
        }
    }
    //method that prints middle of rectangle
    public static void line()
    {
        for (int i = 0; i < 2; i++)
        {
            int e = 8;
            for (int o = 0; i < e; i++)
            {
                System.out.print("&");
            }

        }
        System.out.println();
    }
    //prints the bottom and top of rectangle
}
