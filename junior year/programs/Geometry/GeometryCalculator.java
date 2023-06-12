package Geometry;
import java.util.Scanner;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 8 Static Methods Lab
 * Date: 29 October 2020
 * Extra: Calculates area of a circle
 */
public class GeometryCalculator {
    /**
     * main function: contains asking user, printing, etc.

     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //declares scanner for use

        System.out.println("Enter a value for the radius :: ");
        double r = in.nextDouble();
        System.out.println("Enter a value for the height :: ");
        double h = in.nextDouble();
        //asks user for information

        System.out.println("Sphere Volume: " + Geometry.sphereVolume(r));
        System.out.println("Sphere Surface Area: " + Geometry.sphereSurface(r));
        System.out.println("Cylinder Volume: " + Geometry.cylinderVolume(r, h));
        System.out.println("Cylinder Surface Area: " + Geometry.cylinderSurface(r, h));
        System.out.println("Cone Volume: " + Geometry.coneVolume(r, h));
        System.out.println("Cone Surface Area: " + Geometry.coneSurface(r, h));
        //prints method calls
        System.out.println("Area of Circle: " + Geometry.area(r));
        //extra
    }
}