//Alan Kelsey
//alankelsey@u.boisestate.edu
//
//Main method calls calculations from Area class


public class AreaTester
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
        returnTriangleArea = Area.triangle(2.0, 3.0);
        System.out.println("Area of a triangle = " + returnTriangleArea);
         
        //call the square method
        returnSquareArea = Area.square(2.0);
        System.out.println("Area of a square = " + returnSquareArea);

        //call the rectangle method
        returnRectangleArea = Area.rectangle(2.0, 4.0);
        System.out.println("Area of a rectangle = " + returnRectangleArea);

        //call the trapezoid method
        returnTrapezoidArea = Area.trapezoid(2.0, 5.0, 3.0);
        System.out.println("Area of a trapezoid = " + returnTrapezoidArea);

        //call the pentagon method
        returnPentagonArea = Area.pentagon(2.0);
        System.out.println("Area of a pentagon = " + returnPentagonArea);

        //call the hexagon method
        returnHexagonArea = Area.hexagon(7.0);
        System.out.println("Area of a hexagon = " + returnHexagonArea);

        //call the octagon method
        returnOctagonArea = Area.octagon(8.0);
        System.out.println("Area of a octagon = " + returnOctagonArea);

        //call the circle method
        returnCircleArea = Area.circle(9.0);
        System.out.println("Area of a circle = " + returnCircleArea);
    }


}
