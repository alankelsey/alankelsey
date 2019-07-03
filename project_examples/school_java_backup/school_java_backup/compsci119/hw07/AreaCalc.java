//Alan Kelsey
//alankelsey@u.boisestate.edu
//


public class AreaCalc 
{
    public static void main(String[] args)
    {
        double returnTriangleArea;
        double returnSquareArea;
        double returnRectangleArea;
        double returnTrapezoidArea;
        double returnPentagonArea;
        double returnHexagonArea;
        double returnOctagonArea;
        double returnCircleArea;


        //Call the triangle method
        returnTriangleArea = triangle(2.0, 3.0);
        System.out.println("Area of a triangle = " + returnTriangleArea);
         
        //call the square method
        returnSquareArea = square(2.0);
        System.out.println("Area of a square = " + returnSquareArea);

        //call the rectangle method
        returnRectangleArea = rectangle(2.0, 4.0);
        System.out.println("Area of a rectangle = " + returnRectangleArea);

        //call the trapezoid method
        returnTrapezoidArea = trapezoid(2.0, 5.0, 3.0);
        System.out.println("Area of a trapezoid = " + returnTrapezoidArea);

        //call the pentagon method
        returnPentagonArea = pentagon(2.0);
        System.out.println("Area of a pentagon = " + returnPentagonArea);

        //call the hexagon method
        returnHexagonArea = hexagon(7.0);
        System.out.println("Area of a hexagon = " + returnHexagonArea);

        //call the octagon method
        returnOctagonArea = octagon(8.0);
        System.out.println("Area of a octagon = " + returnOctagonArea);

        //call the circle method
        returnCircleArea = circle(9.0);
        System.out.println("Area of a circle = " + returnCircleArea);
    }

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
