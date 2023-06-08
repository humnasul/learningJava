
import java.util.Scanner;
//importing
public class Proj_fbi {
//class name

    public static void main(String[] args) {
    //main method
        Scanner in = new Scanner(System.in);
        //calling Scanner
    /**
     * Name: Humna Sultan
     * Program Name: 8.16
     * Date: 8 May 2019
     * Extra Thing: Finds length of person' name for Pink

     Panther and prints accordingly

     */
        String[] names = {"Bowman", "Walker", "Christian",
                "Edwards", "Cummings", "Hapern", "Scott", "Rhinehart", "Haley",
                "Brooks"};
        //array for names of people

        String[] adres = {"Canaan", "Newark", "Hardwick",
                "Montgomery", "Trenton", "Liverpool", "Sheridan", "Houston",
                "Westfield", "Syosset"};
        //array for addresses

        String[] state = {"CT", "NJ", "VT", "AL", "NJ", "NY", "WY", "TX", "NJ", "NY"};
        //array for states

        int[] age = {48, 39, 46, 71, 31, 38, 51, 62, 22, 32};
        //array for ages

        String[] gd = {"M", "F", "M", "M", "M", "F", "M", "F", "F", "M"};
        //array for gender

        int[] salary = {18000, 27000, 59000, 78000, 25000, 45000, 19000, 91000, 33000, 40000};
        //array for salary

        int[]save = {4200, 2600, 1900, 500, 7800, 12000, 400, 53200, 4700, 3900};
        //array for saved money

        String[] car = {"Saturn", "Olds", "Chev", "Chev", "Ford", "Chev", "Ford", "Cad", "Honda", "Ford"};
        //array for type of car

        int[] year = {2009, 2006, 2010, 2013, 2009, 2012, 2008, 2017, 2004, 2011};
        //array for year of car

        //sorting (begin)
        int j;
        boolean flag = true; //to determine finished
        String temp;
        int temp2;
        while ( flag )
        {
            flag = false;
            for ( j = 0; j < names.length - 1; j++ )
            {
                if ( names [ j ].compareToIgnoreCase( names [ j+1 ] ) > 0)
                { // ascending sort
                    temp = names [ j ];
                    names [ j ] = names [ j+1 ]; //swapping
                    names [ j+1] = temp;

                    temp = adres [ j ];
                    adres [ j ] = adres [ j+1 ]; //swapping
                    adres [ j+1] = temp;
                    temp = state [ j ];
                    state [ j ] = state [ j+1 ]; //swapping
                    state [ j+1] = temp;
                    temp2 = age [ j ];
                    age [ j ] = age [ j+1 ]; //swapping
                    age [ j+1] = temp2;
                    temp = gd [ j ];
                    gd [ j ] = gd [ j+1 ]; //swapping
                    gd [ j+1] = temp;
                    temp2 = salary [ j ];
                    salary [ j ] = salary [ j+1 ]; //swapping
                    salary [ j+1] = temp2;
                    temp2 = save [ j ];
                    save [ j ] = save [ j+1 ]; //swapping
                    save [ j+1] = temp2;
                    temp = car [ j ];
                    car [ j ] = car [ j+1 ]; //swapping
                    car [ j+1] = temp;
                    temp2 = year [ j ];
                    year [ j ] = year [ j+1 ]; //swapping
                    year [ j+1] = temp2;
                    flag = true;
                }
            }
        }
        //sorting end

        System.out.println("-----Case 1: Inspector Holmes-----");
        //case 1

        for (int p = 0; p<10; p++)
        //goes for all arrays and subscripts
        {
            String na = names[p];
            String adr = adres[p];
            int ag = age[p];
            String c = car[p];
            int sal = salary[p];
            //sets variables

            if (ag > 30 && sal >20000)
            {
                if (c.equalsIgnoreCase("ford"))
                {
                    System.out.println(na + "- " + adr);
                }
            }
        }
        System.out.println();
        System.out.println("-----Case 2: Inspector Clouseau-----");
        //case 2

        for (int p = 0; p<10; p++)
        //goes for all arrays and subscripts
        {
            String na = names[p];
            int sa = save[p];
            String c = car[p];
            int sal = salary[p];
            //sets variables

            if (sal >15000)
            {
                if (sa < 2000)

                {
                    if (c.equalsIgnoreCase("ford") ||

                            c.equalsIgnoreCase("chev") || c.equalsIgnoreCase("honda"))

                    {
                        System.out.println(na);
                    }
                }
            }
        }

        System.out.println();
        System.out.println("-----Case 3: Inspector Simon-----");
        //case 3
        for (int p = 0; p < 10; p++)
        //goes for all arrays and subscripts
        {
            String na = names[p];
            String c = car[p];
            String gen = gd[p];
            //sets variables
            if (gen.equals("F"))
            {
                System.out.println(na + "- " + c);
            }
        }
        System.out.println();
        System.out.println("-----Case 4: Pink Panther (Undercover)-----");
        //case 4
        for (int p = 0; p < 10; p++)
        //goes for all arrays and subscripts
        {
            String na = names[p];
            String c = car[p];
            String gen = gd[p];
            int ag = age[p];
            String sta = state[p];
            //declares variables

            if (gen.contentEquals("M"))
            {
                if (ag < 35)
                {
                    if (c.equalsIgnoreCase("ford"))
                    {
                        if (sta.equals("NJ"))
                        {
                            System.out.println(na + " fits these qualifications.");
                            //extra
                            System.out.println("The length of " + na + "'s name is " + na.length() + " letters.");
                            if (na.length() == 62)
                            {
                                System.out.println(na + " has a VERY long name!");
                            }
                            //extra
                        }
                    }
                }
            }
        }
    }
}
