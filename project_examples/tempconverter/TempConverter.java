/**
 * TempConverter converts a temperature from Fahrenheit
 * to Celsius and Kelvin.
 * 
 * @author Merrill Hall
 * @version 2.0
 */
public class TempConverter {
    // tempC holds the Celsius temperature
    private double tempC;
    // tempF holds the Fahrenheit temperature
    private double tempF;
    // tempK holds the Kelvin temperature
    private double tempK;
    /**
     * Default constructor for objects of class TempConverter,
     * sets the default value of the tempConverter object to
     * 0.0 degrees Fahrenheit
     */
    public TempConverter() {
        // initialise instance variables
        setTempF(0.0);
    }
    /**
     * Second constructor for objects of class TempConverter,
     * sets tempConverter object's Fahrenheit value to the value
     * from tempIn if it's valid (zero if it isn't), and the 
     * other values to their respective equivalents
     */
    public TempConverter(double tempIn) {
        if ( ! setTempF(tempIn))
            setTempF(0.0);
    }

    /**
     * The setTempC method checks if the value is a valid
     * Celsius temperature.  If so, it sets the object's
     * Celsius value, converts to its Fahrenheit and Kelvin
     * equivalents so as to keep all values consistent, and 
     * returns true.  If not, the method returns false.
     * 
     * @param  tempIn The Celsius value to store 
     * @return true if tempIn contains a valid Celsius 
     *              temperature, false otherwise
     */
    public boolean setTempC(double tempIn) {
        // set Celsius value
        if (tempIn < -273.15)
            return false;
        tempC = tempIn;
        // convert to Fahrenheit
        tempF = tempC * 9.0 / 5.0 + 32.0;
        // convert to Kelvin
        tempK = tempC + 273.15;
        return true;
    }
    /**
     * The setTempF method sets the Fahrenheit temperature,
     * then converts it to its Celsius and Kelvin
     * equivalents so as to keep all values consistent.
     * 
     * @param  tempIn The Fahrenheit value to store 
     */
    public boolean setTempF(double tempIn) {
        // set Fahrenheit value
        if (tempIn < -459.67)
            return false;
        tempF = tempIn;
        // convert to Celsius
        tempC = (tempF - 32.0) * 5.0 / 9.0;
        // convert to Kelvin
        tempK = tempC + 273.15;
        return true;
    }
    /**
     * The setTempK method sets the Kelvin temperature,
     * then converts it to its Celsius and Fahrenheit
     * equivalents so as to keep all values consistent.
     * 
     * @param  tempIn The Kelvin value to store 
     */
    public boolean setTempK(double tempIn) {
        // set Kelvin value
        if (tempIn < 0.0)
            return false;
        tempK = tempIn;
        // convert to Celsius
        tempC = tempK - 273.15;
        // convert to Fahrenheit
        tempF = tempC * 9.0 / 5.0 + 32.0;
        return true;
    }
    /**
     * getTempC retrieves the Celsius temperature value
     * 
     * @return A double value containing the Celsius temperature
     */
    public double getTempC() {
        return tempC;
    }
    /**
     * getTempF retrieves the Fahrenheit temperature value
     * 
     * @return A double value containing the Fahrenheit temperature
     */
    public double getTempF() {
        return tempF;
    }
    /**
     * getTempK retrieves the Kelvin temperature value
     * 
     * @return A double value containing the Kelvin temperature
     */
    public double getTempK() {
        return tempK;
    }
}