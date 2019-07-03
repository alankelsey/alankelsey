//Alan Kelsey
//alankelsey@u.boisestate.edu
//
//looks like I overestimated the assignment :) 


public class Speedometer 
{
    
    double tireCircumference;
    int pulsesPerRotation;
    double pulsesSinceLastClock;
    double calculatedSpeed;

    //Tire circumference in inches
    public void setTireCircumference(double tireCircum )
    {
         tireCircumfrence =  tireCircum ;

    }
    
    //indicates number of pulses per rotation
    public void setPulsesPerRotation(int rotation)
    {
     //   rotation = 32;
         pulsesPerRotation = rotation;
    }
    
    //used to count number magnets passes since last clock signal
    public void pulse()
    {
        double pulseStart = 1.0;
        double pulsesSinceLastRotation = pulseStart++; 
       // double sizeToPulse = tireCircumfrence / 32.0;
         

        
    }
    
    //called once per second and reset to zero after the pulse
    public void clock()
    {
        double clock = 1;
        double pulsesSinceLastClock = clock++;
    }

   //retuns the most recent speed
   //formula take from
    public double getSpeed()
    {
        //get revs per mile based off of tire size
        double inchesPerMile = 63360.0;
        double circumference  = tireCircumference * 3.1415;            
        double revsPerMile =  inchesPerMile / circumference;
        
        //for testing
        //double speed1 = pulsesSinceLastClock * pulsesPerRotation;
        
        //change inches to feet and to miles, then divide by time 
        //***need to convert to mph? 
        double speed = ((revsPerMile / 12)/ 5280) / pulsesSinceLastClock ;
        
        // double speedPerInch = (distance * pulsesSinceLastClock ) ;
        // double inchToFeet = speedPerInch / 12.0 ;
        // double speed = inchToFeet / 5280;
        //double speed = speedPerInch;
        double calculatedSpeed = speed;
              

        return calculatedSpeed;
   }
}
