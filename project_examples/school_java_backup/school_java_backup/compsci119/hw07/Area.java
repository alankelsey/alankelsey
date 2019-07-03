//Alan Kelsey
//alankelsey@u.boisestate.edu
//


public class Area 
{

    public static double triangle(double base, double height)
    {
        
        //begin area of a triangle A=(bh)/2
        double area = (base * height) / 2.0;
        return area; 
    }

    public static double square(double side)
    {
        //begin area of a square A=s^2
        double area = side * side;
        return area;
    }

    public static double rectangle(double base, double height)
    {
        //begin area of a rectangle A=bh
        double area = base * height;
        return area;
        
    }

    public static double trapezoid(double height, double longerSide, 
        double shorterSide)
    {
        //begin area of a trapezoid A=(h(l+s))/2
        double area = (height * (longerSide + shorterSide)) / 2;
        return area;
        
    }

    public static double pentagon(double side)
    {
        //begin area of a pentagon A=1.720s^2
        double area = 1.720 * (side * side);
        return area;
    }

    public static double hexagon(double side)
    {
        //begin area of a hexagon A=2.598s^2
        double area = 2.598 * (side * side) ;
        return area;
    }

    public static double octagon(double side)
    {
        //begin area of a octagon A=4.828s^2
        double area = 4.828 * (side * side) ;
        return area;
    }

    public static double circle(double radius)
    {
        //begin area of a circle A=(pi)r^2
        double pi = 3.1416;
        double area = pi * (radius * radius);
        return area;
    }

}
