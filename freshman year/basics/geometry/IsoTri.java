package geometry;

/**

 * Name: Humna Sultan
 * Program Name: 5.4 Geometric
 * Date: 18 January 2019
 * Extra Thing: N/A
 */
public class IsoTri {
    //class name
    public static void main(String[] args) {
    //main class
        make();
    }
    public static void make()
    {
        for(int count = 1; count <= 5; count++){
            for (int countTwo = count; countTwo < 5;

                 countTwo++){

                System.out.print(" ");
            }
            for(int countTwo = 1;
                countTwo<=(2*count-1);countTwo++){
                System.out.print("&");
            }
            System.out.println("");
        }
    }
    //method that prints iso tri
}