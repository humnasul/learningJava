package Geometry;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 8 Static Methods Lab
 * Date: 29 October 2020
 * Extra: Calculates area of a circle
 */
public class Geometry {
    /**
     * function for calculating sphere volume
     * @param r: radius that user entered
     * @return v: returns calculated volume
     */
    public static double sphereVolume(double r)
    {
        double v = (1.333)*(Math.PI)*(Math.pow(r, 3));
        return v;
    }
    /**
     * function for calculating sphere surface area
     * @param r: radius that user entered
     * @return sa: returns calculated surface area
     */
    public static double sphereSurface(double r)
    {
        double sa = (4)*(Math.PI)*(Math.pow(r, 2));
        return sa;
    }

    /**
     * function for calculating cylinder volume
     * @param r: radius that user entered
     * @param h: height that user entered
     * @return v: returns calculated volume
     */
    public static double cylinderVolume(double r, double h)
    {
        double v = (Math.PI)*(Math.pow(r, 2))*h;
        return v;
    }
    /**
     * function for calculating cylinder surface area
     * @param r: radius that user entered
     * @param h: height that user entered
     * @return sa: returns calculated surface area
     */
    public static double cylinderSurface(double r, double h)
    {
        double sa = ((2)*(Math.PI)*(r)*(h)) + ((2)*(Math.PI)*(Math.pow(r, 2)));
        return sa;
    }
    /**
     * function for calculating cone volume
     * @param r: radius that user entered
     * @param h: height that user entered
     * @return v: returns calculated volume
     */
    public static double coneVolume(double r, double h)
    {
        double v = (Math.PI)*(Math.pow(r, 2))*(h/3);
        return v;
    }
    /**
     * function for calculating cone surface area
     * @param r: radius that user entered

     * @param h: height that user entered
     * @return sa: returns calculated surface area
     */
    public static double coneSurface(double r, double h)
    {
        double sa = ((Math.PI)*(r));
        double calc = r + (Math.sqrt((Math.pow(h, 2))+(Math.pow(r, 2))));
        sa = sa*calc;
        return sa;
    }
    /**
     * function for calculating circle area
     * @param r: radius that user entered
     * @return a: returns calculated area
     */
    public static double area(double r)
    {
        double a = (Math.PI)*(Math.pow(r, 2));
        return a;
    }
//extra
}