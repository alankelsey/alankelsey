import java.util.Scanner;
/**
 * This will find the radius for a circle
 * 
 * @Alan k 
 * @version 1.0
 */
public class Radius
{
    // THis is the radius of a circle
    private double r;
    
    /**main method as the circle size and uses radius to calc info for display
     * 
     */
    public static void main(String[] args)
    {
        double inputRadius;
        Scanner keyInput = new Scanner(System.in);
        
        System.out.print("Enter the raduis for your circle: ");
        inputRadius = keyInput.nextDouble();
        Radius c = new Radius(inputRadius);
        System.out.println(c.toString());
    }

    /**
     * Constructor for objects of class Raduis
     */
    public Radius(double radius)
    {
        // initialise instance variables
        r = radius;
    }

    /**
     * To String calculates the radius
     * 
     * @Then rerunts them in a string for pinting
     *  
     */
    public String toString()
    {
        // put your code here
        return "The circle's radius is " + r + "\n" +
               "The circle's diameter is " + (2.0 * r) + "\n" +
               "The circle's area is " + (3.14159 * r * r) + "\n" +
               "The surface area of a sphere with the same radius is " + (4.0 * 3.14159 * r * r) + "\n";
    }
}
